package com.tripadvisor.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tripadvisor.qa.base.TestBase;

public class Hotels extends TestBase {
	
@FindBy(xpath="//a[@id='global-nav-hotels']")
WebElement hotellink;
@FindBy(xpath="//a[@class='ui_button primary']")
WebElement writeAriviewLink;

public void writeReview(){
	writeAriviewLink.click();
}
public Hotels() throws IOException
{
	super();
}
}
