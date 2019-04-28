package com.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaxiAutomation {
/* Line 20 - Hardcoding can be removed here
 * Create the 'driver' folder in the Eclipse Project and copy the chrome driver exe in that. 
 * System.getProperty("user.dir") - returns the exact path where the eclipse project is located on ones local machine.  
 * Line 21 - Concatinating the User dir path with driver folder. 
 * Advantages  of thsi approach is - dynamic creation of chrome driver path and no user needs to set up/download chrome driver.exe * 
 * 
 * 
 */
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("user.dir"));
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(
		System.getProperty("user.dir")+"\\src\\com\\config\\config.properties");
		prop.load(ip);
		wd.get(prop.getProperty("URL"));
				
		wd.manage().window().maximize();

		WebElement nameTextBox = wd.findElement(By.name("name"));
		nameTextBox.sendKeys("Rashi");
		nameTextBox.sendKeys(Keys.SPACE);

		// Q:why xpath is the worst approach to find an element in selenium
		//----- Xpath is slower than other methods as it scans the whole page before finding the specific element.
		
		WebElement nameTextBox_xpath = wd.findElement(By.xpath("//input[@name='name']"));
		nameTextBox_xpath.sendKeys("Budhiraja");

		WebElement emailTextBox_xpath = wd.findElement(By.xpath("//input[@name='email']"));
		emailTextBox_xpath.sendKeys("Budhiraja@gmail.com");
		
		WebElement phoneTextBox_xpath = wd.findElement(By.xpath("//input[@name='phone']"));
		phoneTextBox_xpath.sendKeys("0433752929");
		
		WebElement startCalendarTextBox_xpath = wd.findElement(By.xpath("//input[@name='departure']"));
		selectDateTime(startCalendarTextBox_xpath);
	   	
		WebElement returnCalendarTextBox_xpath = wd.findElement(By.xpath("//input[@name='return']"));
		selectDateTime(returnCalendarTextBox_xpath);
	   	
		WebElement pickUpAddressTextBox_xpath = wd.findElement(By.xpath("//input[@name='pickAddr']"));
		pickUpAddressTextBox_xpath.sendKeys("Unit 3, 540, Mount Waverley");
		
		WebElement destAddressTextBox_xpath = wd.findElement(By.xpath("//input[@name='distAddrr']"));
		destAddressTextBox_xpath.sendKeys("800, Mount Waverley");
		
		WebElement journeyTypeDropDown_name = wd.findElement(By.name("type"));
		Select journey_type = new Select(journeyTypeDropDown_name);
		// journey_type.selectByVisibleText("One-way");
		// journey_type.selectByIndex(0);
		journey_type.selectByValue("1");
		
		
	////*[@name="type"] - * is a wild card
	
		WebElement passengersDropDown_name = wd.findElement(By.name("passengers"));
		Select number_passengers = new Select(passengersDropDown_name);
		// number_passengers.selectByIndex(2);
		number_passengers.selectByValue("3");
		
		WebElement notesTextBox_xpath = wd.findElement(By.xpath("//textarea[@name='notes']"));
		notesTextBox_xpath.sendKeys("Access via Lee avenue");
	
		WebElement submitButton_xpath = wd.findElement(By.xpath("//button[@type='submit']"));
		submitButton_xpath.click();
		
		// wd.quit();
		
	}

	public static void selectDateTime(WebElement dateTime){
		
		    dateTime.sendKeys("28/04/2019");
		    dateTime.sendKeys(Keys.TAB);
		    dateTime.sendKeys("12:30");
		    dateTime.sendKeys(Keys.TAB);
		    dateTime.sendKeys("PM");
		}
}


// CSS is faster than xpath
// CSS will not change as per browser.
// CSS is used with ID.



// should we be automating the email application along with your application of just automate dthe API to test the content 

