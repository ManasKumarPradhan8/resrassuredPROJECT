package com.tripadvisor.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tripadvisor.qa.base.TestBase;

public class Homepage extends TestBase {
	
	@FindBy(xpath="//input[@placeholder='Try “boutique hotels in Paris”']")
	WebElement searchBar;
	@FindBy(xpath="//a[@class='brand-header-Logo__logo--x3aMw']//img")
	WebElement logo;
	@FindBy(xpath="//div[contains(text(),'Club Mahindra Madikeri, Coorg')]")
	WebElement first_Link;
	@FindBy(xpath="//div[@class='i3bZ_gBa _2RTs3_Ee _3TPJs5_m']//span[@class='_2LyoLJ4U _2HBN-k68']")
	WebElement clickButton;
	
	public void type(String input){
		searchBar.sendKeys(input);
		
	}
	public Hotels click() throws Throwable{
	first_Link.click();	
	return new Hotels();
	}
	
	
	public Homepage() throws IOException{
		PageFactory.initElements(driver,this);
	}

}
