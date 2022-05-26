package com.planit.sca.model.pages;

import com.planit.sca.model.components.NavigationBar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    private NavigationBar<SearchResultsPage> navBar;

    public SearchResultsPage(WebDriver driver) {
        super(driver);
        navBar = new NavigationBar<SearchResultsPage>(this, driver);
    }

    public int getNumSearchItems() {
        // debugging print
        //System.out.println(driver.findElements(By.className("product-tile")).toString());

        // I believe this is a decent selector but it's returning more values than
        //     expected
        return driver.findElements(By.className("product-tile")).size();
    }
}
