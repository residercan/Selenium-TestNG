package techproed.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day20_C03_Driver_Config_Test {




    @Test
    public void firstTest() throws Exception {

//        amazon'a git
//        Driver.getDriver().get("https://www.amazon.com");
//        ConfigReader.getProperty("amazon_url") -> http://www.amazon.com
        Driver.getDriver().get(ConfigReader.getProperty("amazon_url")); // driver.get("http://www.amazon.com")
//        title'in amazon içerdiğini test et
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Amazon"));

//        close driver
        Driver.closeDriver();


    }
}
