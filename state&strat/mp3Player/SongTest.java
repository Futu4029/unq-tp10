package mp3Player;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SongTest {
	Song macarena;
	SeleccionDeCanciones e0;
	EnReproduccion e1;
	EnPausa e2;
	
	@BeforeEach
	void setUp() {
		macarena = new Song("Macarena");
		e0 = SeleccionDeCanciones.getEstado();
		e1 = EnReproduccion.getEstado();
		e2 = EnPausa.getEstado();
	}
	// por defecto la cancion esta en modo selección de canciones
	@Test
	void playButtonEnSeleccion() {
		macarena.play();
		assertEquals(e1, macarena.getEstadoReproduccion());
	}

	@Test
	void playButtonEnOtroEstado() {
		String exception = "Error, vuelva al menu de selección o presione pausa";
		macarena.setEstadoReproduccion(e1);
		assertEquals(exception, macarena.play());
		macarena.setEstadoReproduccion(e2);
		assertEquals(exception, macarena.play());
	}

	@Test
	void stopButtonEnSeleccion() {
		assertEquals(e0, macarena.getEstadoReproduccion());
		macarena.stop();
		assertEquals(e0, macarena.getEstadoReproduccion());
	}

	@Test
	void stopButtonEnReproduccionOPausa() {
		macarena.setEstadoReproduccion(e1);
		macarena.stop();
		assertEquals(e0, macarena.getEstadoReproduccion());
		macarena.setEstadoReproduccion(e2);
		macarena.stop();
		assertEquals(e0, macarena.getEstadoReproduccion());
	}

	@Test
	void pauseButtonEnSeleccion() {
		String exception = "Error, seleccione una cancion primero";
		assertEquals(exception, (macarena.pause()));
	}

	@Test
	void pauseButtonEnReproduccion() {
		macarena.setEstadoReproduccion(e1);
		macarena.pause();
		assertEquals(e2, macarena.getEstadoReproduccion());
	}

	@Test
	void pauseButtonEnPausa() {
		macarena.setEstadoReproduccion(e2);
		macarena.pause();
		assertEquals(e1, macarena.getEstadoReproduccion());
	}
}
