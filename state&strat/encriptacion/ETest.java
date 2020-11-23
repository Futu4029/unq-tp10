package encriptacion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ETest {
	EDeOrden e0;
	ENumerico e1;
	EncriptadorNaive sut;
	String texto;
	String textoEncriptadoDeOrden;
	String textoEncriptadoNumerico;

	@BeforeEach
	void setUp() {
		e0 = new EDeOrden();
		e1 = new ENumerico();
		sut = new EncriptadorNaive(e0);
		texto = "Hola mundo";
		textoEncriptadoDeOrden = "Hule mandu";
		textoEncriptadoNumerico = "8,16,12,1,0,13,22,14,4,16";
	}
	
	@Test
	void testEncriptadorDeOrden() {
		assertEquals(textoEncriptadoDeOrden, sut.encriptar(texto));
	}
	
	@Test
	void testDesencriptadorDeOrden() {
		assertEquals(texto, sut.encriptar(textoEncriptadoDeOrden));
	}
	
	@Test
	void testEncriptadorNumerico() {
		sut.setEstrategia(e1);
		assertEquals(textoEncriptadoNumerico, sut.encriptar(texto));
	}
	
	@Test
	void testDesencriptadorNumerico() {
		sut.setEstrategia(e1);
		assertEquals(texto, sut.encriptar(textoEncriptadoNumerico));
	}

}
