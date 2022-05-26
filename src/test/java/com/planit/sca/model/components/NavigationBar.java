package com.planit.sca.model.components;

import com.planit.sca.model.pages.CartPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// May need to restrict type
// NOTE: perhaps inheritance may have been a better solution but
//       I wanted to try implementing a navbar compositionally
public class NavigationBar<T> {
    protected WebDriver driver;
    private T parentPage;

    public NavigationBar(T page) {
        parentPage = page;
    }
    
    public CartPage clickCartButton() {
        driver.findElement(By.cssSelector("mini-cart")).click();
        return new CartPage(driver);
    }

    public T setSearchText(String text) {
        driver.findElement(By.className(".search-text.valid")).sendKeys(text);
        return parentPage;
    }
}
