package com.window;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("(//input[@name='keyword'])[1]"));
		search.sendKeys("Turtile neck T-shirt");
		
		WebElement btn = driver.findElement(By.xpath("(//button[@class='searchformButton col-xs-4 rippleGrey'])[1]"));
		btn.click();
		
		WebElement product = driver.findElement(By.xpath("(//a[@pogid='647093524343'])[1]"));
		product.click();
		
		String parent = driver.getWindowHandle();
		System.out.println("parent id"+ parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println("child id"+ child);
		
		int a = 0;
		
		
		for (String sub : child) {
			
			
			
			
		}
		
		
		
			
	}

}
