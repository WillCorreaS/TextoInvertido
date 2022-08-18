package view;

import controller.TextoController;

public class Principal {
	
	public static void main(String[] args) {
		TextoController m = new TextoController();

		textoInvertido(m);
	}

	public static void textoInvertido(TextoController m) {
		String palavra = "main321";
		
		String resultado = m.textoInvertido(palavra, palavra.length());
		System.out.println(resultado);
	}

}

