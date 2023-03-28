package org.stepdefination;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojo extends baseclass{
	public pojo() {
		PageFactory.initElements(driver, this);		
	}
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	private WebElement click;
	@FindBy(name = "email")
	private WebElement email;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getClick() {
		return click;
	}
	public WebElement getEmail() {
		return email;
	}
}
