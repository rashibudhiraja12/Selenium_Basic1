package com.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaxtAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver wd = new ChromeDriver();
		wd.get("http://testautomationacademy.in/taxi/");

		WebElement nameTextBox = wd.findElement(By.name("name"));
		nameTextBox.sendKeys("Rashi");

		// Q:why xpath is the worst approach to find an element in selenium
		//----- Add here: 
		
		
		WebElement nameTextBox_xpath = wd.findElement(By.xpath("//input[@name='name']"));
		nameTextBox_xpath.sendKeys("Budhiraja");

	}

}
