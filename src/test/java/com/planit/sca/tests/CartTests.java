package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.planit.sca.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class CartTests extends BaseTestSuite {

    // NOTE: this test failed just before the clickAddToCartBtn() step once
    // but I was unable to recreate the issue
    @Test
    public void verifyAddToCart() {
        List<String> productNamesInCart = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtnSingle()
            .clickAddToCartBtn()
            .clickNavBarCartBtn()
            .getProductNames();
            
        assertEquals(
            "Bosch Spark Plug Single WR7DCX+", 
            productNamesInCart.get(0)
        );
        assertEquals(
            1, 
            productNamesInCart.size()
        );
    }
}