package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TeknosaPage {
    public TeknosaPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }

@FindBy(xpath = "//*[@text='Atla']")
    public WebElement atlaButonu;

    @FindBy(xpath = "//*[@text='Kategoriler']")
    public WebElement kategorilerButonu;

    @FindBy(xpath = "//*[@text='Filtrele']")
    public WebElement FiltreleButonu;

    @FindBy(xpath = "//*[@text='Marka']")
    public WebElement markaButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement markaMetinYazmaKutusu;

    @FindBy(xpath = " (//*[@class='android.view.ViewGroup'])[25]")
    public WebElement filtrelenmisMarkaKutusu;

    @FindBy(xpath = "//*[@text='Sonuçları Göster']")
    public WebElement SonuclariGosterButonu;



}
