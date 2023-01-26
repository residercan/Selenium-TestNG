package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

//    Page objelerini bu sınıfta buluruz.

//    1. Adım constructor oluşturmalıyız
//    PageFactory sleniumdan gelen ve bu sayfa elementlerini başlangıç değeri vermek için kullanılır.
//    Bu şekilde sayfa objeleri çağırıldığında null pointer alınmaz.
//    Her sınıfta olmazsa olmaz bu adım kullanılır.
    public OpenSourcePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

//    PAGE OBJELERİNİ OLUŞTUR
//    Geleneksel yol ile WebElement bulma yöntemimiz buydu : public WebElement username = Driver.getDriver().findElement(By.name("username));


    @FindBy(name = "username")
    public WebElement username;


    @FindBy (xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy (xpath = "//*[@type='submit']")
    public WebElement submitButton;


}
