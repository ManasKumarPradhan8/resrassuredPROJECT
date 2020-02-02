package com.tripadvisor.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tripadvisor.qa.base.TestBase;

public class AllResults extends TestBase {
	@FindBy(xpath="//span[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement Club_Mahindra_Madikeri_Coorg_LINK;

	public AllResults() throws IOException {
		super();
	}

}
