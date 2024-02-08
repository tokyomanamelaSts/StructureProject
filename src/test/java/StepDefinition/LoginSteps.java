package StepDefinition;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import PageElements.LoginPageElements;

public class LoginSteps extends LoginPageElements {

    public LoginSteps(WebDriver driver) throws IOException, InterruptedException {
        super(driver);
    }

    public void loginToAdactin(String username, String password) throws IOException, InterruptedException {
    	getUserNameElement().type(username);
    	getPasswordElement() .type(password);
    	getSubmitButtonElement().click();
    }
}
