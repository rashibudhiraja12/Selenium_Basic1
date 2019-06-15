package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseURL = "http://demo.guru99.com/test/delete_customer.php";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(baseURL);
		wd.findElement(By.name("submit")).click();
		Alert alert = wd.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(alert.getText());
		alert.accept();

	}

}
