package com.quander.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.quander.generic.BaseClass;

public class CreateAccount extends BaseClass {
@Test
public void createAccount() throws EncryptedDocumentException, IOException
{
	String accName = fl.getExcelData("account", 1, 0);
	String rating = fl.getExcelData("account", 1, 1);
	String parentName = fl.getExcelData("account", 1, 2);
	String revenue = fl.getExcelData("account", 1, 3);
	String street = fl.getExcelData("account", 1, 4);
	String city = fl.getExcelData("account", 1, 5);
	String state = fl.getExcelData("account", 1, 6);
	String zip = fl.getExcelData("account", 1, 7);
	String country = fl.getExcelData("account", 1, 8);
	hp.getAccountsLink().click();
	ap.getNewAccountBtn().click();
	ap.getAccountNameTbx().sendKeys(accName);
	Select s=new Select(ap.getRatingDropdown());
	s.selectByValue(rating);
	ap.getParentAccTbx().sendKeys(parentName);
	ap.getAnnualRevenueTbx().sendKeys(revenue);
	ap.getStreetTbx().sendKeys(street);
	ap.getCityTbx().sendKeys(city);
	ap.getStateTbx().sendKeys(state);
	ap.getZipcodeTbx().sendKeys(zip);
	ap.getCountryTbx().sendKeys(country);
	ap.getCopyAddBtn().click();
	ap.getBillingToBtn().click();
	ap.getSaveBtn().click();
	
	
}

}
