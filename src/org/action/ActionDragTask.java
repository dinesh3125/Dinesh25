package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDragTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
		WebElement down = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		WebElement drag1 = driver.findElement(By.xpath("//a[text()=' 5000']"));
		
		WebElement down1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		

		
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, down).perform();
		a.dragAndDrop(drag1, down1).perform();
		
	}

}
