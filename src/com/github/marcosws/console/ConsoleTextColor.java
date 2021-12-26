package com.github.marcosws.console;

import com.github.marcosws.console.consts.Escape;
import com.github.marcosws.console.enuns.BackgroundColor;
import com.github.marcosws.console.enuns.BackgroundStyle;
import com.github.marcosws.console.enuns.ForegroundColor;
import com.github.marcosws.console.enuns.ForegroundStyle;


public class ConsoleTextColor {

	/**
	 * Method: textStyle
	 * @author Marcos - www.github.com/marcosws
	 * @param fStyle
	 * @param text
	 * @return String
	 */
	public static String textStyle(ForegroundStyle fStyle, String text) {
		return fStyle.getForegroundStyle()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param fColor
	 * @param text
	 * @return String
	 */
	public static String textColor(ForegroundColor fColor, String text) {
		return fColor.getForegroundColor()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param bColor
	 * @param text
	 * @return String
	 */
	public static String textColor(BackgroundColor bColor, String text) {
		return bColor.getBackgroundColor()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param fColor
	 * @param fStyle
	 * @param text
	 * @return String
	 */
	public static String textColor(ForegroundColor fColor, ForegroundStyle fStyle, String text) {
		return concatColorsStyles(fColor.getForegroundColor(), fStyle.getForegroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param bColor
	 * @param bStyle
	 * @param text
	 * @return String
	 */
	public static String textColor(BackgroundColor bColor, BackgroundStyle bStyle, String text) {
		return concatColorsStyles(bColor.getBackgroundColor(), bStyle.getBackgroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param fColor
	 * @param bColor
	 * @param text
	 * @return String
	 */
	public static String textColor(ForegroundColor fColor, BackgroundColor bColor, String text) {
		return concatColorsStyles(bColor.getBackgroundColor(), fColor.getForegroundColor())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor
	 * @author Marcos - www.github.com/marcosws
	 * @param fColor
	 * @param bColor
	 * @param bStyle
	 * @param text
	 * @return String
	 */
	public static String textColor(ForegroundColor fColor, BackgroundColor bColor, BackgroundStyle bStyle, String text) {
		return concatColorsStyles(bColor.getBackgroundColor(), fColor.getForegroundColor(), bStyle.getBackgroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Private Method: concatColorsStyles
	 * @author Marcos - www.github.com/marcosws
	 * @param colorsStyles
	 * @return String
	 */
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
