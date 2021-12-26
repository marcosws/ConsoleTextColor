package com.github.marcosws.console.enuns;

public enum BackgroundColor {
	
	BLACK("\u001B[40m"),
	RED("\u001B[41m"),
	GREEN("\u001B[42m"),
	YELLOW("\u001B[43m"),
	BLUE("\u001B[44m"),
	MAGENTA("\u001B[45m"),
	CYAN("\u001B[46m"),
	GRAY_LIGHT("\u001B[47m"),
	GRAY("\u001B[100m"),
	RED_LIGHT("\u001B[101m"),
	GREEN_LIGHT("\u001B[102m"),
	YELLOW_LIGHT("\u001B[103m"),
	BLUE_LIGHT("\u001B[104m"),
	MAGENTA_LIGHT("\u001B[105m"),
	CYAN_LIGHT("\u001B[106m"),
	WHITE("\u001B[107m");
	
	private String color;
	
	BackgroundColor(String color){
		this.color = color;
	}
	
	public String getBackgroundColor() {
		return color;
	}
}