package com.github.marcosws.console;

import com.github.marcosws.console.consts.Escape;
import com.github.marcosws.console.enuns.ForegroundColor;
import com.github.marcosws.console.enuns.ForegroundStyle;


public class ConsoleTextColor {

	public static String textColor(ForegroundColor fColor, String text) {
		return fColor.getForegroundColor()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	public static String textColor(ForegroundColor fColor, ForegroundStyle fStyle, String text) {
		return concatColorsStyles(fColor.getForegroundColor(), fStyle.getForegroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	private static String concatColorsStyles(String...colorsStyles) {
		
		int cont = 0;
		String strColorsStyle = "";
		for(String cs: colorsStyles) {
			cs = cs.replace(Escape.ESC, "").replace("[", "").replace("m", "");
			if(cont == 0)
				strColorsStyle += Escape.ESC.concat("[").concat(cs).concat((colorsStyles.length == 1 ? "m": ";"));
			else if((cont + 1) == colorsStyles.length) 
				strColorsStyle += cs.concat("m");
			else
				strColorsStyle += cs.concat(";");
			cont++;
		}
		return strColorsStyle;
	}

}
