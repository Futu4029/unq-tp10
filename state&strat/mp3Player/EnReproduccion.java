package mp3Player;

public class EnReproduccion implements IEstadoDeReproduccion {

	
	private static EnReproduccion enReproduccion;
	private EnReproduccion() {}
	
	public static EnReproduccion getEstado() {
		if (enReproduccion == null) {
			enReproduccion = new EnReproduccion();
		}
		return enReproduccion;
	}
	
	
	@Override
	public String play(Song song) {
		return "Error, vuelva al menu de selección o presione pausa";
	}

	@Override
	public String pause(Song song) {
			song.setEstadoReproduccion(EnPausa.getEstado());
			return "Pausando "+song.getNombre();
	}

	@Override
	public void stop(Song song) {
		song.setEstadoReproduccion(SeleccionDeCanciones.getEstado());

	}

}
