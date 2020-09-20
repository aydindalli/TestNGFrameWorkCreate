package com.aydindalli.tests;

import com.aydindalli.pages.AmazonPage;
import com.aydindalli.pages.GlbTraderPage;
import com.aydindalli.utilities.ConfigurationReader;
import com.aydindalli.utilities.Driver;
import com.aydindalli.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GlbTraderTest extends TestBaseFinal {
   /* 2. Adım :
            * tests paketinin altında GlbTraderTest Class'ı oluşturalım.
    @Test oluşturalım.
            glb_search  = https://www.glbtrader.com/search.html
    glb_kelime  = camera
    https://www.glbtrader.com/search.html sayfasına gidelim.
    aramKutusu'na "camera" yazalım, kategorilerDropDown'da "Consumer Electronics"i seçelim.
    sonuclarListe'nin ikinci elemanına (1. index) tıklayalım.
    Gittiğimiz sayfanın "title"'ını alalım ve arama sayfasındaki başlık ile karşılaştıralım.
    Eğer ikisi eşitse, testimiz PASS değilse FAIL olsun.
    */

    @Test
    public void glbTest() {
        extentTest = extentReports.createTest("Baslik karsilastirma Testi", "Urun ismi ve sayfa basligini karsilastiralim");
        Driver.getDriver().get(ConfigurationReader.getProperty("glb_search"));

        extentTest.info("GlbTraderPage den nesne uret");
        GlbTraderPage glbTraderPage = new GlbTraderPage();

        extentTest.info("Select nesnesi uretelim");
        Select select=new Select(glbTraderPage.kategorilerDropDown);
        select.selectByIndex(6);

        extentTest.info("Arama Kutusuna " + ConfigurationReader.getProperty("urun" + "kelimesini yaz"));
        glbTraderPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("glb_urun") + Keys.ENTER);

        String urunIsmi = glbTraderPage.sonuclarListe.get(1).getText();
        glbTraderPage.sonuclarListe.get(1).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        extentTest.info("Sayfa basligini aldik");
        String sayfaBasligi = Driver.getDriver().getTitle();

        extentTest.info("Assert islemi ile kontrol");
        Assert.assertEquals(urunIsmi,sayfaBasligi);

        extentTest.pass("Test PASSED !");

    }
}
