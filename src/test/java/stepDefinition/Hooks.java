package stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import supportMethods.FileRead;
import testRunner.TestRunner;
import webDriver.Driver;

public class Hooks {
	private static Boolean runOnce = false;

	@Before
	public void beforeAll() throws FileNotFoundException, IOException, InterruptedException {
		if (!runOnce) {
			TestRunner.config = FileRead.readProperties();
		}
	}
	
	@Before
	public void before(Scenario scenario) {
		TestRunner.scenario = scenario;
	}

	@After
	public void after(Scenario scenario) {

		if (scenario.isFailed()) {
			Driver.embedScreenshot();
		}
	}

}
