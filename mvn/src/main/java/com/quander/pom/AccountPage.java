package com.quander.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
@FindBy(xpath = "//input[@onclick='createAction()']")
private WebElement newAccountBtn;
@FindBy(xpath = "//input[@name='property(Account Name)']")
private WebElement accountNameTbx;
@FindBy(name = "property(Rating)")
private WebElement ratingDropdown;
@FindBy(name  = "property(Parent Account)")
private WebElement parentAccTbx;
@FindBy(xpath = "//img[@title='Calculator']")
private WebElement calculatorLookup;
@FindBy(name = "property(Annual Revenue)")
private WebElement annualRevenueTbx;
@FindBy(xpath = "//input[@name='property(Billing Street)']")
private WebElement streetTbx;
@FindBy(xpath = "//input[@name='property(Billing City)']")
private WebElement cityTbx;
@FindBy(xpath = "//input[@name='property(Billing State)']")
private WebElement stateTbx;
@FindBy(xpath = "//input[@name='property(Billing Code)']")
private WebElement zipcodeTbx;
@FindBy(xpath = "//input[@name='property(Billing Country)']")
private WebElement countryTbx;
@FindBy(id = "copyAddress")
private WebElement copyAddBtn;
@FindBy(xpath = "//td[text()='Billing to Shipping']")
private WebElement billingToBtn;
@FindBy(xpath = "//input[@value='Save']")
private WebElement saveBtn;

public AccountPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getNewAccountBtn() {
	return newAccountBtn;
}

public WebElement getAccountNameTbx() {
	return accountNameTbx;
}

public WebElement getRatingDropdown() {
	return ratingDropdown;
}

public WebElement getParentAccTbx() {
	return parentAccTbx;
}

public WebElement getCalculatorLookup() {
	return calculatorLookup;
}

public WebElement getAnnualRevenueTbx() {
	return annualRevenueTbx;
}

public WebElement getStreetTbx() {
	return streetTbx;
}

public WebElement getCityTbx() {
	return cityTbx;
}

public WebElement getStateTbx() {
	return stateTbx;
}

public WebElement getZipcodeTbx() {
	return zipcodeTbx;
}

public WebElement getCountryTbx() {
	return countryTbx;
}

public WebElement getCopyAddBtn() {
	return copyAddBtn;
}

public WebElement getBillingToBtn() {
	return billingToBtn;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

}
