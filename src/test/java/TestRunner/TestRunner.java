package TestRunner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import StepDefination.LoginSteps;
import StepDefination.SearchHotel;
import WebApp.BrowserFactory;

public class TestRunner {
	 private WebDriver driver;
	 private LoginSteps loginSteps;
	 SearchHotel searchHotel;
	public TestRunner() {
		// TODO Auto-generated constructor stub
	}
	
	    @BeforeMethod
	    public void setUp() throws IOException, InterruptedException {
	        // Set up your WebDriver instance (e.g., initialize ChromeDriver)
	    	driver = 	new BrowserFactory().setUpDriver("Chrome"); 
	        driver.manage().window().maximize();
	        loginSteps  = new LoginSteps(driver);
	        searchHotel = new SearchHotel(driver);
	    }

	    @Test
	    public void SearchHoltel() {
	    	driver.get("https://adactinhotelapp.com/");
	    	loginSteps.LoginToAdactin("StsAutomation", "StsAutomation");
	    	searchHotel.searchHotel("Sydney", "Hotel Creek", "Double", "4 - Four", "13/12/2023", "31/12/2023", "4 - Four", "4 - Four");
	    }
	    
	    @AfterMethod
	    public void tearDown() {
	        // Close the WebDriver instance after each test method
	        if (driver != null) {
	          //  driver.quit();
	        }
	    }

}
