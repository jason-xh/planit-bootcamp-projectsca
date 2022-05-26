package com.planit.sca.model.pages;

import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class ItemPage extends BasePage {
    private NavigationBar<ItemPage> navBar;

    public ItemPage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar<ItemPage>(this, driver);
    }

    public String getItemName() {
        return driver.findElement(By.className("js-product-name")).getText();
    }

    public String getItemQty() {
        // experimented around with the selector for item quantity, this seemed to be
        // the best way to retrieve it
        return driver.findElement(By.className("ui-spinner-input")).getAttribute("value");
    }

    public ItemPage clickIncrementItemQty() {
        driver.findElement(By.className("ui-spinner-up")).click();
        return this;
    }

    public ItemPage clickDecrementItemQty() {
        driver.findElement(By.className("ui-spinner-down")).click();
        return this;
    }

    public ItemPage clickAddToCartBtn() {
        driver.findElement(By.id("add-to-cart")).click();
        return this;
    }
    public CartPage clickNavBarCartBtn() {
        return navBar.clickCartBtn();
    }
}
