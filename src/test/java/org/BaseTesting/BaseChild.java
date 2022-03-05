package org.BaseTesting;

public class BaseChild extends BaseclassTesting {
	public static void main(String[] args) {
		
		getdriver();
		launch("https://www.facebook.com/");
		id("email");
		textsend("muneesh33@gmail.com");
		id("pass");
		textsend("454666");
		name("login");
		buttonclick();
		
		
		
		
		
	}

}



