package videoJuego;

public class EstadoSinFichas implements IEstadoDeInicio {

	@Override
	public String iniciarJuego(MaquinaVideoJuego maquina) {
		return "Insert Coin";
	}

}
