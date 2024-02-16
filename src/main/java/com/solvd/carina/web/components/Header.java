package com.solvd.carina.web.components;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {
    @FindBy(xpath = "//input[@id = 'HeaderSearch_search_query']")
    private SearchLineComponent searchLineComponent;

    @FindBy(xpath = "//a[@class='Logo-link Link']//img[@alt='Foot Locker logo links to the home page']")
    private LogoComponent logoComponent;

    @FindBy(xpath = "//button[@aria-label='Search submit']")
    private SearchBarButtonComponent searchBarButtonComponent;

    @FindBy(xpath = "//input[@id='search']")
    private TargetSearchLineComponent targetSearchLineComponent;

    @FindBy(xpath = "//button[@aria-label='Open Search Modal']//*[name()='svg']")
    private NikeButtonComponent nikeButton;

    @FindBy(xpath = "(//img[contains(@class,'product-card__hero-image')])[1]")
    private NikeImageComponent nikeImage;

    @FindBy(xpath = "//a[normalize-space()='Nike Air Max 270']")
    private NikeTextComponent text;

    @FindBy(xpath = " //div[@id='%s']")
    private NikeIDComponent nikeID;

    @FindBy(xpath = "//a[@aria-label='Sale']")
    private NikeHoverComponent nikeHover;




    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public SearchLineComponent getSearchLineComponent() {
        return searchLineComponent;
    }

    public TargetSearchLineComponent getTargetSearchLineComponent() {
        return targetSearchLineComponent;
    }


    public LogoComponent getLogoComponent() {
        return logoComponent;
    }

    public SearchBarButtonComponent getSearchBarButtonComponent() {
        return searchBarButtonComponent;
    }

    public NikeButtonComponent getNikeButton() {
        return nikeButton;
    }

    public NikeImageComponent getNikeImage() {
        return nikeImage;
    }

    public NikeTextComponent getNikeText() {
        return text;
    }

    public NikeIDComponent getNikeID() {
        return nikeID;
    }

    public NikeHoverComponent getNikeHover() {
        return nikeHover;
    }
}
