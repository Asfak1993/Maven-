package com.quander.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id = "scrollright")
	private WebElement rightScroolBtn;
	@FindBy(linkText = "Logout [rashmi@dell.com]")
	private WebElement logoutLink;
	@FindBy(linkText = "Campaigns")
	private WebElement campaignLink;
	@FindBy(linkText = "Leads")
	private WebElement leadsLink;
	@FindBy(linkText = "Potentials")
	private WebElement potentialsLink;
	@FindBy(linkText = "Accounts")
	private WebElement accountsLink;
	@FindBy(linkText = "Contacts")
	private WebElement contactsLink;
	@FindBy(linkText = "Vendors")
	private WebElement vendorsLink;
	@FindBy(linkText = "Products")
	private WebElement productsLink;
	@FindBy(linkText = "Price Books")
	private WebElement priceBookLink;
	@FindBy(linkText = "Quotes")
	private WebElement quotesLink;
	@FindBy(linkText = "Sales Orders")
	private WebElement salesOrderLink;
	@FindBy(linkText = "Purchase Orders")
	private WebElement purchaseOrderLink;
	@FindBy(linkText = "Invoices")
	private WebElement invoicesLink;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getRightScroolBtn() {
		return rightScroolBtn;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getCampaignLink() {
		return campaignLink;
	}

	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getPotentialsLink() {
		return potentialsLink;
	}

	public WebElement getAccountsLink() {
		return accountsLink;
	}

	public WebElement getContactsLink() {
		return contactsLink;
	}

	public WebElement getVendorsLink() {
		return vendorsLink;
	}

	public WebElement getProductsLink() {
		return productsLink;
	}

	public WebElement getPriceBookLink() {
		return priceBookLink;
	}

	public WebElement getQuotesLink() {
		return quotesLink;
	}

	public WebElement getSalesOrderLink() {
		return salesOrderLink;
	}

	public WebElement getPurchaseOrderLink() {
		return purchaseOrderLink;
	}

	public WebElement getInvoicesLink() {
		return invoicesLink;
	}

	
}
