package com.quander.testscript;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.quander.generic.BaseClass;

public class CreateContact extends BaseClass{
	@Test
	public void createContact() throws EncryptedDocumentException, IOException
	{
		String prefix = fl.getExcelData("contact", 1, 0);
		String fn = fl.getExcelData("contact", 1, 1);
		String ln = fl.getExcelData("contact", 1, 2);
		String dob = fl.getExcelData("contact", 1, 3);
		String vendname = fl.getExcelData("contact", 1, 4);
		String street = fl.getExcelData("contact", 1, 5);
		String city = fl.getExcelData("contact", 1, 6);
		String state = fl.getExcelData("contact", 1, 7);
		String zip = fl.getExcelData("contact", 1, 8);
		String country = fl.getExcelData("contact", 1, 9);
		String desc = fl.getExcelData("contact", 1, 10);
		hp.getContactsLink().click();
		cp.getNewContactBtn().click();
		Select s = new Select(cp.getInitialTbx());
		s.selectByValue(prefix);
		cp.getFirstNameTbx().sendKeys(fn);
		cp.getLastNameTbx().sendKeys(ln);
		cp.getVendorLookupIcon().click();
		String pwid = driver.getWindowHandle();
		Set<String> alwids = driver.getWindowHandles();
		for (String string : alwids) {
			driver.switchTo().window(string);
		}
		List<WebElement> vendorNames = cp.getSelectVendor();
		for (WebElement webElement : vendorNames) {
			if(webElement.getText().equals(vendname))
			{
				webElement.click();
				break;
			}
		}
		driver.switchTo().window(pwid);
		cp.getDobTbx().sendKeys(dob);
		cp.getStreetTbx().sendKeys(street);
		cp.getCityTbx().sendKeys(city);
		cp.getStateTbx().sendKeys(state);
		cp.getZipTbx().sendKeys(zip);
		cp.getCountryTbx().sendKeys(country);
		cp.getCopyAddBtn().click();
		cp.getMailingBtn().click();
		cp.getDescriptionTbx().sendKeys(desc);
		cp.getSaveBtn().click();
	}
}
