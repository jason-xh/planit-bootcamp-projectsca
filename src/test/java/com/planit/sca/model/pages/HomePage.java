package com.planit.sca.model.pages;

import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private NavigationBar<HomePage> navBar;

    public HomePage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar<HomePage>(this, driver);
    }

    public HomePage setNavBarSearchText(String text) {
        navBar.setSearchText(text);
        return this;
    }

    // Search can return either a search results page, or a specific item if there
    // was only 1 search result.
    public ItemPage clickNavBarSearchBtn() {
        return navBar.clickSearchBtn();
    }


}
