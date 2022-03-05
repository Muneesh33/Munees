package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng2 {
	
	@BeforeClass
	private void tc01() {
		System.out.println("Test01");

	}

	@Test
	private void tc02() {
		System.out.println("Test02");

	}

	@BeforeMethod
	private void tc03() {
		System.out.println("Test03");
	}

	@AfterClass
	private void tc04() {
		System.out.println("Test04");
	}
	@AfterMethod
	private void tc05() {
		System.out.println("Test05");
	}
}
