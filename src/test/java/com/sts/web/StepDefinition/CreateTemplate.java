package com.sts.web.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.sts.web.PageElements.CreateTemplateSteps;

public class CreateTemplate extends CreateTemplateSteps{

	
	
	public CreateTemplate(WebDriver driver, boolean attachEvidence  ) throws IOException, InterruptedException {
		super(driver, attachEvidence);
		// TODO Auto-generated constructor stub
	}

	public void createNewTemplate(String TemplateName, String TemplateDescription, String Role, String recipientName,
			String RecipientEmail, String EmaiSubject , String EmailMessage, String location) throws Exception {
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
		 Thread.sleep(9000);
		 getSaveAndCloseButton().click();
		 getUseButton(TemplateName).click();
		 try {
		//	 getNextBeforeSendButton().click();
		} catch (Exception e) {
			// TODO: handle exception
			
		}
	
		 getSendButton().click();
		
	}

}
