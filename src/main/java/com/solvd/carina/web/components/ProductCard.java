package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class ProductCard extends AbstractUIObject {
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[3]/div/div[2]/div/div[2]/ul[1]/li[1]/div/a/span[1]/span[1]")
    private ExtendedWebElement titleElement;
    public ProductCard(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getTitleElement() {
        return titleElement;
    }

    public String getSpanText() {
        return titleElement.getAttribute("span");
    }
}
