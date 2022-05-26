package com.planit.sca.model.pages;

import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private NavigationBar<HomePage> navBar;

    public HomePage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar<HomePage>(this);
    }




}
