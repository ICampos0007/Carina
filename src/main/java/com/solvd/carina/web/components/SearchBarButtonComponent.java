package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchBarButtonComponent extends AbstractUIObject {
    @FindBy(xpath = "//button[@aria-label='Search submit']")
    private ExtendedWebElement searchBarButton;

    @FindBy(xpath = "//button[normalize-space()='search']")
    private ExtendedWebElement targetSearchButton;

    public SearchBarButtonComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }


    public ExtendedWebElement getSearchBarButton() {
        return searchBarButton;
    }

    public ExtendedWebElement getTargetSearchButton() {
        return targetSearchButton;
    }
    public void clickSearchBarButton() {
        searchBarButton.click();
    }
}
