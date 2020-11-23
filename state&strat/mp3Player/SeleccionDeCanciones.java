package mp3Player;

public class SeleccionDeCanciones implements IEstadoDeReproduccion {
	
	private static SeleccionDeCanciones seleccionDeCanciones;
	private SeleccionDeCanciones() {}
	
	public static SeleccionDeCanciones getEstado() {
		if (seleccionDeCanciones == null) {
			seleccionDeCanciones = new SeleccionDeCanciones();
		}
		return seleccionDeCanciones;
	}
	
	@Override
	public String play(Song song){
		song.setEstadoReproduccion(EnReproduccion.getEstado());
		return "Reproduciendo "+song.getNombre();
	}

	@Override
	public String pause(Song song) {
		return "Error, seleccione una cancion primero";
	}

	@Override
	public void stop(Song song) {}

}
