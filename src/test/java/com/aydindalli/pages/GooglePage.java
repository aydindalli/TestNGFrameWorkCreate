package com.aydindalli.pages;

import com.aydindalli.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    /*
    1. Örnek : Gmail Linkine Tıklama ve Adres Doğrulama
	* pages paketinin altına GooglePage Class'ı oluşturacağız.
	Ve bu Class'ın içerisinde WebElement arama işlemi gerçekleştireceğiz (@FindBy ile)
     */

    public GooglePage(){
        // GooglePage constructure inizi olusturan sabit kod sudur;
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (partialLinkText = "Gmail")
    public WebElement gmailLinki;
}
