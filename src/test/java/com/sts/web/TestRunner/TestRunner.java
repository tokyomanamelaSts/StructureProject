package com.sts.web.TestRunner;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;
import com.sts.web.StepDefinition.LoginSteps;
import com.sts.web.StepDefinition.CreateTemplate;

import ReUseableUtils.FileHandlerClass;
import Report.ExtentTestManager;
import WebApp.BrowserFactory;
import org.testng.annotations.Parameters;

public class TestRunner {
    private WebDriver driver;
    private LoginSteps loginSteps;
    private CreateTemplate createTemplate;
    private FileHandlerClass fileHandlerClass;
    private final String propertyFilePath = "configs/config.properties";
    private final String excelPath = "TestData/SearchHotel.xlsx";

    public TestRunner() throws IOException, InterruptedException {
        fileHandlerClass = new FileHandlerClass();
    }
    @Parameters("browser")

    @BeforeMethod
    public void setUp(String browser) throws IOException, InterruptedException {
       
            driver = new BrowserFactory().setUpDriver(browser);
            driver.manage().window().maximize();
            ExtentTestManager.startTest("BeforeTests");
            loginSteps = new LoginSteps(driver);
            createTemplate = new CreateTemplate(driver);
       
    }

    @Test
    public void searchHotelTest() throws IOException, InterruptedException, FilloException {
     
            driver.get(fileHandlerClass.GetPropVal(propertyFilePath, "DocisignURL"));
            loginSteps.loginToDocusign(
                fileHandlerClass.GetPropVal(propertyFilePath, "DocusignUsername"),
                fileHandlerClass.GetPropVal(propertyFilePath, "DocusignPassword"));
            Recordset searchRecordset = FileHandlerClass.getDataFromExcelbyQuery(excelPath, "select * from SearchHotel");
            while (searchRecordset.next()) {
                if (searchRecordset.getField("RunMe").equalsIgnoreCase("yes")) {
                    ExtentTestManager.startTest(searchRecordset.getField("Testcase"));
                    ExtentTestManager.getTest().info(searchRecordset.getField("Description"));
                    createTemplate.createNewTemplate(
                        searchRecordset.getField("TemplateName"),
                        searchRecordset.getField("TemplateDescription"),
                        searchRecordset.getField("Role"),
                        searchRecordset.getField("recipientName"),
                        searchRecordset.getField("RecipientEmail"),
                        searchRecordset.getField("EmaiSubject"),
                        searchRecordset.getField("EmailMessage"), searchRecordset.getField("Location"));
                } else {
                    ExtentTestManager.startTest(searchRecordset.getField("Testcase"));
                    ExtentTestManager.getTest().skip("Test Skipped");
                }
            }
        } 
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

  
}
