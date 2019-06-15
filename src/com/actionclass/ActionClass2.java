package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL="https://www.facebook.com";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get(baseURL);
		WebElement userName = wd.findElement(By.id("email"));
		Actions builder = new Actions(wd);
		Action seriesOfAction = builder.moveToElement(userName).click().keyDown(Keys.LEFT_SHIFT).sendKeys("jatin").keyUp(Keys.LEFT_SHIFT).doubleClick(userName).contextClick().build();
		seriesOfAction.perform();

	}

}
