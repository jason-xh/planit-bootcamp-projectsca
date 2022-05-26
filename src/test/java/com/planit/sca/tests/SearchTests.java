package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.planit.sca.model.pages.HomePage;

import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTestSuite {

    @Test
    public void verifySearchSpecificItem() {
        String itemName = new HomePage(driver)
            .setNavBarSearchText("WR7DCX+")
            .clickNavBarSearchBtn()
            .getItemName();
        
        assertEquals(
            "Bosch Spark Plug Single WR7DCX+",
            itemName
        );
    }
}