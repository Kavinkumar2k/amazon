package org.stepdefination;

import cucumber.api.java.en.When;

public class amazoncu extends baseclass{
	
	pojo p;
	@When("To click the login button")
	public void toClickTheLoginButton() {
		launchBrowser();
		launchurl("https://www.amazon.in");
		p=new pojo();
		clickBtn(p.getClick());
	   
	}

	@When("To pass the email id into the kavin@gmail.com mailid field")
	public void toPassTheEmailIdIntoTheKavinGmailComMailidField(String email) {
	    passText(email, p.getEmail());
	}

	@When("To press the continue button")
	public void toPressTheContinueButton() {
		clickBtn(p.getSubmit());
	   
	}


}
