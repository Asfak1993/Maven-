package com.quander.pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PurchaseOrderPage {
@FindBy(xpath ="//input[@onclick='createAction()']")
private WebElement newPurchaseOrderBtn;
@FindBy(name = "property(Subject)")
private WebElement subjbectTbx;
@FindBy(xpath = "//img[@title='Vendor Name Lookup']")
private WebElement vendorLookupIcon;
@FindBy(xpath = "//a[@href='javascript:;']")
private List<WebElement> vendorNameLink;
@FindBy(xpath = "//input[@name='property(Billing Street)']")
private WebElement streetNameTbx;
@FindBy(xpath = "//input[@name='property(Billing City)']")
private WebElement cityNameTbx;
@FindBy(xpath = "//input[@name='property(Billing State)']")
private WebElement stateNameTbx;
@FindBy(xpath ="//input[@name='property(Billing Code)']")
private WebElement zipTbx;
@FindBy(xpath = "//input[@name='property(Billing Country)']")
private WebElement countryNameTbx;
@FindBy(id = "copyAddress")
private WebElement copyAddBtn;
@FindBy(xpath = "//td[text()='Billing to Shipping']")
private WebElement billingToBtn;
@FindBy(xpath = "//img[@title='Product Name Lookup']")
private WebElement productLookupIcon;
@FindBy(xpath = "//a[@href='javascript:;']")
private List<WebElement> productNameLink;
@FindBy(id = "txtQty1")
private WebElement qntyTbx;
@FindBy(id = "txtListPrice1")
private WebElement listPriceTbx;
@FindBy(xpath = "//input[@value='Save']")
private WebElement saveBtn;

public PurchaseOrderPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getNewPurchaseOrderBtn() {
	return newPurchaseOrderBtn;
}

public WebElement getSubjbectTbx() {
	return subjbectTbx;
}

public WebElement getVendorLookupIcon() {
	return vendorLookupIcon;
}

public List<WebElement> getVendorNameLink() {
	return vendorNameLink;
}

public WebElement getStreetNameTbx() {
	return streetNameTbx;
}

public WebElement getCityNameTbx() {
	return cityNameTbx;
}

public WebElement getStateNameTbx() {
	return stateNameTbx;
}

public WebElement getZipTbx() {
	return zipTbx;
}

public WebElement getCountryNameTbx() {
	return countryNameTbx;
}

public WebElement getCopyAddBtn() {
	return copyAddBtn;
}

public WebElement getBillingToBtn() {
	return billingToBtn;
}

public WebElement getProductLookupIcon() {
	return productLookupIcon;
}

public List<WebElement> getProductNameLink() {
	return productNameLink;
}

public WebElement getListPriceTbx() {
	return listPriceTbx;
}

public WebElement getSaveBtn() {
	return saveBtn;
}

public WebElement getQntyTbx() {
	return qntyTbx;
}

}
