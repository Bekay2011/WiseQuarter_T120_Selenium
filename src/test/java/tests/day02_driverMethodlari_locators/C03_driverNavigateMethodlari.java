package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C03_driverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver(); //Selenium'um kendi Webdriver'ini kullanir.
        driver.manage().window().maximize();
        //Amazon ana sayfaya gidin
        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        //Sayfa basliginin "smile more" icerdigini test edin
        String expectedtitleIcerik = "Smile more";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedtitleIcerik)){
            System.out.println("Amazon Title testi PASSED ");
        }else {
            System.out.println("Amazon Title testi FAILED");
        }


        // youtube ana sayfaya gidin
        driver.navigate().to("https://www.youtube.com");
        Thread.sleep(2000);
        // Url'in "youtube" icerdigini test edin
        String expectedUrlIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();
        if(actualUrl.contains(expectedUrlIcerik)){
            System.out.println("Youtube Url testi PASSED");
        } else {
            System.out.println("Youtube Url test FAILED");
        }

        //tekrar amazon ana sayfaya dönün
        // ve Url'in "ramazon" icermedigini test edin
        driver.navigate().back();
        Thread.sleep(2000);
        String unExpectedUrlIcerik = "ramazon";
        actualUrl = driver.getCurrentUrl();
        if (actualUrl.contains(unExpectedUrlIcerik)){
            System.out.println("Amazon Url testi FAILED");
        } else {
            System.out.println("Amazon Url testi PASSED");
        }

        // tekrar youtube ana sayfaya gidin
        // Sayfa kaynak kodlarinda "music" gestigini test edin ve .
        driver.navigate().forward();
        Thread.sleep(2000);
        String expectedSayfaIcerik = "music";
        String actualSayfaKaynakKodlari = driver.getPageSource();

        if(actualSayfaKaynakKodlari.contains(expectedSayfaIcerik)){
            System.out.println("Youtube kaynak kodu testi PASSED");
        } else {
            System.out.println("Youtube kaynak kodu testi FAILED");
        }
        //sayfayi kapatin
        Thread.sleep(2000);
        driver.close();


    }
}
