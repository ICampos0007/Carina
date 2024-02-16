package com.solvd.carina;

import com.solvd.carina.web.NikePage;
import com.solvd.carina.web.components.NikeButtonComponent;
import com.solvd.carina.web.components.NikeIDComponent;
import com.solvd.carina.web.components.NikeImageComponent;
import com.solvd.carina.web.components.NikeTextComponent;
import com.zebrunner.carina.core.AbstractTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class NikePageTest extends AbstractTest {
    @Test(enabled = false)
    public void verifyNikeList() {
        WebDriver driver = getDriver();
        NikePage page = new NikePage(driver);
        SoftAssert softAssert = new SoftAssert();
        page.open();
        NikeButtonComponent nikeButtonComponent = page.getHeader().getNikeButton();
        softAssert.assertTrue(nikeButtonComponent.getRootExtendedElement().isElementPresent(1),"Button is not here.");


        NikeImageComponent nikeImageComponent = page.getHeader().getNikeImage();
        softAssert.assertTrue(nikeImageComponent.getRootExtendedElement().isElementPresent(1),"The nike image is not present.");

        NikeTextComponent nikeTextComponent = page.getHeader().getNikeText();
        String actualText = nikeTextComponent.getText();
//        change expected text to make it fail.
        String expectedText = "Nike Air Max 270";
        softAssert.assertEquals(actualText, expectedText, "Text is not as expected.") ;


        // Assert all conditions
        softAssert.assertAll();

    }

    @Test(enabled = false)
    public void verifyNikeID() {
        WebDriver driver = getDriver();
        NikePage page = new NikePage(driver);
        SoftAssert softAssert = new SoftAssert();
        page.open();

        // Define the ID to be used
        String idToTest = "nav-cart";

        // Get the NikeIDComponent using the provided ID
        NikeIDComponent nikeIDComponent = page.getHeader().getNikeID();

        // Use String.format to replace the placeholder with the provided ID
        String formattedId = String.format(idToTest);


        // Verify if the element with the formatted XPath is present
        softAssert.assertTrue(nikeIDComponent.getRootExtendedElement().isElementPresent(), "Element with ID " + formattedId + " is not present.");

        softAssert.assertAll();

    }
}
