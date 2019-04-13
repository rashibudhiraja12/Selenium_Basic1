package com.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d314195\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://google.com");
		WebElement google_wd=wd.findElement(By.xpath("//input[@name = \"q\"]"));
		google_wd.sendKeys("Ebay.com");
		google_wd.sendKeys(Keys.ENTER);
		

	}

}
