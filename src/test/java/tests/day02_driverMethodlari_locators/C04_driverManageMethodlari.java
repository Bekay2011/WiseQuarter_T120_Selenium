package tests.day02_driverMethodlari_locators;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_driverManageMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // görev odakli calisir. 15 saniye maximum beklem süresi
        // görev daha öne tamamlanirsa, yoluna devam eder
        // 15 icinde görev tamamlanmazsa hat verir
        // görev: sayfanin acilmasi ve kullanilacak Webelementlerinin bulunmasidir

        System.out.println("maximize size "+driver.manage().window().getSize());
        System.out.println("Maximize konum "+driver.manage().window().getPosition());

        // Window'u fullscreen yapin

        driver.manage().window().fullscreen();
        System.out.println("fullscreen size "+driver.manage().window().getSize());
        System.out.println("fullscreen konum "+driver.manage().window().getPosition());

        // window'un baslangic konumu (200,300) ve boyutuu (500,500)


        driver.manage().window().setSize(new Dimension(500,500));
        driver.manage().window().setPosition(new Point(200,300));

        System.out.println("customize size "+driver.manage().window().getSize());
        System.out.println("customize konum "+driver.manage().window().getPosition());

        //Thread.sleep(3000); // jav'dan gelir ve odlari bekletir
        Thread.sleep(3000);
        driver.close();
    }
}
