package com.aydindalli.tests;

import com.aydindalli.pages.GooglePage;
import com.aydindalli.utilities.ConfigurationReader;
import com.aydindalli.utilities.Driver;
import com.aydindalli.utilities.TestBaseFinal;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleGmailTest extends TestBaseFinal {
    /*
    1. Örnek : Gmail Linkine Tıklama ve Adres Doğrulama
	a) Google.com'a gideceğiz.
	b) Gmail linkini bulup tıklayacağız.
	c) Gittiğimiz sayfanın başlığını doğrulayacağız.
	* pages paketinin altına GooglePage Class'ı oluşturacağız. Ve bu Class'ın içerisinde WebElement arama işlemi gerçekleştireceğiz (@FindBy ile)
	* tests paketinin altına GoogleGmailTest Class'ı oluşturacağız. Ve bu Class'ın içerisinde sırasıyla;
		1. Driver class'ı yardımıyla, Google.com'a gideceğiz.
		2. GooglePage class'ından nesne üreteceğiz.
		3. Nesnenin içerisindeki webelementi kullanacağız.
		4. Assert işlemi yapacağız.
	-> extentTest = extentReports.create... ile testimizin raporunu oluşturmaya başladık.
	-> extentTest.info'lar ile her adımın bilgisini ekledik.
	-> Driver.getDriver().get ile Google.com'a gittik.
	-> GooglePage class'ından nesne ürettik.
	-> GooglePage'in içerisindeki gmailLink webelementine
	tıkladık.
	-> Assert işlemi ile sayfanın başlığının(getTitle) Gmail kelimesini içerip içermediğine baktık.
     */

    @Test
    public void gmailTest() throws InterruptedException {
        extentTest = extentReports.createTest("Gmail Test","Gmail.com a Google uzerinden erisim testi");
        extentTest.info("Google.com a gidiyoruz");
        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));

        extentTest.info("GooglePage Class indan nesne uretiyoruz");
        GooglePage googlePage = new GooglePage();

        extentTest.info("gmailLinki webelementine tikliyoruz");
        googlePage.gmailLinki.click();

        extentTest.info("5sn bekliyoruz");
        Thread.sleep(5000);


        extentTest.info("Assert islemi yap");
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Gmail"));
        extentTest.pass("Testimiz Passed !");

    }

}
