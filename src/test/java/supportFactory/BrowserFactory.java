package supportFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

import enums.Browser;
import testRunner.TestRunner;

public class BrowserFactory {
	
	static Browser browser = Browser.valueOf(TestRunner.config.get("browser"));
	
	static String desiredBrowserVersion = TestRunner.config.get("browserVersion");

	public static DesiredCapabilities selectBrowser(DesiredCapabilities caps) {
		
		switch (browser) {
		case AmazonKindleFire2:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Amazon Kindle Fire 2");
			break;
		case AmazonKindleFireHD8_9:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Amazon Kindle Fire HD 8.9");
			break;
		case AmazonKindleFireHDX7:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Amazon Kindle Fire HDX 7");
			break;
		case Chrome:
			caps.setCapability("browserName", "chrome");
			break;
		case Edge:
			caps.setCapability("browser", "Edge");
			caps.setCapability("browserstack.ie.enablePopups", "true");
			break;
		case Firefox:
			 caps.setCapability("browserName", "firefox");
			 break;
		case GoogleNexus4:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Google Nexus 4");
			break;
		case GoogleNexus5:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Google Nexus 5");
			break;
		case GoogleNexus7:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Google Nexus 7");
			break;
		case HTCOneM8:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "HTC One M8");
			break;
		case HTCOneX:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "HTC One X");
			break;
		case IE:
			caps.setCapability("browserName", "internet explorer");
			caps.setCapability("browserstack.ie.enablePopups", "true");
			break;
		case MotorolaRazr:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Motorola Razr");
			break;
		case MotorolaRazrMaxxHD:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Motorola Razr Maxx HD");
			break;
		case Opera:
			caps.setCapability("browserName", "opera");
		case Safari:
			caps.setCapability("browserName", "safari");
			break;
		case SamsungGalaxyNote10_1:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy Tab 4 10.1");
			break;
		case SamsungGalaxyNote2:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy Note 2");
			break;
		case SamsungGalaxyNote3:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy Note 3");
			break;
		case SamsungGalaxyS3:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy S3");
			break;
		case SamsungGalaxyS4:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy S4");
			break;
		case SamsungGalaxyS5:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy S5");
			break;
		case SamsungGalaxyS5Mini:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy S5 Mini");
			break;
		case SamsungGalaxyTab3:
			caps.setCapability("browserName", "android");
			caps.setCapability("deviceName", "SamsungGalaxyTab3");
			break;
		case SamsungGalaxyTab410_1:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Samsung Galaxy Tab 4 10.1");
			break;
		case SonyTipo:
			caps.setCapability("browserName", "android");
			caps.setCapability("device", "Sony Xperia Tipo");
			break;
		case iPad4:
			caps.setCapability("browserName", "iPad");
			caps.setCapability("device", "iPad 4th Gen");
			break;
		case iPadAir:
			caps.setCapability("browserName", "iPad");
			caps.setCapability("device", "iPad Air");
			break;
		case iPadMini4:
			caps.setCapability("browserName", "iPad");
			caps.setCapability("device", "iPad Mini 4");
			break;
		case iPadPro:
			caps.setCapability("browserName", "iPad");
			caps.setCapability("device", "iPad Pro");
			break;
		case iPhone5:
			caps.setCapability("browserName", "iPhone");
			caps.setCapability("device", "iPhone 5");
			break;
		case iPhone5S:
			caps.setCapability("browserName", "iPhone");
			caps.setCapability("device", "iPhone 5S");
			break;
		default:
			throw new WebDriverException("No browser specified");
		}
		caps.setCapability("version", desiredBrowserVersion);
		return caps;
	}
	
	public static WebDriver selectLocalBrowser() {
		switch (browser) {
		case Chrome:
			return new ChromeDriver();
		case Firefox:
			return new FirefoxDriver();
		case IE:
			return new InternetExplorerDriver();
		case Opera:
			return new OperaDriver();
		case Safari:
			return new SafariDriver();
		default:
			throw new WebDriverException("No browser specified");
		}
	}
}
