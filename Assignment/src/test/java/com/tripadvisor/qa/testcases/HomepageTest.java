package com.tripadvisor.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tripadvisor.qa.base.TestBase;
import com.tripadvisor.qa.pages.Club_Mahindra_Madikeri_Coorg;
import com.tripadvisor.qa.pages.Homepage;
import com.tripadvisor.qa.pages.Hotels;

public class HomepageTest extends TestBase {
	Homepage homepage;
	Hotels hotels;
	Club_Mahindra_Madikeri_Coorg club_mahindra_madikeri_coorg;

public HomepageTest() throws IOException {
		super();
	}

@BeforeMethod
public void setup() throws Throwable
{
	TestBase.initialisation();
	 homepage=new Homepage();
}
@Test
public void addReview() throws Throwable
{
	homepage.type("Club Mahindra");
	homepage.click();
	hotels=new Hotels();
	hotels.writeReview();
	club_mahindra_madikeri_coorg=new Club_Mahindra_Madikeri_Coorg();
	club_mahindra_madikeri_coorg.giveReview();
	
}
@AfterMethod
public void teardown()
{
	driver.quit();
}

}
