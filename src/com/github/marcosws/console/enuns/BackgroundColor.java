package com.github.marcosws.console.enuns;

public enum BackgroundColor {
	
	BLACK("Esc[40m"),
	RED("Esc[41m"),
	GREEN("Esc[42m"),
	YELLOW("Esc[43m"),
	BLUE("Esc[44m"),
	MAGENTA("Esc[45m"),
	CYAN("Esc[46m"),
	GRAY_LIGHT("Esc[47m"),
	GRAY("Esc[100m"),
	RED_LIGHT("Esc[101m"),
	GREEN_LIGHT("Esc[102m"),
	YELLOW_LIGHT("Esc[103m"),
	BLUE_LIGHT("Esc[104m"),
	MAGENTA_LIGHT("Esc[105m"),
	CYAN_LIGHT("Esc[106m"),
	WHITE("Esc[107m");
	
	private String color;
	
	BackgroundColor(String color){
		this.color = color;
	}
	
	public String getBackgroundColor() {
		return color;
	}
}