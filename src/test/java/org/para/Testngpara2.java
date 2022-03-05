package org.para;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngpara2 extends Testngpara1 {

	@Parameters({ "username", "password", "location", "hotels", })

	@Test
	private void tc01(String username, String Password, String location, String hotels) {

		getdriver();
		launch("https://adactinhotelapp.com/");

		WebElement textuser = locators("id", "username");
		textsend(textuser, username);

		WebElement textpass = locators("id", "password");
		textsend(textpass, Password);

		WebElement userlogin = locators("name", "login");
		userlogin(userlogin);

		WebElement userlocation = locators("id", "location");
		textsend(userlocation, location);

		WebElement hotelname = locators("id", "hotels");
		textsend(hotelname, "Hotel Sunshine");
	}

	@Parameters({ "room_type", "room_nos", "datepick_in", "datepick_out" })
	@Test
	private void tc02(String room_type, String room_nos, String datepick_in, String datepick_out) {

		WebElement roomtype = locators("id", "room_type");
		textsend(roomtype, "Double");
		
		WebElement numroom = locators("name", "room_nos");
		textsend(numroom, "3");

		WebElement dateboxin = locators("name", "datepick_in");
		textsend(dateboxin, "26/02/2022");

		WebElement dateboxout = locators("name", "datepick_out");
		textsend(dateboxout, "27/02/2022");
	}

	@Parameters({ "adult_room", "child_room", "radiobutton_0",})
	@Test
	private void tc03(String adult_room, String child_room, String radiobutton_0) {

		WebElement adroom = locators("id", "adult_room");
		textsend(adroom, "4");

		WebElement Childroom = locators("id", "child_room");
		textsend(Childroom, "2");

		WebElement searchnext = locators("name", "Submit");
		userlogin(searchnext);
		
		 WebElement clickok = locators("id","radiobutton_0");
		 textsend(clickok, "0");
		 
		 WebElement continueuser1 = locators("name", "continue");
		 userlogin(continueuser1);

	}
	
	
	
}

