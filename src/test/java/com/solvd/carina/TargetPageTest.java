package com.solvd.carina;

import com.solvd.carina.web.SearchPage;
import com.solvd.carina.web.TargetPage;
import com.solvd.carina.web.components.TargetSearchLineComponent;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.config.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class TargetPageTest extends AbstractTest {
    @Test(enabled = false)
    public void verifyURLTest() {
        WebDriver driver = getDriver();
        TargetPage page = new TargetPage(driver);
        SoftAssert softAssert = new SoftAssert();
        page.open();
        TargetSearchLineComponent targetSearchLineComponent = page.getHeader().getTargetSearchLineComponent();
        String correctURL = Configuration.getRequired("target_url");
        softAssert.assertEquals(driver.getCurrentUrl(),correctURL,"This is not the correct url");

        softAssert.assertAll();
    }

    @Test(enabled = false)
    public void verifySearchTest() {
        String targetSearch = "playstation";

        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = getDriver();

        TargetPage page = new TargetPage(driver);
        page.open();
        System.out.println();
        TargetSearchLineComponent targetSearchLineComponent = page.getHeader().getTargetSearchLineComponent();
        targetSearchLineComponent.targetSearchBarInputValue(targetSearch.toLowerCase());

        SearchPage searchPage = targetSearchLineComponent.clickTargetSearchBar();
//        keeps faling when the target search name is there.
        softAssert.assertTrue(driver.getCurrentUrl().contains(targetSearch.toLowerCase()),"URL does not contain the target search name");

//        List<ProductCard> cards = searchPage.getCards();
//        for (ProductCard card : cards) {
//            softAssert.assertTrue(card.getTittleText().toLowerCase().contains(targetSearch.toLowerCase()), String.format("Product with target name does not match "));
//        }

        softAssert.assertAll();
    }

}
