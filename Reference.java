package com.javaprac.example.basic;

public class Reference {
	private int number;
	private String text;

	Reference(String text,int number) {
		this.text=text;
		this.number=number;
	}

	public String getText() {
		return text;
	}
	public int getNumber() {
	
		return number;
	}

}
