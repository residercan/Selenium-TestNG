package techproed.utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] musteriVerileri() {
        Object [][] musteriGirisBilgileri = {
                {"maneger1" , "12345", "Besiktas"},
                {"maneger2", "98765", "Kadıkoy"},
                {"maneger3", "5678", "Ortakoy"},
        };
        return musteriGirisBilgileri;
    }


    @DataProvider
    public Object[][] musteriHizmetleriVerileri() {
        Object [][] musteriHizmetleriGirisBilgileri = {
                {"adam1" , "3456"},
                {"ali2", "1234"},
                {"nancy3", "7898"},
        };
        return musteriHizmetleriGirisBilgileri;
    }


    @DataProvider
    public Object[][] personelVerileri() {
        Object [][] personelGirisBilgileri = {
                {"rukiye1" , "abc1"},
                {"mehmet2", "123r"},
                {"emin3", "3edc"},
                {"baran4", "def2"},
                {"okumus5", "efs5"},
        };
        return personelGirisBilgileri;
    }


//    Excel'den dataprovider'a data gelecek ve burdan da Test Case göndereceğiz.


    @DataProvider
    public Object[][] customerData(){
        String path = "src/test/java/resources/mysmoketestdata.xlsx";
        String sheetName = "customer_info";
        ExcelUtils excelUtils = new ExcelUtils(path, sheetName);
        //    getDataArrayWithoutFirstRow(); == Excel dosyasındaki satır haric bütün satırları bana ver
        Object[][] musteriBilgileri = excelUtils.getDataArrayWithoutFirstRow();
        return musteriBilgileri;
    }


}

