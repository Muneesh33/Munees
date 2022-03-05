package org.pom;

import org.BaseTesting.Baseclasstesngif2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Companyinfo extends Baseclasstesngif2 {
	
	public Companyinfo() {
	 
		PageFactory.initElements(driver, this);
		
	}

	
	@FindAll({@FindBy(id="email") ,  @FindBy(name="Aakash")})
	private WebElement userName; 

	@FindBys({@FindBy(id="pass"),@FindBy(name="pass")})
	private WebElement passWord;

	@FindBy(name = "login")
	private WebElement login;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	
	

}
