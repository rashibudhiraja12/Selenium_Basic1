package com.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d314195\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		// Open a particular URL:
		wd.get("https://www.google.com"); // g
		WebElement searchBox = wd.findElement(By.xpath("//input[@name=\"q\"]"));
		searchBox.sendKeys("Test Automation Academy");
		searchBox.sendKeys(Keys.ENTER);
	}

}
