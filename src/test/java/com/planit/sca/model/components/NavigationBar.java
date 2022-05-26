package com.planit.sca.model.components;

import com.planit.sca.model.pages.CartPage;
import com.planit.sca.model.pages.ItemPage;
import com.planit.sca.model.pages.SearchResultsPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// May need to restrict type for better type safety, if I wanna do that
//     I'm going to have to use an interface as David mentioned because 
//     if we restrict the type to the BasePage, we're not going to be able to call methods
//     specific to the other pages
// NOTE: perhaps inheritance may have been a better solution but
//       I wanted to try implementing a navbar compositionally
public class NavigationBar<T> {
    protected WebDriver driver;
    private T parentPage;

    public NavigationBar(T page, WebDriver parentDriver) {
        parentPage = page;
        driver = parentDriver;
    }
    
    public T setSearchText(String text) {
        driver.findElement(By.className("search-text")).sendKeys(text);
        return parentPage;
    }

    // Search can return either a search results page, or a specific item if there
    // was only 1 search result. My solution is to separate them for now but it seems
    // messy. I considered using a base page and extending it for ItemPage and
    // SearchResultsPage but it didn't make much sense as they don't have much in common
    // I also considered giving clickSearchBtn an optional argument or string argument
    // to specify which type of search it was but Java doesn't support optional arguments
    // and both options would result in the method having 2 return statements + would
    // need to use a generic or something for the method return type.
    public ItemPage clickSearchBtnSingle() {
        // i'm not sure why but one click does not work, it might 
        // need a sleep, but this is faster and seems to work consistently
        driver.findElement(By.className("search-button")).click();
        driver.findElement(By.className("search-button")).click();
        
        return new ItemPage(driver);
    }

    public SearchResultsPage clickSearchBtnMulti() {
        driver.findElement(By.className("search-button")).click();
        driver.findElement(By.className("search-button")).click();
        
        return new SearchResultsPage(driver);
    }

    public CartPage clickCartBtn() {
        driver.findElement(By.id("mini-cart")).click();
        return new CartPage(driver);
    }
}
