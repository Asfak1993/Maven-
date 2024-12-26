package com.quander.generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.quander.pom.AccountPage;
import com.quander.pom.ContactPage;
import com.quander.pom.HomePage;
import com.quander.pom.LoginPage;
import com.quander.pom.PurchaseOrderPage;

public class BaseClass {
	 public static WebDriver driver;
	 public FileLib fl = new FileLib();
	 public LoginPage lp;
	 public HomePage hp;
	 public ContactPage cp;
	 public AccountPage ap;
	 public PurchaseOrderPage po;
	 @BeforeTest
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
		cp = new ContactPage(driver);
		ap=new AccountPage(driver);
		po=new PurchaseOrderPage(driver);
		driver.manage().window().maximize();
		String url = fl.getpropertyData("url");
		driver.get(url);
	}
	@BeforeMethod
	public void login() throws IOException {
		String un = fl.getpropertyData("un");
		String pwd = fl.getpropertyData("pwd");
		lp.login(un, pwd);
	}
	@AfterMethod
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		hp.getLogoutLink().click();
		
	}
	@AfterTest
	public void closeBrowser() {
		driver.manage().window().minimize();
		driver.quit();
	}
}
