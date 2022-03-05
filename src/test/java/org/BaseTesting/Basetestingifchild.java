package org.BaseTesting;

import org.testng.annotations.Test;

public class Basetestingifchild extends Baseclasstesngif2 {

	@Test
	private void tc03() {
		
		getdriver();
		launch("https://www.facebook.com/");
		locators("id", "email");
		textsend("muneeshmaha33@gmail.com");
		locators("id","pass");
		textsend("352666");
		locators("xpath", "//button[text()='Log In']");
		buttonclick();
	}
}
