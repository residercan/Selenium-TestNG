package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproLogoutPage {

    public TechproLogoutPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//*[.=' Logout']")
    public WebElement logout;

    @FindBy (xpath = "//*[.=' Secure Area']")
    public WebElement secureArea;

}

