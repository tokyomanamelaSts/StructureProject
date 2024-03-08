package com.sts.web.PageElements;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import WebApp.CommonActions;
import WebApp.FluentClass;
import WebApp.XPathHelper;
import WebApp.MouseActionsExample;
import WebApp.WaitUtils;



public class CreateTemplateSteps {

	private WebDriver driver;
	XPathHelper xPathHelper;
	CommonActions commonActions ;
	MouseActionsExample mouseActions;
	WaitUtils wait ;
	  private  boolean attachEvidence;

	// Constructor
	public CreateTemplateSteps(WebDriver driver, boolean attachEvidence) throws IOException, InterruptedException {
		this.driver = driver;
		this.attachEvidence = attachEvidence;

		xPathHelper = new XPathHelper(driver);
		commonActions = new CommonActions(driver,attachEvidence );
		mouseActions = new MouseActionsExample(driver);
		wait = new WaitUtils(driver);
	}
	
	public FluentClass getTemplateTab() throws IOException, InterruptedException {
		return new FluentClass(
				
				wait.waitForElementClickable("//*[@data-qa='header-TEMPLATES-tab-button']"),driver,  "Template Tab", attachEvidence);
	}

	public FluentClass getCreateTemplateButton() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='templates-sidebar-actions-meerkat_create_template']"), driver, "Template Button", attachEvidence);
	}
	public FluentClass getTemplateNameTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@id='prepare-template-name']"), driver, "Template Name Text Box", attachEvidence);
	}

	public FluentClass getTemplateDescriTionTextbox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='prepare-template-desc']"), driver, "Template Description", attachEvidence);
	}

	public void attachDoc(String location) {
		location = System.getProperty("user.dir")+location;
		WebElement fileUploadElement = driver.findElement(By.xpath("//input[@data-qa='upload-file-input-file-drop']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", fileUploadElement); // Make the input visible
		fileUploadElement.sendKeys(location); 
	}


	public FluentClass getUploadDocument() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@class='css-c5mkoa']"), driver, "Attach document", attachEvidence);
	}



	public FluentClass getreciepientNameTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='recipient-name']"), driver, "name Textbox", attachEvidence);
	}


	public FluentClass getReciepientEmailTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='recipient-email']"), driver, "Email Textbox", attachEvidence);
	}


	public FluentClass getRoleTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='recipient-role-input']"), driver, "Role Textbox", attachEvidence);
	}


	public FluentClass getEmaiSubjectTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='prepare-subject']"), driver, "Email Subject Textbox", attachEvidence);
	}

	public FluentClass getEmailMessageTextBox() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='prepare-message']"), driver, "Message Textbox", attachEvidence);
	}


	public FluentClass getNextButton() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='footer-add-fields-link']"), driver, "Next Button", attachEvidence);
	}

	public void dragAndDropInitial() throws IOException, InterruptedException {

	}  


	public FluentClass getSendButton() throws IOException, InterruptedException {

		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='quick-send-envelope-send']"), driver, "Next Button", attachEvidence);
	}
	public void dragAndDrop() throws IOException, InterruptedException {

		mouseActions.dragAndDropByOffset(xPathHelper.getElementByXPath("//*[@title='Initial']"), 5, 9);
		WebElement ele = xPathHelper.getElementByXPath("(//*[@style= 'pointer-events: auto; cursor: pointer;'])[2]");
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		
	} 
	public FluentClass getUseButton(String eleName) throws IOException, InterruptedException {

		return new FluentClass(wait.waitForElementClickable("//div[contains(text(),'"+eleName+"')]/following::button[1]"), driver, "Use Button", attachEvidence);
	}
	public FluentClass getSaveAndCloseButton() throws IOException, InterruptedException {
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='footer-send-button']"), driver, "Save and close Button", attachEvidence);
	} 
	
	public FluentClass getNextBeforeSendButton () throws IOException, InterruptedException {
		Thread.sleep(3000);
		return new FluentClass(wait.waitForElementClickable("//*[@data-qa='footer-add-fields-link']"), driver, "Save and close Button", attachEvidence);
	}  
	
	
}

