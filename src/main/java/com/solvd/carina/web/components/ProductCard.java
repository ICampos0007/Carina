package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductCard extends AbstractUIObject {
    @FindBy(xpath = "//a[@aria-label=\"PlayStation 5 Console Marvel's Spider-Man 2 Bundle\"]")
    private ExtendedWebElement titleElement;
    public ProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getTitleElement() {
        return titleElement;
    }

    public String getTittleText() {
        return titleElement.getAriaRole();
    }


}
