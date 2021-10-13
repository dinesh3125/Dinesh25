package com.greeens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://mail.google.com/mail/u/0/?zx=xu9bs3jrossq#inbox");
		
		//WebElement img = driver.findElement(By.xpath("//a[@data-eqid='1click']"));
		//.click();
		
	//	WebElement other = driver.findElement(By.xpath("//div[text()='Add another account']"));
	//	other.click();
		
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.xpath("//input[@autocomplete='username']"));
		email.sendKeys("tamilandanaadinesh@gmail.com");
		 
		
	}
	
	

}
