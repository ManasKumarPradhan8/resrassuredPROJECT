package com.tripadvisor.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.tripadvisor.qa.base.TestBase;

public class Club_Mahindra_Madikeri_Coorg extends TestBase {
	@FindBy(xpath="//span[@id='bubble_rating']")
	WebElement overall_Rating;
	@FindBy(xpath="//input[@id='ReviewTitle']")
	WebElement review_Title;
	@FindBy(xpath="//textarea[@id='ReviewText']")
	WebElement review_text;
	@FindBy(xpath="//span[@id='qid12_bubbles']")
	WebElement servicesFeedback;
	@FindBy(xpath="//span[@id='qid11_bubbles']")
	WebElement roomsFeedback;
	@FindBy(xpath="//span[@id='qid13_bubbles']")
	WebElement value_Feedback;
	@FindBy(xpath="//input[@id='noFraud']")
	WebElement submit_review_cheakbox;
	@FindBy(xpath="//span[contains(text(),'Submit your review')]")
	WebElement submit_review_link;
	public void giveReview()
	{
	overall_Rating.click();
	review_Title.sendKeys("good");
	review_text.sendKeys("too good");
	servicesFeedback.click();
	roomsFeedback.click();
	value_Feedback.click();
	submit_review_cheakbox.click();
	submit_review_link.click();
	}
	public Club_Mahindra_Madikeri_Coorg() throws IOException {
		super();
		
	}

}
