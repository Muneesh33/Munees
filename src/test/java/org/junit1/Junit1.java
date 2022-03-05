package org.junit1;

import org.BaseTesting.BaseclassTesting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class Junit1 extends BaseclassTesting {

	@BeforeClass
	public static void tn1() {
		getdriver();
		launch("https://www.facebook.com/");

	}

	public String name;

	@Before
	public void tn2() {
		id("email");
	
	}

	@Test
	public void tn3() {
		textsend("muneeshmaha33@gmail.com");
	
	}

	@Test
	public void tn4() {
		id("pass");
	}

	@Test
	public void tn5() {
		textsend("kdfkkk");
	}
	@After
	public void tn6() {
		name("login");

	}
	@AfterClass
	public static void tn7() {
		buttonclick();

	}
	
}
