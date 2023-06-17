package com.virgingames.pages;

import com.virgingames.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/label[1]")
    WebElement acceptCookie;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Free Games')]")
    WebElement freeGames;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Experience a Selection of Free Games')]")
    WebElement textMessage;

    public void clickOnAcceptCookie(){
        log.info("click On Accept Cookies" + acceptCookie.toString());
        clickOnElement(acceptCookie);
    }
    public void clickOnFreeGames(){
        log.info("click On Free Game" + freeGames.toString());
        clickOnElement(freeGames);
    }
    public String getTextMessage(){
        log.info("Get Text Message" + textMessage.toString());
        return getTextFromElement(textMessage);
    }
}
