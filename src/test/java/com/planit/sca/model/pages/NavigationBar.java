package com.planit.sca.model.pages;

/*
TODO: I'm not entirely sure if this folder is the best place to put this file,
consider making another folder called "components" or something?
*/
public class NavigationBar {
    protected WebDriver driver;
    
    public CartPage clickCartButton() {
        driver.findElement(By.cssSelector()).click();
        return new CartPage(driver)
    }
}
