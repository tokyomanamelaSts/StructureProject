package com.sts.web.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.sts.web.PageElements.CreateTemplateSteps;

public class CreateTemplate extends CreateTemplateSteps{

	
	
	public CreateTemplate(WebDriver driver) throws IOException, InterruptedException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void createNewTemplate(String TemplateName, String TemplateDescription, String Role, String recipientName,
			String RecipientEmail, String EmaiSubject , String EmailMessage, String location) throws IOException, InterruptedException {
		 getTemplateTab().click();
		 getCreateTemplateButton().click();
		 getTemplateNameTextBox().type(TemplateName);		 
		 getTemplateDescriTionTextbox().type(TemplateDescription);	
		 attachDoc(location);
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
		
	}

}
