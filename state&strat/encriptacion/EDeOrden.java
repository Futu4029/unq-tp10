package encriptacion;

public class EDeOrden implements IEncriptador {

	@Override
	public String encriptar(String texto) {
		String resultado =
				texto.replace("a", "b");
		return resultado;
	}

	public String reemplazar(String texto) {
		return null;
	}
	
	@Override
	public String desencriptar(String texto) {
		return null;
	}

}
