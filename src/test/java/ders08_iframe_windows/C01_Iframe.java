package ders08_iframe_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Iframe {

    //  ● Bir class olusturun: IframeTest
    //   ● https://the-internet.herokuapp.com/iframe adresine gidin.
    //   ● Bir metod olusturun: iframeTest
    //      ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin
    //      ve  konsolda    yazdirin.
    //      ○ Text Box’a “Merhaba Dunya!” yazin.
    //      ○ TextBox’in altinda bulunan “Elemental Selenium”
    //      linkini textinin gorunur oldugunu dogrulayin ve  konsolda yazdirin.

   //● Bir class olusturun: IframeTest
    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void iframeTesti() throws InterruptedException {

        //● https://the-internet.herokuapp.com/iframe adresine gidin.
        driver.get("https://the-internet.herokuapp.com");

        //● Bir metod olusturun: iframeTest
        //○ “An IFrame containing….” textinin erisilebilir oldugunu test edin
        WebElement anIframeYaziElementi= driver.findElement(By.tagName("h3"));
        Assert.assertTrue(anIframeYaziElementi.isEnabled());

        // ve  konsolda  yazdirin.
        System.out.println(anIframeYaziElementi.getText());

        // ○ Text Box’a “Merhaba Dunya!” yazin.
        //Ulasmak istediginiz webelement bir iframe icerisinde ise, driver o elemente direk ulasamazz.
        // once webelementin icinde oldugu iframe gecmeliyiz ve orayi locate etmeliyiz.
        // Bir iframe gecmek icin o iframe'nin;
         //1. index, 2- name veya id attribute'nin degeri, 3-webelement olarak locate edilen obje
        // seceneklerinden biri ile switchto().frame() metodu kullanilir.

        WebElement iframeElementi= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
        driver.switchTo().frame(iframeElementi);

        WebElement yaziAlaniElementi= driver.findElement(By.xpath("//body[@id='tinymce']"));
        yaziAlaniElementi.clear();
        yaziAlaniElementi.sendKeys("Merhaba Dunya!");

        //○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin
        //gorunur oldugunu  dogrulayin ve  konsolda yazdirin.

        /*  Bir iframe'in icerisine girdikten sonra
         asil sayfa ile ilgili bir islem yapmak isterseniz
         oncelikle icerisine girdigin iframe'den cikmaniz lazim

         switchTo( ) . defaultContent() ==> ana sayfaya gecer
         switchTo( ) . parentFrame() ==> ic ice birden fazla iframe varsa
                                         bulundugu iframe'in bir ust iframe'ine cikar   */

        driver.switchTo().defaultContent();
        WebElement elementalSeleniumLink= driver.findElement(By.linkText("Elemental Selenium"));
        Assert.assertTrue(elementalSeleniumLink.isEnabled());
        System.out.println(elementalSeleniumLink.getText());
        Thread.sleep(5000);
    }

    @After
    public void teardown(){
        driver.close();
    }
}
