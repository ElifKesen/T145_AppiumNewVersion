package stepDefinitions;

import io.cucumber.java.en.Given;
import pages.TeknosaPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TeknosaStepDef {

    TeknosaPage page=new TeknosaPage();

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();

    }
    @Given("Ilk ekran bolumunden atlaya tiklanir")
    public void ilk_ekran_bolumunden_atlaya_tiklanir() {
       page.atlaButonu.click();
       ReusableMethods.bekle(3);
    }

    @Given("footer bolumunden {string} bolumune tiklanir")
    public void footer_bolumunden_bolumune_tiklanir(String string) {
        page.kategorilerButonu.click();
        ReusableMethods.bekle(3);
    }

    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_bolumune_tiklanir(String kisiselBakim) {
        ReusableMethods.scrollWithUiScrollableAndClick(kisiselBakim);
        ReusableMethods.bekle(6);
    }

    @Given("acilan sayfadan {string} secimi yapilir")
    public void acilan_sayfadan_secimi_yapilir(String sac) {
        ReusableMethods.scrollWithUiScrollableAndClick(sac);
        ReusableMethods.bekle(3);

    }
    @Given("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
        page.FiltreleButonu.click();
        ReusableMethods.bekle(3);

    }
    @Given("Marka {string} bolumunden marka secimi yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String marka) {
        page.markaButonu.click();
        ReusableMethods.bekle(3);
        page.markaMetinYazmaKutusu.sendKeys(marka);
        ReusableMethods.bekle(3);
        page.filtrelenmisMarkaKutusu.click();
        ReusableMethods.bekle(3);
        page.SonuclariGosterButonu.click();

    }
    @Given("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_secilir(String string) {

    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() {

    }

}
