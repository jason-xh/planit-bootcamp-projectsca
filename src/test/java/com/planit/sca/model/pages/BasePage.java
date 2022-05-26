package com.planit.sca.model.pages;

import org.openqa.selenium.WebDriver;

// Largely empty at the moment so this base page may seem
// redundant, but may need to add things after. 
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

}
