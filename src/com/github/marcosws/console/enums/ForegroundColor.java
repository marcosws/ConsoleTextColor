package com.github.marcosws.console.enums;

public enum ForegroundColor {

	BLACK("\u001B[30m"),
	RED("\u001B[31m"),
	GREEN("\u001B[32m"),
	YELLOW("\u001B[33m"),
	BLUE("\u001B[34m"),
	MAGENTA("\u001B[35m"),
	CYAN("\u001B[36m"),
	GRAY_LIGHT("\u001B[37m"),
	GRAY("\u001B[90m"),
	RED_LIGHT("\u001B[91m"),
	GREEN_LIGHT("\u001B[92m"),
	YELLOW_LIGHT("\u001B[93m"),
	BLUE_LIGHT("\u001B[94m"),
	MAGENTA_LIGHT("\u001B[95m"),
	CYAN_LIGHT("\u001B[96m"),
	WHITE("\u001B[97m");
	
	private String color;
	
	ForegroundColor(String color){
		this.color = color;
	}
	
	/**
	 * Method: getForegroundColor()
	 * @return String - {ESC}{code color}
	 */
	public String getForegroundColor() {
		return color;
	}
	
}
