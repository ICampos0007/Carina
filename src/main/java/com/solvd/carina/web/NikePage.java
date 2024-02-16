package com.solvd.carina.web;

import com.solvd.carina.web.components.Header;
import com.zebrunner.carina.utils.config.Configuration;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NikePage extends AbstractPage {
    @FindBy(xpath = "//header")
    private Header header;

    public NikePage(WebDriver driver) {
        super(driver);
    }

    public Header getHeader() {
        return header;
    }

    @Override
    public void open() {
        openURL(Configuration.getRequired("nike_url"));
    }

}
