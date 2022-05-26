package com.planit.sca.model.components;

import com.planit.sca.model.pages.CartPage;
import com.planit.sca.model.pages.ItemPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// May need to restrict type
// NOTE: perhaps inheritance may have been a better solution but
//       I wanted to try implementing a navbar compositionally
public class NavigationBar<T> {
    protected WebDriver driver;
    private T parentPage;

    public NavigationBar(T page, WebDriver parentDriver) {
        parentPage = page;
        driver = parentDriver;
    }
    
    public CartPage clickCartButton() {
        driver.findElement(By.cssSelector(".mini-cart")).click();
        return new CartPage(driver);
    }

    public T setSearchText(String text) {
        driver.findElement(By.className("search-text")).sendKeys(text);
        return parentPage;
    }

    public ItemPage clickSearchBtn() {
        // i'm not sure why but one click does not work
        // it might need a sleep, but this is faster
        driver.findElement(By.className("search-button")).click();
        driver.findElement(By.className("search-button")).click();
        return new ItemPage(driver);
    }
}
