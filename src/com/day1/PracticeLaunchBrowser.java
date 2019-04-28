package com.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d314195\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://facebook.com");
		
		String displayURL = wd.getCurrentUrl();
		System.out.println(displayURL);		
		
		/*
		 * wd.navigate().to("https://google.com"); String displaySecondURL =
		 * wd.getCurrentUrl(); System.out.println(displaySecondURL);
		 * wd.navigate().back();
		 */
		
		WebElement username = wd.findElement(By.xpath("//input[@type='email'] | //input[@type='phone']"));
		WebElement password = wd.findElement(By.xpath("//input[@type='password']"));
		
		username.sendKeys("r.budhiraja26@gmail.com");
		password.sendKeys("abc123");	
		
		/*
		 * WebElement sub = wd.findElement(By.xpath("//input[@value='Log In']"));
		 * sub.click();
		 */
		
		password.sendKeys(Keys.ENTER);
		// wd.wait(10000);
		Thread.sleep(10000);
		wd.quit();
	}

}
