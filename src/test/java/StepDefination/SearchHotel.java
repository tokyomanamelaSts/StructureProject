package StepDefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageElements.LoginPage;
import PageElements.SearchHotelPageElements;

public class SearchHotel extends SearchHotelPageElements{

	
	
	public SearchHotel(WebDriver driver) throws IOException, InterruptedException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void searchHotel(String Location, String holtels, String RoomType, String NoOfRoom,
			String checkIn, String Checkout, String AdultRoom , String KidsRoom ) {
		
		SelectLocation(Location);
		SelectHotels(holtels);
		SelectRoomType(RoomType);
		SelectNumberOfRooms(NoOfRoom);
		enterCheckInDate(checkIn);
		enterCheckOutDate(Checkout);
		SelectAdultRoom(AdultRoom);
		SelectKidsRoom(KidsRoom);
		clickSumitButton();
	}
	
	
		
	

}
