package com.window;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get(" https://www.amazon.com/");
		
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//input[@dir='auto']"));
		search.sendKeys("Iphone");
		
		Actions a = new Actions(driver);
		
		Robot b = new Robot();
		
		WebElement act = driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]"));
		act.click();
		
		WebElement phon = driver.findElement(By.xpath("(//span[contains(text(),'(Refurbished) Apple iPhone 11')])[1]"));
		a.contextClick(phon).perform();
		
		b.keyPress(KeyEvent.VK_DOWN);
		b.keyRelease(KeyEvent.VK_DOWN);
		
		b.keyPress(KeyEvent.VK_ENTER);
		b.keyRelease(KeyEvent.VK_ENTER);
		
		String parentid = driver.getWindowHandle();
		System.out.println("Parent Id" +parentid);
		
		Set<String> childid = driver.getWindowHandles();
		System.out.println("Child Id" +childid);
		
		for (String ch: childid) {
			
			parentid.equals(ch);
			
			driver.switchTo().window(ch);
			
			
			
		}
		
		
		
		WebElement rate = driver.findElement(By.xpath("//span[@id='price_inside_buybox']"));
		String text = rate.getText();
		System.out.println(text);
		
				

		
		
		
		
		
	}
	

}
