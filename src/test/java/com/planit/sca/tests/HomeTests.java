package com.planit.sca.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.planit.sca.model.pages.HomePage;

public class HomeTests extends BaseTestSuite {
    
    @Test
    public void verifyHomePageLoad() {

        boolean bannerVisible = new HomePage(driver)
            .isBannerVisible();
        
        assertEquals(
            true,
            bannerVisible
        );
    }

}
