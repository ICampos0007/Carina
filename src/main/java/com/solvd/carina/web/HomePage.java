package com.solvd.carina.web;


import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {
    @FindBy(xpath = "//header//input[@id = 'HeaderSearch_search_query']")

    /* Naming conventions
         use camelCase, not PascalCase:
            - camelCase is for non-final variables and methods, PascalCase is reserved for java
            classes
                - for example... `ExtendedWebElement` and `HomePage` are classes, searchBar is a
                    variable, getSearchBar() and isSearchBarPresent() are methods
     */

    private ExtendedWebElement searchBar;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void  typeSearchInputValue(String value) {
        searchBar.sendKeys(value);
    }

    public ExtendedWebElement getSearchBar() {
        return searchBar;
    }

    public ExtendedWebElement isSearchBarPresent() {
        return searchBar;
    }
}
