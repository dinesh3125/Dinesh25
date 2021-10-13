package org.scripter;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Simple {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement scrolldown = driver.findElement (By.xpath("(//div[@class='rt-grid-12 rt-alpha rt-omega'])[10]"));
		js.executeScript("arguments[0].scrollIntoView(true)", scrolldown);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.DAYS);
		
		WebElement fra = driver.findElement(By.xpath("(//iframe)[2]"));
		
		driver.switchTo().frame(fra);
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		
		
	}

}
