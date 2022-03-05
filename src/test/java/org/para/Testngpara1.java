package org.para;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testngpara1 {

	public static WebDriver driver;
	public static WebElement findElement;

	public WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static void launch(String name) {
		driver.get(name);
	}

	public WebElement locators(String locatortype, String value) {
		if (locatortype.equals("id")) {
			findElement = driver.findElement(By.id(value));
			return findElement;
			
		} else if (locatortype.equals("name")) {
			findElement = driver.findElement(By.name(value));
			return findElement;
			
		} else if (locatortype.equals("xpath")) {
			findElement = driver.findElement(By.xpath(value));
			return findElement;
			
		} else {
			List<WebElement> findElements = driver.findElements(By.tagName(value));
			return (WebElement) findElements;
		}

	}

	public static void textsend(WebElement textuser, String value) {
		findElement.sendKeys(value);

	}

	public static void userlogin(WebElement userlogin) {
		findElement.click();

	}

}
