package com.planit.sca.model.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BasePage {

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public List<String> getProductNames() {
        // this may not be the most ideal way to do this
        List<String> productNames = new ArrayList<String>();
        List<WebElement> productWebElements = driver.findElements(By.className("name"));

        for (WebElement element : productWebElements) {
            productNames.add(element.getText());
        }

        // I couldn't get forEach to work with an anonymous function for some reason
        /*
        productWebElements.forEach(element -> {
            productNames.add(element.getText());
        });
        */
        return productNames;
    }
}
