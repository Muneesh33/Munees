package org.BaseTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseclassTesting {

	public static WebDriver driver;
	public static WebElement findElement;

	public static WebDriver getdriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}

	public static void launch(String name) {
		driver.get(name);

	}

	public static WebElement id(String idvalue) {
		findElement = driver.findElement(By.id(idvalue));
		return findElement;
	}

	public static WebElement name(String namevalue) {
		findElement = driver.findElement(By.name(namevalue));
		return findElement;
	}

	public static WebElement xpath(String xpathvalue) {
		findElement = driver.findElement(By.xpath(xpathvalue));
		return findElement;

	}

	public static void textsend(String value) {
		findElement.sendKeys(value);

	}

	public static void buttonclick() {
		findElement.click();

	}

}
