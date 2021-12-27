package com.github.marcosws.console.enums;

public enum BackgroundStyle {
	
	REGULAR("\u001B[0m"),
	BOLD("\u001B[1m"),
	UNDERLINE("\u001B[4m");
	
	private String style;
	
	BackgroundStyle(String style){
		this.style = style;
	}
	
	/**
	 * Method: getBackgroundStyle()
	 * @return String - {ESC}{code style}
	 */
	public String getBackgroundStyle() {
		return style;
	}

}
