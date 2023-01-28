package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day20_C01_DependsOnMethods {

    /*
    TestNG de tum  @Test metotlar bitbirlerinden bagimsiz olarak calisirlat
    Eger methodlari bagimli hale getirmek istersem, dependsOnMethods parametresi kullanilir
    Burdaki ornekde, searchTest methodu homeTest methoduna bagimlidir
    searchTest den once homeTest calisir
    Eger homeTest basarili ise searchTest calisir.
    Eget homeTest basarisiz ise, searchTest IGNORE edilir
    */


    @Test
    public void homeTest() throws Exception {
        System.out.println("Home test");
//        Assert.assertTrue(false);
    }

    @Test(dependsOnMethods = "homeTest")
    public void searchTest () throws Exception {
        System.out.println("Search test");
    }

    @Test
    public void paymentTest () throws Exception {
        System.out.println("Payment test");
    }



}
