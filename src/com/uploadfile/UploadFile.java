package com.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseURL = "http://demo.guru99.com/test/upload/";
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get(baseURL);
		WebElement uploadBox=wd.findElement(By.id("uploadfile_0"));
		uploadBox.sendKeys("C:\\Users\\jatin\\Downloads\\My Downloads\\TestAutomationAcademy.in1\\TestAutomationAcademy.in1-02.jpg");
		wd.findElement(By.id("terms")).click();
		wd.findElement(By.id("submitbutton")).click();
		System.out.println(wd.findElement(By.xpath("//div/h3/center/br/")).getText());
	}

}
