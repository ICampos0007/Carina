package com.solvd.carina.web;

import com.solvd.carina.web.components.NikeButtonComponent;
import com.solvd.carina.web.components.ProductCard;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends AbstractPage {

    @FindBy(xpath = "//body/div[@id='__next']/div/main[@id='pageBodyContainer']/div/div[1]")
    private List<ProductCard> cards;
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public List<ProductCard> getCards() {
        return cards;
    }

    private List<NikeButtonComponent> nikeList;

    public List<NikeButtonComponent> getNikeList() {
        return nikeList;
    }
}
