package mp3Player;

public class EnPausa implements IEstadoDeReproduccion {
	
	private static EnPausa enPausa;
	private EnPausa() {}
	
	public static EnPausa getEstado() {
		if (enPausa == null) {
			enPausa = new EnPausa();
		}
		return enPausa;
	}
	
	@Override
	public String play(Song song) {
		return "Error, vuelva al menu de selección o presione pausa";
	}

	@Override
	public String pause(Song song) {
		song.setEstadoReproduccion(EnReproduccion.getEstado());
		return "Reproduciendo "+song.getNombre();

	}

	@Override
	public void stop(Song song) {
		song.setEstadoReproduccion(SeleccionDeCanciones.getEstado());

	}

}
