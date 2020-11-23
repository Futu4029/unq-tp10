package videoJuego;

public class EstadoMultiPlayer implements IEstadoDeInicio {

	@Override
	public String iniciarJuego(MaquinaVideoJuego maquina) {
		maquina.iniciarMultiPlayer();
		return "Here comes a new challenger";
	}

}
