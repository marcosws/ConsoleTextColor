package com.github.marcosws.console.enums;

public enum ForegroundStyle {
	
	REGULAR("\u001B[0m"),
	BOLD("\u001B[1m"),
	UNDERLINE("\u001B[4m"),
	INVERSE("\u001B[7m");
	
	private String style;
	
	ForegroundStyle(String style){
		this.style = style;
	}
	
	/**
	 * Method: getForegroundStyle()
	 * @return String - {ESC}{code style}
	 */
	public String getForegroundStyle() {
		return style;
	}

}
