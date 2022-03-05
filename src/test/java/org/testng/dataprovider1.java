package org.testng;

import java.io.FileInputStream;
import java.io.IOException;

import org.BaseTesting.Baseclasstestingif;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.stdDSA;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class dataprovider1 extends Baseclasstestingif {
	
	@Test(dataProvider ="Mydata")

	private void tc01(String Username, String Password) {
		getdriver();
		launch("https://www.facebook.com/");
		WebElement textuser = locators("id", "email");
		textsend(textuser,Username);
		WebElement textpass = locators("id","pass");
		textsend(textpass,Password);
		WebElement loginbutton = locators("name","login");
		buttonclick();
	
	}
	
	private void buttonclick() {
		// TODO Auto-generated method stub
		
	}

	@DataProvider (name = "Mydata")
	@Test()
	public Object[][] getdata() {
		return new Object[][] {
};

	}
}