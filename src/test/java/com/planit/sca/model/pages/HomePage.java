package com.planit.sca.model.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public NavigationBar navBar; // considered making this private, but then would need to make another method in HomePage for every method of navBar

    public HomePage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar();
    }


}
