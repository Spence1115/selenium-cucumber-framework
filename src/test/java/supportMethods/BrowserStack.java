package supportMethods;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

import testRunner.TestRunner;

public class BrowserStack {
	public static Boolean useBrowserStack() {
		
		return Boolean.valueOf(TestRunner.config.get("useBrowserstack"));
	}
	
	public static void setSeleniumHub() {
		
		String browserstackUsername = TestRunner.config.get("browserstackUsername");
		
		if (browserstackUsername == null) {
			throw new WebDriverException("Browserstack username not set.");
		}
		
		String browserstackPassword = TestRunner.config.get("browserstackPassword");
		
		if (browserstackPassword == null) {
			throw new WebDriverException("Browserstack password not set.");
		}
		
		TestRunner.config.put("seleniumHub", "http://" + browserstackUsername + ":" + browserstackPassword + "@hub.browserstack.com/wd/hub");
	}
	
	public static DesiredCapabilities setBrowserCapabilities() {
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("browserstack.debug", "true");
		caps.setCapability("resolution", TestRunner.config.get("browserstackResolution"));
		
		return caps;
	}
	
	public static DesiredCapabilities setProjectDetails() {
		
		String project = TestRunner.config.get("browserstackProject");
		String build = TestRunner.config.get("browserstackBuild");
		
		DesiredCapabilities caps = new DesiredCapabilities();
		
		caps.setCapability("project", project);
		caps.setCapability("build", build);
		
		return caps;
	}
}
