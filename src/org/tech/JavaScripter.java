package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripter {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://toolsqa.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		WebElement sent = driver.findElement(By.xpath("//div[text()='SITE LINKS']"));
		js.executeScript("arguments[0].scrollIntoView(true)", sent);
		
		WebElement tut = driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--text']"));
		js.executeScript("arguments[0].scrollIntoView(false)", tut);
		
	
		
	}

}
