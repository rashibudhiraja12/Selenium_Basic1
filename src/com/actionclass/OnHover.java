package com.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class OnHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   String baseUrl = "http://demo.guru99.com/test/newtours/";
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			WebDriver wd = new ChromeDriver();
			wd.get(baseUrl);
		    WebElement link_Home = wd.findElement(By.linkText("Home"));
		    WebElement td_Home = wd.findElement(By.xpath("//a[text()=\"Home\"]/../../.."));
		    Actions builder = new Actions(wd);
		    Action mouseOverHome = builder.moveToElement(link_Home).build();
		    Thread.sleep(5000);
            mouseOverHome.perform();        

		    
	}

}
