package encriptacion;

public class EncriptadorNaive {
	private IEncriptador estrategia;
	
	public EncriptadorNaive(IEncriptador estrategia) {
		super();
	}
	
	public String encriptar(String texto) {
		return getEstrategia().encriptar(texto);
	}
	
	public String desencriptar(String texto) {
		return getEstrategia().desencriptar(texto);
	}

	public IEncriptador getEstrategia() {
		return estrategia;
	}

	public void setEstrategia(IEncriptador estrategia) {
		this.estrategia = estrategia;
	}
	
}
