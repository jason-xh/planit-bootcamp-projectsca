package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.planit.sca.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTestSuite {

    @Test
    public void verifySearchSpecificItem() {
        // Type inference is not working, I believe Java's type inference
        // does not like generics and we use generics for the navigation bar
        String itemName = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtnSingle()
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
            .clickNavBarSearchBtnSingle()
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
            .clickNavBarSearchBtnSingle()
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

    // TODO: unfinished, getNumSearchItems returning higher value than expected
    @Test
    public void verifySearchMultipleItems() {
        int numSearchItems = new HomePage(driver)
            .setNavBarSearchText("castrol 10w-40")
            .clickNavBarSearchBtnMulti()
            .getNumSearchItems();

        assertTrue(numSearchItems > 1);
    }
}