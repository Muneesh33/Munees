package org.pom;


import org.BaseTesting.Baseclasstesngif2;
import org.openqa.selenium.WebElement;

public class Pom1 extends Baseclasstesngif2 {
	
	public static void main(String[] args) throws InterruptedException  {
		getdriver();
		launch("https://www.facebook.com/");
		Companyinfo c = new Companyinfo();
		WebElement textUser = c.getUserName();
	    textUser.sendKeys(":lkjhgfdsf");
		driver.navigate().refresh();
		textUser.sendKeys("poiuytfdrsay");
		WebElement textPass = c.getPassWord();
		textPass.sendKeys("8765432567543");
		WebElement login = c.getLogin();
		login.click();
		
	}
	
	

}
