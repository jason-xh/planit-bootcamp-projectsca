package com.planit.sca.model.pages;

import org.openqa.selenium.WebDriver;

// Largely empty at the moment so this base page may seem
// redundant, but may need to add things after. TODO: Considering I'm using
// composition (with the nav bar), maybe I shouldn't do any inheritance
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
