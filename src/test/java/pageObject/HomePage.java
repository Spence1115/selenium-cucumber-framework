package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import webDriver.Driver;

public class HomePage {

	static WebDriver driver = Driver.getCurrentDriver();

	public static WebElement searchField() {
		return driver.findElement(By.className("gsfi"));
	}

	public static String searchResultsTitle() {
		return driver.getTitle();
	}
}
