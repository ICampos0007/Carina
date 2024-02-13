package com.solvd.carina.web.components;

import com.solvd.carina.web.SearchPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class TargetSearchLineComponent extends AbstractUIObject {
    @FindBy(xpath = "//input[@id='search']")
    private ExtendedWebElement targetSearchBar;
    public TargetSearchLineComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getTargetSearchBar() {
        return targetSearchBar;
    }

    public void targetSearchBarInputValue(String value) {
        targetSearchBar.type(value);
    }

    public SearchPage clickTargetSearchBar() {
        targetSearchBar.click();
        return new SearchPage(getDriver());
    }

}
