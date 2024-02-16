package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikeButtonComponent extends AbstractUIObject {

    @FindBy(xpath = "//button[@aria-label='Open Search Modal']//*[name()='svg']")
    private ExtendedWebElement button;


    public NikeButtonComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

}
