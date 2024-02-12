package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LogoComponent extends AbstractUIObject {

    @FindBy(xpath = "//a[@class='Logo-link Link']//img[@alt='Foot Locker logo links to the home page']")
    private ExtendedWebElement footLockerLogo;
    public LogoComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
