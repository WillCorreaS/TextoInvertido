package controller;

public class TextoController {
	
	
	public TextoController() {
		super();
	}

	public String textoInvertido(String palavra, int length) {
		if(length == 0) {
			return "";
			}
			return palavra.substring(length-1, length)+textoInvertido(palavra, length - 1);
	}

}