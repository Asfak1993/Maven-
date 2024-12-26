package com.quander.testscript;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContactHc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://192.168.106.128:8080/crm/HomePage.do");
	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.xpath("//input[@value='New Contact']")).click();
	WebElement ele = driver.findElement(By.name("property(saltName)"));
	Select s=new Select(ele);
	s.selectByValue("Mr.");
	driver.findElement(By.name("property(First Name)")).sendKeys("Asfak");
	driver.findElement(By.name("property(Last Name)")).sendKeys("Ansari");
	driver.findElement(By.name("property(Date of Birth)")).sendKeys("15/5/1995");
	driver.findElement(By.cssSelector("img[title='Vendor Name Lookup']")).click();
	String parent = driver.getWindowHandle();
	Set<String> allWin = driver.getWindowHandles();
	for(String s1:allWin) {
		driver.switchTo().window(s1);}
	driver.findElement(By.xpath("//input[@onClick='newAction()']")).click();
	driver.findElement(By.xpath("//input[@name='property(Vendor Name)']")).sendKeys("ASK");
	driver.findElement(By.className("button")).click();
	driver.findElement(By.linkText("ASK")).click();
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//input[@name='property(Mailing Street)']")).sendKeys("Banaso");
	driver.findElement(By.xpath("//input[@name='property(Mailing City)']")).sendKeys("hzb");
	driver.findElement(By.xpath("//input[@name='property(Mailing State)']")).sendKeys("Jharkhand");
	driver.findElement(By.xpath("//input[@name='property(Mailing Zip)']")).sendKeys("825312");
	driver.findElement(By.xpath("//input[@name='property(Mailing Country)']")).sendKeys("India");
	driver.findElement(By.id("copyAddress")).click();
	driver.findElement(By.xpath("//td[text()='Mailing to Other']")).click();
	driver.findElement(By.name("property(Description)")).sendKeys("hello hi");
	//driver.findElement(By.xpath("//input[@value='Save']")).click();
	
	
	
	
	}

}
