package com.greeens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		WebElement search = driver.findElement(By.xpath("//input[@role='combobox']"));
		search.sendKeys("greens velmurugan");
		
		WebElement bar = driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[2]"));
		bar.click();
		
		WebElement online = driver.findElement(By.xpath("(//h3[contains(text(),'Velmurugan ')])[1]"));
		online.click();
	}

}
