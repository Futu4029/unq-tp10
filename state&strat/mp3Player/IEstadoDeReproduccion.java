package mp3Player;

public interface IEstadoDeReproduccion {
	public String play(Song song);
	public String pause(Song song);
	public void stop(Song song);
}
