package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planit.sca.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTestSuite {

    @Test
    public void verifySearchSpecificItem() {
        // Type inference is not working, I believe Java's type inference
        // does not like generics
        String itemName = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtn()
            .getItemName();
        
        assertEquals(
            "Bosch Spark Plug Single WR7DCX+",
            itemName
        );
    }

    @Test
    public void verifyIncrementOnItemPage() {
        String itemQty = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtn()
            .clickIncrementItemQty()
            .getItemQty();
        
        assertEquals(
            "2", 
            itemQty
        );
    }

    @Test
    public void verifyDecrementOnItemPage() {
        String itemQty = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtn()
            .clickIncrementItemQty()
            .clickIncrementItemQty()
            .clickIncrementItemQty()
            .clickDecrementItemQty()
            .getItemQty();

        assertEquals(
            "3", 
            itemQty
        );
    }
}