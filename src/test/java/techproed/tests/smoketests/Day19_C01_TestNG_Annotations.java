package techproed.tests.smoketests;

import org.testng.annotations.*;

public class Day19_C01_TestNG_Annotations {

    /*

    @Test : Test case oluşturmak için kullanılır.
    @Before ve @After : 5 Before 5 After annotation var.
    Suite > Test > Grup > Class > Method
    @BeforeSuite : her bir test suite'den önce 1 sefer çalışır.
    @AfterSuite : her bir test suite'den sonra 1 sefer çalışır.
    @BeforeTest : her bir test'den önce (Test Case ile karıştırılmamalı) 1 sefer çalışır.
    @AfterSuite : her bir test'den sonra (Test Case ile karıştırılmamalı) 1 sefer çalışır.
    @BeforeClass : her bir classdan önce 1 sefer çalışır.
    @AfterClass : her bir classdan sonra 1 sefer çalışır.
    @BeforeMethod : her bir @Test annotationdan önce 1 sefer çalışır. JUnit'deki karşılığı @Before
    @AfterMethod : her bir @Test annotationdan sonra 1 sefer çalışır. JUnit'deki karşılığı @After
    ------------------------------------------------------------------------------------------------
    @Ignore : @Test'i çalıştırmak istemiyorsak, atlamak istiyorsak yanına @Ignore annotation yazılır.
    @Test(enabled = false) : @Test caseleri kullanıma kapatmak için kullanılır, devre dışı bırakmak için.
    ------------------------------------------------------------------------------------------------
    TestNG'de test case'ler isim sırasına göre çalışır.
    @Test(priority = 1) : Test caseleri öncelemek için kullanılır.
    NOT : default priortiy'nin değeri 0'a eşittir.
    @Test = @Test(priority = 0)

     */


    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before Groups");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @AfterGroups
    public void afterGroups(){
        System.out.println("After Groups");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After Class");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }



    @Test(priority = 3, groups = "regression-tests")
    public void test1() throws Exception {
        System.out.println("Test 1");
    }
    @Test @Ignore
    public void test2() throws Exception {
        System.out.println("Test 2");
    }
    @Test(enabled = false)
    public void test3() throws Exception {
        System.out.println("Test 3");
    }
    @Test(priority = 1)
    public void test4() throws Exception {
        System.out.println("Test 4");
    }
    @Test(priority = -5, groups = "regression-tests")
    public void test5() throws Exception {
        System.out.println("Test 5");
    }
    @Test(priority = 2)
    public void test6() throws Exception {
        System.out.println("Test 6");
    }

//    test5>test4>test6>test1 verdiğimiz priority(öncelik) sırasına göre çalıştı.
}
