package com.aydindalli.tests;

import com.aydindalli.pages.AmazonPage;
import com.aydindalli.utilities.ConfigurationReader;
import com.aydindalli.utilities.Driver;
import com.aydindalli.utilities.TestBaseFinal;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonAramaTest extends TestBaseFinal {
    /*
    2. Örnek : Amazon.com'da "camera" araması
	a) Amazon.com'a gideceğiz.
	b) Arama kutusuna "camera" yazdıracağız ve Keys.Enter
	c) Sonuç sayısını gördüğümüz bölümde "camera" kelimesi geçiyor mu, onu kontrol edeceğiz. (Assert)
	* pages paketinin altında AmazonPage diye bir tane Class oluşturacağız.
		-> webelement : aramaKutusu
		-> webelement : sonucBolumu
	* tests paketinin altında AmazonAramaTest diye bir tane Class oluşturacağız.
		-> Driver.getDriver().get ile Amazon.com'a..
		-> AmazonPage'den bir tane nesne oluşturacağız
		-> aramaKutusu.sendKeys ile "camera" arayacağız
		-> sonucBolumu.getText() ile yazıyı alacağız.
		-> Assert işlemi yapacağız.
     */

    @Test
    public void amazonTest(){

        extentTest = extentReports.createTest("Amazon Arama Testi", "Amazon da urun ismi kontrolu");
        extentTest.info("amazon.com gidelim");
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));

        extentTest.info("AmazonPage den nesne uret");
        AmazonPage amazonPage = new AmazonPage();

        extentTest.info("Arama Kutusuna "+ ConfigurationReader.getProperty("aranilacakkelime"+ "kelimesini yaz"));
        amazonPage.aramaKutusu.sendKeys(ConfigurationReader.getProperty("aranilacakkelime")+ Keys.ENTER);


        extentTest.info("sonuc bolumunun icerisindeki yazilari alalim");
        String yazilar = amazonPage.sonucBolumu.getText();

        extentTest.info("Assert islemi ile kontrol");
        Assert.assertTrue(yazilar.contains(ConfigurationReader.getProperty("aranilacakkelime")));

        extentTest.pass("Test PASSED !");
    }
}
