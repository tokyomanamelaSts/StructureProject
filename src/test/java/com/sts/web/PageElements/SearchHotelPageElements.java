package com.sts.web.PageElements;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebApp.FluentClass;
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

    public FluentClass getSelectLocation() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("location"), driver, "Location Dropdown");
    }

    public FluentClass getSelectRoomType() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("room_type"), driver, "Room Type Dropdown");
    }

    public FluentClass getSelectHotels() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("hotels"), driver, "Hotels Dropdown");
    }

    public FluentClass getSelectNumberOfRooms() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("room_nos"), driver, "Number of Rooms Dropdown");
    }

    public FluentClass getCheckInDateElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("datepick_in"), driver, "Check-in Date");
    }

    public FluentClass getCheckOutDateElement() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("datepick_out"), driver, "Check-out Date");
    }

    public FluentClass getSelectAdultRoom() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("adult_room"), driver, "Adult Room Dropdown");
    }

    public FluentClass getSelectKidsRoom() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("child_room"), driver, "Child Room Dropdown");
    }

    public FluentClass getSubmitButton() throws IOException, InterruptedException {
        return new FluentClass(xPathHelper.getElementByid("Submit"), driver, "Submit Button");
    }
    
}