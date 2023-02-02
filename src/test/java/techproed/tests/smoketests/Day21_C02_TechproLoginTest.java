package techproed.tests.smoketests;

import org.testng.annotations.Test;
import techproed.pages.TechproLoginPage;
import techproed.pages.TechproLogoutPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_C02_TechproLoginTest {


    @Test(groups = "regression-tests")
    public void techproLoginTest(){

        TechproLoginPage techproLoginPage = new TechproLoginPage();
        Driver.getDriver().get(ConfigReader.getProperty("techpro_login_page_url"));
        techproLoginPage.username.sendKeys(ConfigReader.getProperty("techpro_login_page_username"));
        techproLoginPage.password.sendKeys(ConfigReader.getProperty("techpro_login_page_password"));
        techproLoginPage.submitButton.click();


        TechproLogoutPage techproLogoutPage = new TechproLogoutPage();
        assert techproLogoutPage.secureArea.isDisplayed();
        techproLogoutPage.logout.click();

        assert techproLoginPage.loginPage.isDisplayed();



    }


}
