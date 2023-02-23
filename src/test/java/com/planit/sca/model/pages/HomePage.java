package com.planit.sca.model.pages;

import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private NavigationBar<HomePage> navBar;

    public HomePage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar<HomePage>(this, driver);
    }

    public boolean isBannerVisible() {
        return driver.findElement(By.className("content-full")).isDisplayed();
    }

    public HomePage setNavBarSearchText(String text) {
        navBar.setSearchText(text);
        return this;
    }


    public ItemPage clickNavBarSearchBtnSingle() {
        return navBar.clickSearchBtnSingle();
    }

    public SearchResultsPage clickNavBarSearchBtnMulti() {
        return navBar.clickSearchBtnMulti();
    }


}
