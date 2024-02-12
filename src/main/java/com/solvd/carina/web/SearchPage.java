package com.solvd.carina.web;

import com.solvd.carina.web.components.ProductCard;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractUIObject {

    @FindBy(xpath = "//div[@class='Page-body constrained']//ul[1]//li[1]//div[1]//a[1]")
    private List<ProductCard> cards;
    public SearchPage(WebDriver driver) {
        super(driver);
    }
}
