package com.quander.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
@FindBy(xpath = "//input[@value='New Contact']")
private WebElement newContactBtn;
@FindBy(name = "property(saltName)")
private WebElement initialTbx;
@FindBy(name = "property(First Name)")
private WebElement firstNameTbx;
@FindBy(name = "property(Last Name)")
private WebElement lastNameTbx;
@FindBy(name = "property(Date of Birth)")
private WebElement dobTbx;
@FindBy(css = "img[title='Vendor Name Lookup']")
private WebElement vendorLookupIcon;
@FindBy(xpath = "//a[@href='javascript:;']")
private List<WebElement> selectVendor;
@FindBy(xpath = "//input[@name='property(Mailing Street)']")
private WebElement streetTbx;
@FindBy(xpath = "//input[@name='property(Mailing City)']")
private WebElement cityTbx;
@FindBy(xpath = "//input[@name='property(Mailing State)']")
private WebElement stateTbx;
@FindBy(xpath = "//input[@name='property(Mailing Zip)']")
private WebElement zipTbx;
@FindBy(xpath = "//input[@name='property(Mailing Country)']")
private WebElement countryTbx;
@FindBy(id ="copyAddress" )
private WebElement copyAddBtn;
@FindBy(xpath = "//td[text()='Mailing to Other']")
private WebElement mailingBtn;
@FindBy(name = "property(Description)")
private WebElement descriptionTbx;
@FindBy(xpath = "//input[@value='Save']")
private WebElement saveBtn;

public ContactPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getNewContactBtn() {
	return newContactBtn;
}

public WebElement getInitialTbx() {
	return initialTbx;
}

public WebElement getFirstNameTbx() {
	return firstNameTbx;
}

public WebElement getLastNameTbx() {
	return lastNameTbx;
}

public WebElement getDobTbx() {
	return dobTbx;
}

public WebElement getVendorLookupIcon() {
	return vendorLookupIcon;
}

public List<WebElement> getSelectVendor() {
	return selectVendor;
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

public WebElement getZipTbx() {
	return zipTbx;
}

public WebElement getCountryTbx() {
	return countryTbx;
}

public WebElement getCopyAddBtn() {
	return copyAddBtn;
}

public WebElement getMailingBtn() {
	return mailingBtn;
}

public WebElement getDescriptionTbx() {
	return descriptionTbx;
}

public WebElement getSaveBtn() {
	return saveBtn;
}


}
