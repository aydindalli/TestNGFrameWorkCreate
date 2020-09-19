package com.aydindalli.pages;

import com.aydindalli.utilities.Driver;

public class TestNGFrameWorkHazirlik {
    /*
    ***** Sıfırdan TestNG FrameWork Oluşturma ;

1 - ) İlk önce pom.xml dosyamıza ihtiyaç duyduğumuz kütüphaneleri ekleriz.
	a) selenium-java
	b) webdrivermanager(bunu siz çalıştığınız şirket verir)
	c) testng
	d) extentreports
	e) apache poi

2 - ) Kullanacağımız paketleri, uygun isimlerde src-> test-> java klasörünün içerisinde oluşturmak.
	***** ilk önce ana paket oluşturulur.
	a) pages (webelementleri bulacağız)
	b) tests (burada test class'ları oluşturacağız)
	c) utilities (sabit kullanacağımız class'ları ekleyez)
	d) smoketests (önemli fonksiynları test etğmz classlar)

3 - ) .properties dosyasını oluşturma
	***** Projemizin isminin bulunduğu alana sağ tıklıyoruz, new->file 'ı seçiyoruz.
	***** Dosyamıza isim olarak configuration.properties

4 - ) utilities paketinin içerisindeki ihtiyaç duyduğumuz Class'ların eklenmesi.
	a) Driver Class'ı
		-driver'ı kullanabilmek için..
	b) ConfigurationReader Class'ı
		-properties dosyasını okuyablmek ve veri almak için
	c) TestBaseFinal Class'ı
		-@beforetest, @aftermethod vs gibi methodları oluşturabileceğimiz ve aynı zamanda rapor alma işlemini başlatabileceğimiz bir class..
	d) ReusableMethods Class'ı
		-içerisinde düzenli olarak kullanabileceğimiz methodların yer aldığı bir class.
     */

}
