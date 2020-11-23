package videoJuego;

public class EstadoSinglePlayer implements IEstadoDeInicio {

	@Override
	public String iniciarJuego(MaquinaVideoJuego maquina) {
		maquina.iniciarSinglePlayer();
		return "Choose your fighters";
	}

}
