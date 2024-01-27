package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlightBooking {

    WebDriver webDriver;

    public void initializeWebDriver() throws InterruptedException {
        webDriver = new ChromeDriver();
        webDriver.get("https://book.spicejet.com/search.aspx"); // navigate
        Thread.sleep(2000);
    }

    public void selectDepartureCity() throws InterruptedException {
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.linkText("Chennai (MAA)")).click();
        Thread.sleep(2000);
    }

    public void selectArrivalCity() throws InterruptedException {
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.linkText("Delhi (DEL)")).click();
        Thread.sleep(2000);
    }

    public void selectDepartureDate() throws InterruptedException {
        webDriver.findElement(By.id("custom_date_picker_id_1")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.linkText("30")).click();
        Thread.sleep(2000);
    }

    public void selectCurrency() throws InterruptedException {
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
        Thread.sleep(2000);
        webDriver.findElement(By.cssSelector("option[value='BDT']")).click();
        Thread.sleep(2000);
    }

    public void submitSearch() throws InterruptedException {
        webDriver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit")).click();
        Thread.sleep(2000);
    }

    public static void main(String[] args) throws InterruptedException {
        FlightBooking flightBooking = new FlightBooking();
        flightBooking.initializeWebDriver();
        flightBooking.selectDepartureCity();
        flightBooking.selectArrivalCity();
        flightBooking.selectDepartureDate();
        flightBooking.selectCurrency();
        flightBooking.submitSearch();
    }
}
