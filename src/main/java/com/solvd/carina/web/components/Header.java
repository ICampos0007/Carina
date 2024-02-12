package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//input[@id = 'HeaderSearch_search_query']")
    private SearchLineComponent searchLineComponent;

    @FindBy(xpath = "//a[@class='Logo-link Link']//img[@alt='Foot Locker logo links to the home page']")
    private LogoComponent logoComponent;

    @FindBy(xpath = "//button[@aria-label='Search submit']")
    private SearchBarButtonComponent searchBarButtonComponent;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SearchLineComponent getSearchLineComponent() {
        return searchLineComponent;
    }

    public LogoComponent getLogoComponent() {
        return logoComponent;
    }

    public SearchBarButtonComponent getSearchBarButtonComponent() {
        return searchBarButtonComponent;
    }
}
