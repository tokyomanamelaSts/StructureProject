package com.sts.web.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.sts.web.PageElements.SearchHotelPageElements;

public class CreateTemplate extends SearchHotelPageElements{

	
	
	public CreateTemplate(WebDriver driver) throws IOException, InterruptedException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void createNewTemplate(String TemplateName, String TemplateDescription, String Role, String recipientName,
			String RecipientEmail, String EmaiSubject , String EmailMessage) throws IOException, InterruptedException {
       Thread.sleep(9000);
		 getTemplateTab().click();
		// Thread.sleep(9000);
		 getCreateTemplateButton().click();
		// Thread.sleep(9000);
		 getTemplateNameTextBox().type(TemplateName);		 
		 getTemplateDescriTionTextbox().type(TemplateDescription);	
		 attachDoc();
		 getRoleTextBox().type(Role);
		 getreciepientNameTextBox().type(recipientName);
		 getReciepientEmailTextBox().type(RecipientEmail);
		 getEmaiSubjectTextBox().type(EmaiSubject);
		 getEmailMessageTextBox().type(EmailMessage);
		 getNextButton().click();
		 dragAndDropInitial() ;
		 getSaveAndCloseButton().click();
		 getUseButton(TemplateName).click();
		 getSendButton().click();
		/* getSelectKidsRoom().selectDropdownByText(KidsRoom);
		 getSubmitButton().click();*/
	}

}
