package techproed.tests.dataprovider;

import org.testng.annotations.Test;
import techproed.utilities.DataProviderUtils;


public class Day25_C01_DataProviderTest4 {

//    Bu örnekde, data provider metodumuz farklı class'dan çağırarak kullanacağız.

    @Test (dataProvider = "musteriVerileri", dataProviderClass = DataProviderUtils.class)
    public void musteriVerileriTest(String username, String password, String sube){
        System.out.println("Username: " + username + " Password: " + password + " Sube: " + sube);
    }


    @Test (dataProvider = "musteriHizmetleriVerileri", dataProviderClass = DataProviderUtils.class)
    public void musteriHizmetleriVerileriTest(String username, String password){
        System.out.println("Username: " + username + " Password: " + password);
    }

    @Test(dataProvider = "personelVerileri", dataProviderClass = DataProviderUtils.class)
    public void personelVerileriTest(String username, String password){
        System.out.println("Username: " + username + " Password: " + password);
    }

    @Test (dataProvider = "customerData", dataProviderClass = DataProviderUtils.class)
    public void customerDataTest(String email, String password){
        System.out.println("EMAIL : "+email+" | SIFRE : "+password);
    }


}
