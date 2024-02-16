package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikeTextComponent extends AbstractUIObject {
    @FindBy(xpath = "//a[normalize-space()='Nike Air Max 270']")
    private ExtendedWebElement text;
    public NikeTextComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
    public String getText() {
        return text.getText();

    }
}
