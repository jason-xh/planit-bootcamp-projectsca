package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.planit.sca.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class CartTests extends BaseTestSuite {
    @Test
    public void verifyAddToCart() {
        List<String> productNamesInCart = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtn()
            .clickAddToCartBtn()
            .clickNavBarCartBtn()
            .getProductNames();
            
        assertEquals(
            "Bosch Spark Plug Single WR7DCX+", 
            productNamesInCart.get(0)
        );
    }
}