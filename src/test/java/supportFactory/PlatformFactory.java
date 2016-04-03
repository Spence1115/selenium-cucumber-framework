package supportFactory;

import enums.Platform;
import testRunner.TestRunner;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.remote.DesiredCapabilities;

public class PlatformFactory {
	
	static Platform platform = Platform.valueOf(TestRunner.config.get("platform"));
	
	static String desiredPlatformVersion = TestRunner.config.get("platformVersion");
	
	public static DesiredCapabilities selectPlatform(DesiredCapabilities caps) {
		
		switch (platform) {
		case Android:
			caps.setCapability("platform", "ANDROID");
			caps.setCapability("deviceOrientation", "landscape");
			break;
		case OSX:
			caps.setCapability("os", "OS X");
			caps.setPlatform(org.openqa.selenium.Platform.MAC);
			break;
		case Windows:
			caps.setCapability("os", "Windows");
			caps.setPlatform(org.openqa.selenium.Platform.WINDOWS);
			break;
		case iOS:
			caps.setCapability("platform", "MAC");
			caps.setCapability("deviceOrientation", "landscape");
			break;
		case Ubuntu:
			caps.setCapability("os", "Ubuntu");
			caps.setPlatform(org.openqa.selenium.Platform.LINUX);
			break;
		default:
			throw new WebDriverException("No platform specified");	
		}
		
		caps.setCapability("os_version", desiredPlatformVersion);
		
		return caps;
	}

	
}
