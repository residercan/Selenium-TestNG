package techproed.tests.smoketests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourceDashboardPage;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day21_C01_OpenSourceLogin {



    @Test
    public void openSourceLogin() throws InterruptedException {

//        1. Adım Sayfaya git
//        Driver.getDriver().get("") HARD CODE
        Driver.getDriver().get(ConfigReader.getProperty("open_source_url")); //DİNAMİK KOD

//        2. Adım Page Objesi Oluştur
        OpenSourcePage openSourcePage = new OpenSourcePage();

//        3. Adım Bu objeyi kullanarak o class'daki objelere ulaş
        openSourcePage.username.sendKeys(ConfigReader.getProperty("open_source_username"));//Page package'nde oluşturduğumuz verileri girerek dinamik kod oluşturuyoruz
        openSourcePage.password.sendKeys(ConfigReader.getProperty("open_source_password"));//Page package'nde oluşturduğumuz verileri girerek dinamik kod oluşturuyoruz
        openSourcePage.submitButton.click();

//        4. Adım Assertion yapalım
        OpenSourceDashboardPage openSourceDashboardPage = new OpenSourceDashboardPage();
        Thread.sleep(10000);
        Assert.assertTrue(openSourceDashboardPage.dashboardHeader.isDisplayed());



    }
}
