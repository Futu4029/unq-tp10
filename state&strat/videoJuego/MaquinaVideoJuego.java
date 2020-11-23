package videoJuego;

public class MaquinaVideoJuego {
	private IEstadoDeInicio estadoDeInicio;
	private int fichas = 0;
	
	public MaquinaVideoJuego() {
		super();
		this.seleccionarModo();
	}
	
	public String startButton() {
		this.setEstadoDeInicio(this.seleccionarModo());
		return getEstadoDeInicio().iniciarJuego(this);
	}
	
	public IEstadoDeInicio seleccionarModo() {
		IEstadoDeInicio resultado = (getFichas() == 0) ? new EstadoSinFichas():
									(getFichas() == 1) ? new EstadoSinglePlayer():
													new EstadoMultiPlayer();
		return resultado;
	}
	
	public void iniciarSinglePlayer() {}
	public void iniciarMultiPlayer() {}

	public IEstadoDeInicio getEstadoDeInicio() {
		return estadoDeInicio;
	}

	public void setEstadoDeInicio(IEstadoDeInicio estadoDeInicio) {
		this.estadoDeInicio = estadoDeInicio;
	}

	public int getFichas() {
		return fichas;
	}

	public void agregarFicha() {
		this.fichas = this.fichas+1;
	}
}
