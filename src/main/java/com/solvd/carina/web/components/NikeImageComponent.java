package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikeImageComponent extends AbstractUIObject {

    @FindBy(xpath = "(//img[contains(@class,'product-card__hero-image')])[1]")
    private ExtendedWebElement image;

    public NikeImageComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
