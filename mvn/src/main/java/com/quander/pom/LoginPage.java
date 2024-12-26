package com.quander.pom;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
@FindBy (id = "userName")
private WebElement unTbx;
@FindBy(id = "passWord")
private WebElement pwdTbx;
@FindBy(xpath = "//input[@title='Sign In']")
private WebElement signinBtn;

public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void login(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);
	signinBtn.click();
}
}
