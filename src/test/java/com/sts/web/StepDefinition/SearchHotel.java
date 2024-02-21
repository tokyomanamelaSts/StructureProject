package com.sts.web.StepDefinition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.sts.web.PageElements.SearchHotelPageElements;

public class SearchHotel extends SearchHotelPageElements{

	
	
	public SearchHotel(WebDriver driver) throws IOException, InterruptedException {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void searchHotel(String Location, String holtels, String RoomType, String NoOfRoom,
			String checkIn, String Checkout, String AdultRoom , String KidsRoom ) throws IOException, InterruptedException {

		 getSelectLocation().selectDropdownByText(Location);
		 getSelectRoomType().selectDropdownByText(RoomType);
		 getSelectHotels().selectDropdownByText(holtels);
		 getSelectNumberOfRooms().selectDropdownByText(NoOfRoom);
		 getCheckInDateElement().type(checkIn);
		 getCheckOutDateElement().type(Checkout);
		 getSelectAdultRoom().selectDropdownByText(AdultRoom);
		 getSelectKidsRoom().selectDropdownByText(KidsRoom);
		 getSubmitButton().click();
	}

}
