package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikeIDComponent extends AbstractUIObject {

//    @FindBy(xpath = "//a[@title='Favorites']//*[name()='svg']")
@FindBy(xpath = " //div[@id='%s']")
private ExtendedWebElement nikeID;




    public NikeIDComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
