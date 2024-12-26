package com.quander.testscript;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.quander.generic.BaseClass;

public class CreatePurchaseOrder extends BaseClass {
	@Test
	public void createPurchaseOrder() throws EncryptedDocumentException, IOException, InterruptedException {
		String sub = fl.getExcelData("purchaseorder", 1, 0);
		String vendName = fl.getExcelData("purchaseorder", 1, 1);
		String street = fl.getExcelData("purchaseorder", 1, 2);
		String city = fl.getExcelData("purchaseorder", 1, 3);
		String state = fl.getExcelData("purchaseorder", 1, 4);
		String zip = fl.getExcelData("purchaseorder", 1, 5);
		String country = fl.getExcelData("purchaseorder", 1, 6);
		String prodName = fl.getExcelData("purchaseorder", 1, 7);
		String listprice = fl.getExcelData("purchaseorder", 1, 8);
		String qty = fl.getExcelData("purchaseorder", 1, 9);
		
		for(int i=0;i<30;i++)
		{
			hp.getRightScroolBtn().click();	
		}
		hp.getPurchaseOrderLink().click();
		po.getNewPurchaseOrderBtn().click();
		po.getSubjbectTbx().sendKeys(sub);
		po.getVendorLookupIcon().click();
		String pWid = driver.getWindowHandle();
		Set<String> allWid = driver.getWindowHandles();
		for (String string : allWid) {
			driver.switchTo().window(string);
		}
		List<WebElement> vendorName= po.getVendorNameLink();
		for (WebElement webElement : vendorName) {
			if(webElement.getText().equals(vendName)) {
				webElement.click();
				break;
			}
		}
		driver.switchTo().window(pWid);
		po.getStreetNameTbx().sendKeys(street);
		po.getCityNameTbx().sendKeys(city);
		po.getStateNameTbx().sendKeys(state);
		po.getZipTbx().sendKeys(zip);
		po.getCountryNameTbx().sendKeys(country);
		po.getCopyAddBtn().click();
		po.getBillingToBtn().click();
		po.getProductLookupIcon().click();
		String pWid1 = driver.getWindowHandle();
		Set<String> allWid1 = driver.getWindowHandles();
		for (String string : allWid1) {
			driver.switchTo().window(string);
		}
		List<WebElement> productName = po.getProductNameLink();
		for (WebElement webElement1 : productName) {
			if(webElement1.getText().equals(prodName)) {
				webElement1.click();
				
			}
		}
		driver.switchTo().window(pWid1);
		Thread.sleep(2000);
		po.getQntyTbx().sendKeys(qty);
		po.getListPriceTbx().sendKeys(listprice);
		po.getSaveBtn().click();



	}

}


