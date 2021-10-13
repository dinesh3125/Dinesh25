package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91893\\eclipse-workspace\\SeleniumSinvel\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		WebElement btn = driver.findElement(By.xpath("//button[contains(text(),'display an')]"));
		btn.click();
		Alert a = driver.switchTo().alert();
		a.accept();
		
		WebElement al = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		al.click();
		
		WebElement butn = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		butn.click();
		a.dismiss();
		
		WebElement al3 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[3]"));
		al3.click();
		
		WebElement prompt = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		prompt.click();
		
		a.sendKeys("Dinesh is student");
		a.accept();
		
		
	}

}
