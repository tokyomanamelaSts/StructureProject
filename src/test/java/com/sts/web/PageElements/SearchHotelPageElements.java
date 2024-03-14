package com.sts.web.PageElements;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebApp.CommonActions;
import WebApp.FluentClass;
import WebApp.XPathHelper;




public class SearchHotelPageElements {

    private WebDriver driver;
    private WebDriverWait wait;
    XPathHelper xPathHelper;
    CommonActions commonActions ;

    // Constructor
    public SearchHotelPageElements(WebDriver driver) throws IOException, InterruptedException {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        xPathHelper = new XPathHelper(driver);
        commonActions = new CommonActions(driver, false);
    }

    public FluentClass getSelectLocation() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("location"), driver, "Location Dropdown", false);
    }

    public FluentClass getSelectRoomType() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("room_type"), driver, "Room Type Dropdown", false);
    }

    public FluentClass getSelectHotels() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("hotels"), driver, "Hotels Dropdown", false);
    }

    public FluentClass getSelectNumberOfRooms() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("room_nos"), driver, "Number of Rooms Dropdown", false);
    }

    public FluentClass getCheckInDateElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("datepick_in"), driver, "Check-in Date", false);
    }

    public FluentClass getCheckOutDateElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("datepick_out"), driver, "Check-out Date", false);
    }

    public FluentClass getSelectAdultRoom() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("adult_room"), driver, "Adult Room Dropdown", false);
    }

    public FluentClass getSelectKidsRoom() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("child_room"), driver, "Child Room Dropdown", false);
    }

    public FluentClass getSubmitButton() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("Submit"), driver, "Submit Button", false);
    }
    
}