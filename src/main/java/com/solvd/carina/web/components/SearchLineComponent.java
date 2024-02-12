package com.solvd.carina.web.components;

import com.solvd.carina.web.SearchPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class SearchLineComponent extends AbstractUIObject {
    @FindBy(xpath = "//input[@id='HeaderSearch_search_query']")
    private ExtendedWebElement searchBar;



    public SearchLineComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getSearchBar() {
        return searchBar;
    }


    public String getSearchBarPlaceHolder() {
        return searchBar.getAttribute("placeholder");
    }

    public void searchBarInputValue(String value) {
        searchBar.type(value);
    }

    public SearchPage clickSearchBar() {
        searchBar.click();
        return new SearchPage(getDriver());
    }
}
