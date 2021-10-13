package org.tech;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement user = driver.findElement(By.id("username"));
		js.executeScript("arguments[0].setAttribute('value','selenium@gmail.com')", user);
		
		Object txt = js.executeScript("return arguments[0].getAttribute('value')", user);
		//System.out.println(txt);
		String s = (String) txt;
		System.out.println(s);
		
		WebElement pass = driver.findElement(By.name("password"));
		js.executeScript("arguments[0].setAttribute('value','dinesh')", pass);
		
		WebElement btn = driver.findElement(By.xpath("(//input[//@value='Login'])[3]"));
		js.executeScript("arguments[0].click()", btn);
		
		
		
		
		
	}
	
}
