package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikeHoverComponent extends AbstractUIObject {
    @FindBy(xpath = "//a[@aria-label='Sale']")
    public ExtendedWebElement nikeHover;

    @FindBy(xpath = "//a[@aria-label='main-menu, Sale, Men, Shoes']")
    public ExtendedWebElement nikeHoverClick;
    public NikeHoverComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public void clickNikeHover() {
        nikeHoverClick.click();
    }
}
