package PageElements;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import WebApp.FluentClass;
import WebApp.XPathHelper;

public class LoginPageElements {

    private WebDriver driver;
    private XPathHelper xPathHelper;

    // Constructor
    public LoginPageElements(WebDriver driver) throws IOException, InterruptedException {
        this.driver = driver;
        this.xPathHelper = new XPathHelper(driver);
    }

    protected FluentClass getUserNameElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("username"), driver, "Username Textbox");
    }

    protected FluentClass getPasswordElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("password"), driver, "Password Textbox");
    }

    protected FluentClass getSubmitButtonElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("login"), driver, "Submit Textbox");
    }
}
