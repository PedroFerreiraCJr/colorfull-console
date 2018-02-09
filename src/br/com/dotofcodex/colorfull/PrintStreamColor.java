package br.com.dotofcodex.colorfull;

import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamColor extends PrintStream {

	public static final String DEFAULT 		= "\u001b[0m";
	public static final String BLACK 		= "\u001b[30m";
	public static final String RED 			= "\u001b[31m";
	public static final String GREEN 		= "\u001b[32m";
	public static final String YELLOW 		= "\u001b[33m";
	public static final String BLUE 		= "\u001b[34m";
	public static final String MAGENTA 		= "\u001b[35m";
	public static final String CYAN 		= "\u001b[36m";
	public static final String WHITE 		= "\u001b[37m";

	public static final String BACKGROUND_DEFAULT 	= "\u001b[0m";
	public static final String BACKGROUND_BLACK 	= "\u001b[40m";
	public static final String BACKGROUND_RED 		= "\u001b[41m";
	public static final String BACKGROUND_GREEN 	= "\u001b[42m";
	public static final String BACKGROUND_YELLOW 	= "\u001b[43m";
	public static final String BACKGROUND_BLUE 		= "\u001b[44m";
	public static final String BACKGROUND_MAGENTA 	= "\u001b[45m";
	public static final String BACKGROUND_CYAN 		= "\u001b[46m";
	public static final String BACKGROUND_WHITE 	= "\u001b[47m";

	public static final String TEXT_BOLD 		= "\u001b[1m";
	public static final String TEXT_UNDERLINE 	= "\u001b[4m";
	public static final String TEXT_REVERESED 	= "\u001b[7m";
	
	public PrintStreamColor(OutputStream stream) {
		super(stream);
	}

	public void printDefaultColor() {
		print(DEFAULT);
	}

	public void printBlackColor() {
		print(BLACK);
	}

	public void printRedColor() {
		print(RED);
	}

	public void printGreenColor() {
		print(GREEN);
	}

	public void printYellowColor() {
		print(YELLOW);
	}

	public void printMagentaColor() {
		print(MAGENTA);
	}

	public void printCyanColor() {
		print(CYAN);
	}

	public void printWhiteColor() {
		print(WHITE);
	}

	public void printBlackBackground() {
		print(BACKGROUND_BLACK);
	}
	
	public void printRedBackground() {
		print(BACKGROUND_RED);
	}
	
	public void printGreenBackground() {
		print(BACKGROUND_GREEN);
	}

	public void printYellowBackground() {
		print(BACKGROUND_YELLOW);
	}
	
	public void printBlueBackground() {
		print(BACKGROUND_BLUE);
	}
	
	public void printMagentaBackground() {
		print(BACKGROUND_MAGENTA);
	}
	
	public void printCyanBackground() {
		print(BACKGROUND_CYAN);
	}
	
	public void printWhiteBackground() {
		print(BACKGROUND_WHITE);
	}
	
	public void printTextBold() {
		print(TEXT_BOLD);
	}
	
	public void printTextUnderline() {
		print(TEXT_UNDERLINE);
	}
	
	public void printTextReversed() {
		print(TEXT_REVERESED);
	}
}
