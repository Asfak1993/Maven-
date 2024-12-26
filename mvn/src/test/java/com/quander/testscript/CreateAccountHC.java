package com.quander.testscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountHC {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://192.168.106.128:8080/crm/HomePage.do");
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.xpath("//input[@onclick='createAction()']")).click();
		driver.findElement(By.xpath("//input[@name='property(Account Name)']")).click();
		WebElement ele = driver.findElement(By.name("property(Rating)"));
		ele.click();
		Select s=new Select(ele);
		s.selectByValue("Acquired");
		driver.findElement(By.name("property(Parent Account)")).sendKeys("hello");
		driver.findElement(By.xpath("//img[@title='Calculator']")).click();
		String parent = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		for(String wid:allWid) {
			driver.switchTo().window(wid);}
		driver.findElement(By.name("calc7")).click();
		for(int i=0;i<4;i++) {
			driver.findElement(By.name("calc0")).click();}
		driver.findElement(By.name("equal")).click();
		driver.close();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//input[@name='property(Billing Street)']")).sendKeys("Banaso");
		driver.findElement(By.xpath("//input[@name='property(Billing City)']")).sendKeys("hzb");
		driver.findElement(By.xpath("//input[@name='property(Billing State)']")).sendKeys("Jharkhand");
		driver.findElement(By.xpath("//input[@name='property(Billing Code)']")).sendKeys("825312");
		driver.findElement(By.xpath("//input[@name='property(Billing Country)']")).sendKeys("India");
		driver.findElement(By.id("copyAddress")).click();
		driver.findElement(By.xpath("//td[text()='Billing to Shipping']")).click();
		//driver.findElement(By.xpath("//input[@value='Save']")).click();


	}

}
