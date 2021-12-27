package com.github.marcosws.console;

import com.github.marcosws.console.constants.Escape;
import com.github.marcosws.console.enums.BackgroundColor;
import com.github.marcosws.console.enums.BackgroundStyle;
import com.github.marcosws.console.enums.ForegroundColor;
import com.github.marcosws.console.enums.ForegroundStyle;

/**
 * Class: ConsoleTextColor - Format font color and style in console
 * @author Marcos Souza - www.github.com/marcosws
 * Data: 26/12/2021
 * References:
 * https://ss64.com/nt/syntax-ansi.html - How-to: Use ANSI colors in the terminal
 * https://github.com/mlocati - https://gist.github.com/mlocati/fdabcaeb8071d5c75a2d51712db24011#file-win10colors-cmd
 * https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
 */
public class ConsoleTextColor {

	/**
	 * Method: textStyle(ForegroundStyle foregroundStyle, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param foregroundStyle - enum: ForegroundStyle 
	 * @param text - String
	 * @return String : {esc}{code style}{text}{reset code}
	 */
	public static String textStyle(ForegroundStyle foregroundStyle, String text) {
		return foregroundStyle.getForegroundStyle()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(ForegroundColor foregroundColor, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param foregroundColor - enum: ForegroundColor
	 * @param text - String
	 * @return String : {esc}{code color}{text}{reset code}
	 */
	public static String textColor(ForegroundColor foregroundColor, String text) {
		return foregroundColor.getForegroundColor()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(BackgroundColor backgroundColor, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param backgroundColor - enum: BackgroundColor
	 * @param text
	 * @return String : {esc}{code color}{text}{reset code}
	 */
	public static String textColor(BackgroundColor backgroundColor, String text) {
		return backgroundColor.getBackgroundColor()
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(ForegroundColor foregroundColor, ForegroundStyle foregroundStyle, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param foregroundColor - enum: ForegroundColor
	 * @param foregroundStyle - enum: ForegroundStyle
	 * @param text - String
	 * @return String : {esc}{code color/style}{text}{reset code}
	 */
	public static String textColor(ForegroundColor foregroundColor, ForegroundStyle foregroundStyle, String text) {
		return concatColorsStyles(foregroundColor.getForegroundColor(), foregroundStyle.getForegroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(BackgroundColor backgroundColor, BackgroundStyle backgroundStyle, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param backgroundColor - enum: BackgroundColor
	 * @param backgroundStyle - enum: BackgroundStyle
	 * @param text - String
	 * @return String : {esc}{code color/style}{text}{reset code}
	 */
	public static String textColor(BackgroundColor backgroundColor, BackgroundStyle backgroundStyle, String text) {
		return concatColorsStyles(backgroundColor.getBackgroundColor(), backgroundStyle.getBackgroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(ForegroundColor foregroundColor, BackgroundColor backgroundColor, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param foregroundColor - enum: ForegroundColor
	 * @param backgroundColor - enum: BackgroundColor
	 * @param text - String
	 * @return String : {esc}{code color}{text}{reset code}
	 */
	public static String textColor(ForegroundColor foregroundColor, BackgroundColor backgroundColor, String text) {
		return concatColorsStyles(backgroundColor.getBackgroundColor(), foregroundColor.getForegroundColor())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Method: textColor(ForegroundColor foregroundColor, BackgroundColor backgroundColor, BackgroundStyle backgroundStyle, String text)
	 * @author Marcos Souza - www.github.com/marcosws
	 * @param foregroundColor - enum: ForegroundColor
	 * @param backgroundColor - enum: BackgroundColo
	 * @param backgroundStyle - enum: BackgroundStyle
	 * @param text - String
	 * @return String : {esc}{code color/style}{text}{reset code}
	 */
	public static String textColor(ForegroundColor foregroundColor, BackgroundColor backgroundColor, BackgroundStyle backgroundStyle, String text) {
		return concatColorsStyles(backgroundColor.getBackgroundColor(), foregroundColor.getForegroundColor(), backgroundStyle.getBackgroundStyle())
				.concat(text)
				.concat(Escape.RESET);
	}
	
	/**
	 * Private Method: concatColorsStyles(String...colorsStyles)
	 * @author Marcos Souza - www.github.com/marcosws
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
