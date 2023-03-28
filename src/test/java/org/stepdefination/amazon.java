package org.stepdefination;
import cucumber.api.java.After;
import cucumber.api.java.Before;
public class amazon extends baseclass{
	@Before
	private void precondition() {
		launchBrowser();
		windowmaximize();	
	}
	@After
	private void postcondition() {
		closeEntireBrowser();
	}
}
