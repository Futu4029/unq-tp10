package videoJuego;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class estadosTest {
	MaquinaVideoJuego kof98;
	EstadoSinFichas e0;
	EstadoSinglePlayer e1;
	EstadoMultiPlayer e2;
	
	
	@BeforeEach
	void setUp() {
		e0 = new EstadoSinFichas();
		e1 = new EstadoSinglePlayer();
		e2 = new EstadoMultiPlayer();
		kof98 = new MaquinaVideoJuego();
		
	}
	@Test
	void inicioSinFichas() {
		String resultado = "Insert Coin";
		assertEquals(resultado, kof98.startButton());
	}
	
	@Test
	void inicioSinglePlayer() {
		kof98.agregarFicha();
		String resultado = "Choose your fighters";
		assertEquals(resultado, kof98.startButton());
	}
	
	@Test
	void inicioMultiPlayer() {
		kof98.agregarFicha();
		kof98.agregarFicha();
		String resultado = "Here comes a new challenger";
		assertEquals(resultado, kof98.startButton());
	}

}
