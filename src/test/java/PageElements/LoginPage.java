package PageElements;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebApp.XPathHelper;
import WebApp.commonActions;



public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;
    XPathHelper xPathHelper;
    commonActions CommonActions ;

    // Constructor
    public LoginPage(WebDriver driver) throws IOException, InterruptedException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        xPathHelper = new XPathHelper(driver);
        CommonActions = new commonActions(driver);
    }

    // Page actions
    public void enterUsername(String username) {
        CommonActions.clearAndType(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("username"))), username);
    }
    
    public void enterPassword(String password) {
        CommonActions.clearAndType(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("password"))), password);
    }
    
    public void clickSumitButton() {
        CommonActions.click(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("login"))));
    }
    
    
}