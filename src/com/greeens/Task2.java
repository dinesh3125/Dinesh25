package com.greeens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		name.sendKeys("Dinesh");
		
		WebElement last = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		last.sendKeys("S");
		
		WebElement add = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		add.sendKeys("1/806,T.H.Main Road,Gandhi Nagar,Redhills,Chennai-600052");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("tamilandanadinesh@gamil.com");
		
		WebElement phno = driver.findElement(By.xpath("//input[@type='tel']"));
		phno.sendKeys("8438540093");
		
		WebElement GEN = driver.findElement(By.xpath("//input[@value='Male']"));
		GEN.click();
		
		WebElement hob = driver.findElement(By.xpath("//input[@value='Cricket']"));
		hob.click();
		
		WebElement lang = driver.findElement(By.xpath("//div[contains(@style,'min-height')]"));
		lang.click();
		
		WebElement sel = driver.findElement(By.xpath("//a[text()='Hindi']"));
		sel.click();
		
		WebElement sel2 = driver.findElement(By.xpath("//a[text()='English']"));
		sel2.click();
		 
		WebElement skill = driver.findElement(By.id("Skills"));
		skill.click();
		
		WebElement sele = driver.findElement(By.id(""));
		sele.click();
		
		
		
		
	}

}
