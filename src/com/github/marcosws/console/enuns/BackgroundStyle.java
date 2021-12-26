package com.github.marcosws.console.enuns;

public enum BackgroundStyle {
	
	REGULAR("\u001B[0m"),
	BOLD("\u001B[1m"),
	UNDERLINE("\u001B[4m");
	
	private String style;
	
	BackgroundStyle(String style){
		this.style = style;
	}
	
	public String getBackgroundStyle() {
		return style;
	}

}
