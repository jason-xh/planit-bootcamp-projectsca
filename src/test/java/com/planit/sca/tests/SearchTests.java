package com.planit.sca.tests;

import org.junit.jupiter.api.Test;

public class SearchTests extends BaseTestSuite {

    @Test
    public void verifySearchSpecificItem() {
        var itemName = new HomePage(driver)
            .setSearchText("WR7DCX+")
            .clickSearchBarButton()
            .getItemName();
        
        assertEquals(
            "Bosch Spark Plug Single WR7DCX+",
            itemName
        );
    }
}