package PageElements;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebApp.XPathHelper;
import WebApp.commonActions;



public class SearchHotelPageElements {

    private WebDriver driver;
    private WebDriverWait wait;
    XPathHelper xPathHelper;
    commonActions CommonActions ;

    // Constructor
    public SearchHotelPageElements(WebDriver driver) throws IOException, InterruptedException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        xPathHelper = new XPathHelper(driver);
        CommonActions = new commonActions(driver);
    }

    // Page actions
    public void SelectLocation(String Location) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("location"))), Location);
    }
    
    
    public void SelectRoomType(String room_type) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("room_type"))), room_type);
    }
    
    public void SelectHotels(String hotels) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("hotels"))), hotels);
    }
    
    
    public void SelectNumberOfRooms(String room_nos) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("room_nos"))), room_nos);
    }
    
    public void enterCheckInDate(String datepick_in) {
        CommonActions.clearAndType(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("datepick_in"))), datepick_in);
    }
    
    public void enterCheckOutDate(String datepick_out) {
        CommonActions.clearAndType(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("datepick_out"))), datepick_out);
    }
    
    
   
    
    
    public void SelectAdultRoom(String adult_room) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("adult_room"))), adult_room);
    }
    
    public void SelectKidsRoom(String child_room) {
        CommonActions.selectByValue(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("child_room"))), child_room);
    }
    
    public void clickSumitButton() {
        CommonActions.click(wait.until(ExpectedConditions.visibilityOf(xPathHelper.getElementByid("Submit"))));
    }
    
}