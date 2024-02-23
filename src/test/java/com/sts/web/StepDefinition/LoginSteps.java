package com.sts.web.StepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;

import com.sts.web.PageElements.LoginPageElements;

public class LoginSteps extends LoginPageElements {

    public LoginSteps(WebDriver driver, boolean attachEvidence) throws IOException, InterruptedException {
        super(driver, attachEvidence);
    }

    public void loginToDocusign(String username, String password) throws Exception {
    //	Thread.sleep(2000);
    	getUserNameElement().type(username);
    	getNextButtonElement().click();
    	getPasswordElement() .type(password);
    	getLoginElement().click();
    }
}
