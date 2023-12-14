package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageElements.LoginPage;

public class LoginSteps {




	private WebDriver driver;
	LoginPage loginPage;
	public LoginSteps(WebDriver driver) throws IOException, InterruptedException {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		loginPage = new LoginPage(this.driver);
	}
	public void LoginToAdactin(String username, String Password) {
		loginPage.enterUsername(username);
		loginPage.enterPassword(Password);
		loginPage.clickSumitButton();
	}
	
	

}
