package org.cross;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

// To access the 2browser are more than at parallel time to using parallel method in both testng.xml file
//In testng xml we call both class method (crossbrowser 1 @ crossbrowser2)
// Run the both class in testng suite level

public class Crossbrowser2 {
	
	@Parameters("browser")
	@Test
	private void tc01(String browser) {
		if (browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		} if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://twitter.com/?lang=en-in");
		}
		else {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.myntra.com/");
			
		}
			
		
	}

}
