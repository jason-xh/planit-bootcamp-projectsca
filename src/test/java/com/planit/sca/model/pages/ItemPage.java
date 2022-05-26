package com.planit.sca.model.pages;

import org.openqa.selenium.By;

//import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    // nav bar is currently not used
    //private NavigationBar<ItemPage> navBar;

    public ItemPage(WebDriver driver) {
        super(driver);
        //navBar = new NavigationBar<ItemPage>(this);
    }

    public String getItemName() {
        return driver.findElement(By.className("js-product-name")).getText();
    }
}
