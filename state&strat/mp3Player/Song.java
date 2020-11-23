package mp3Player;

public class Song {
	private IEstadoDeReproduccion estadoReproduccion;
	private String nombre;
	
	public Song(String nombre) {
		super();
		this.setNombre(nombre);
		this.setEstadoReproduccion(SeleccionDeCanciones.getEstado());
	}

	public IEstadoDeReproduccion getEstadoReproduccion() {
		return estadoReproduccion;
	}

	public void setEstadoReproduccion(IEstadoDeReproduccion estadoReproduccion) {
		this.estadoReproduccion = estadoReproduccion;
	}
	
	public String play() {
		return estadoReproduccion.play(this);
	}
	
	public String pause(){
		return estadoReproduccion.pause(this);
	}
	
	public void stop() {
		estadoReproduccion.stop(this);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
