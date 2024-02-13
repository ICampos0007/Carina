package com.solvd.carina;

import com.solvd.carina.web.HomePage;
import com.solvd.carina.web.SearchPage;
import com.solvd.carina.web.components.LogoComponent;
import com.solvd.carina.web.components.SearchBarButtonComponent;
import com.solvd.carina.web.components.SearchLineComponent;
import com.zebrunner.carina.core.AbstractTest;
import com.zebrunner.carina.utils.config.Configuration;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomePageTest extends AbstractTest {


    @Test(enabled = false)
    public void verifyURLTest() {
        WebDriver webDriver = getDriver();
        HomePage page = new HomePage(webDriver);
        SoftAssert softAssert = new SoftAssert();
        page.open();
        SearchLineComponent searchLineComponents = page.getHeader().getSearchLineComponent();
        String correctURL = Configuration.getRequired("PROD.home_url");
        softAssert.assertEquals(webDriver.getCurrentUrl(),correctURL,"This is not the correct url");

        softAssert.assertAll();

    }
    @Test(enabled = false)
    public void verifySearchLineTest() {
        String brandName = "adidas";

        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage page = new HomePage(driver);
        page.open();
        System.out.println();
        SearchLineComponent searchLineComponent = page.getHeader().getSearchLineComponent();
        softAssert.assertTrue(searchLineComponent.getRootExtendedElement().isElementPresent(1),"Search line is not present");
        softAssert.assertEquals(searchLineComponent.getSearchBarPlaceHolder(),"Search","Search bar has incorrect placeholder");

        searchLineComponent.searchBarInputValue(brandName);

        searchLineComponent.clickSearchBar();

        softAssert.assertTrue(driver.getCurrentUrl().contains(brandName.toLowerCase()),"URL does not contain the brand name");

        softAssert.assertAll();
    }

    @Test(enabled = false)
    public void verifySearchBarButton() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage page = new HomePage(driver);
        page.open();
        SearchBarButtonComponent searchBarButtonComponent = page.getHeader().getSearchBarButtonComponent();
        softAssert.assertTrue(searchBarButtonComponent.getRootExtendedElement().isElementPresent(1),"Search button not present.");
        searchBarButtonComponent.clickSearchBarButton();

        softAssert.assertAll();
    }

    @Test(enabled = false)
    public void verifyFootLockerLogoTest() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = getDriver();
        HomePage page = new HomePage(driver);
        page.open();
        LogoComponent logoComponent = page.getHeader().getLogoComponent();
        softAssert.assertTrue(logoComponent.getRootExtendedElement().isElementPresent(1),"FootLocker logo not present.");

        softAssert.assertAll();
    }
}
