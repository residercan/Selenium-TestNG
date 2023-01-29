package techproed.tests.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day24_C01_DataProviderTest1 {

    //    DATA PROVIDER
    @DataProvider
    public Object[][] urunler(){
        Object urunListesi[][] = {
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }

//    TEST METHODU
    @Test (dataProvider = "urunler")
    public void aramaTesti(String data){

        System.out.println(data);

    }

//    GOOGLE ARAMASI
    @Test (dataProvider = "urunler")
    public void googleAramasi(String araclar){
//        google'a git
        Driver.getDriver().get("https://www.google.com");
//        COOKIES CIKANLAR ICIN
//        try {
//            Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
//        }catch (Exception e){
//        }
//        araçları arama kutusuna gir ve enter'a bas
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar+ Keys.ENTER);
//        sayfa title'nın aradığım kelimeyi içerdiğini assert et
        Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
//        driver'ı kapat
        Driver.closeDriver();

    }


}