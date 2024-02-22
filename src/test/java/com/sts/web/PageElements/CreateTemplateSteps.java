package com.sts.web.PageElements;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import WebApp.FluentClass;
import WebApp.XPathHelper;
import WebApp.commonActions;
import WebApp.MouseActionsExample;
import WebApp.WaitUtils;



public class CreateTemplateSteps {

	private WebDriver driver;
	XPathHelper xPathHelper;
	commonActions CommonActions ;
	MouseActionsExample mouseActions;
	WaitUtils wait ;

	// Constructor
	public CreateTemplateSteps(WebDriver driver) throws IOException, InterruptedException {
		this.driver = driver;

		xPathHelper = new XPathHelper(driver);
		CommonActions = new commonActions(driver);
		mouseActions = new MouseActionsExample(driver);
		wait = new WaitUtils(driver);
	}

	public FluentClass getTemplateTab() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='header-TEMPLATES-tab-button']"), driver, "Template Tab");
	}

	public FluentClass getCreateTemplateButton() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='templates-sidebar-actions-meerkat_create_template']"), driver, "Template Button");
	}
	public FluentClass getTemplateNameTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByid("prepare-template-name"), driver, "Template Name Text Box");
	}

	public FluentClass getTemplateDescriTionTextbox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='prepare-template-desc']"), driver, "Template Name Description");
	}

	public void attachDoc(String location) {
		location = System.getProperty("user.dir")+location;
		WebElement fileUploadElement = driver.findElement(By.xpath("//input[@data-qa='upload-file-input-file-drop']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", fileUploadElement); // Make the input visible
		fileUploadElement.sendKeys(location); 
	}


	public FluentClass getUploadDocument() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@class='css-c5mkoa']"), driver, "Attach document");
	}



	public FluentClass getreciepientNameTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='recipient-name']"), driver, "name Textbox");
	}


	public FluentClass getReciepientEmailTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='recipient-email']"), driver, "Email Textbox");
	}


	public FluentClass getRoleTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='recipient-role-input']"), driver, "Role Textbox");
	}


	public FluentClass getEmaiSubjectTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='prepare-subject']"), driver, "Email Subject Textbox");
	}

	public FluentClass getEmailMessageTextBox() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='prepare-message']"), driver, "Message Textbox");
	}


	public FluentClass getNextButton() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='footer-add-fields-link']"), driver, "Next Button");
	}

	public void dragAndDropInitial() throws IOException, InterruptedException {

	}  


	public FluentClass getSendButton() throws IOException, InterruptedException {

		return new FluentClass(xPathHelper.getElementByXPath("//*[@data-qa='quick-send-envelope-send']"), driver, "Next Button");
	}




	public void dragAndDrop() throws IOException, InterruptedException {

		mouseActions.dragAndDropByOffset(xPathHelper.getElementByXPath("//*[@title='Initial']"), 5, 9);
		WebElement ele = xPathHelper.getElementByXPath("(//*[@style= 'pointer-events: auto; cursor: pointer;'])[2]");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	} 

	public FluentClass getUseButton(String eleName) throws IOException, InterruptedException {


		wait.waitForElementClickable("//div[contains(text(),'"+eleName+"')]/following::button[1]");
		WebElement template =xPathHelper.getElementByXPath("//div[contains(text(),'"+eleName+"')]/following::button[1]");
		return new FluentClass(template, driver, "Use Button");
	}
	public FluentClass getSaveAndCloseButton() throws IOException, InterruptedException {

		wait.waitForElementClickable("//*[@data-qa='footer-send-button']");      	 
		WebElement template =xPathHelper.getElementByXPath("//*[@data-qa='footer-send-button']");
		return new FluentClass(template, driver, "Save and close Button");
	}
	public FluentClass getSelectAdultRoom() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByid("adult_room"), driver, "Adult Room Dropdown");
	}

	public FluentClass getSelectKidsRoom() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByid("child_room"), driver, "Child Room Dropdown");
	}

	public FluentClass getSubmitButton() throws IOException, InterruptedException {
		return new FluentClass(xPathHelper.getElementByid("Submit"), driver, "Submit Button");
	}

}