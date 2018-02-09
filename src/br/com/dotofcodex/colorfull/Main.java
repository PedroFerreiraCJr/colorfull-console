package br.com.dotofcodex.colorfull;

public class Main {

	public static void main(String[] args) {

		PrintStreamColor out = new PrintStreamColor(System.out);
		out.printGreenBackground();
		out.printWhiteColor();
		out.printTextBold();
		out.print("Pedro Ferreira");
		out.printDefaultColor();
		out.println();
		out.close();
	}

}
