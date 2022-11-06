package ders08_iframe_windows;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_HandleWindows {


    WebDriver driver;
    @Before
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test
    public void windowTesti(){
        //● Amazon anasayfa adresine gidin.
        driver.get("https://www.amazon.com");
        //● Sayfa’nin window handle degerini String bir degiskene atayin
        String ilkSayfahandleDegeri= driver.getWindowHandle();
        //● Sayfa title’nin “Amazon” icerdigini test edin
        String expectedIcerik="Amazon";
        String actualTitle=driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedIcerik));

        //● Yeni bir tab olusturup, acilan tab’da wisequarter.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");

        //● Sayfa title’nin “Wise Quarter” icerdigini test edin
        expectedIcerik="Wise Quarter";
        actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));

        System.out.println(driver.getTitle());

        //● Yeni bir window olusturup, acilan sayfada walmart.com adresine gidin
        driver.get("https://www.walmart.com");

        //● Sayfa title’nin “Walmart” icerdigini test edin
        expectedIcerik="Walmart";
        actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));

        //● Ilk acilan sayfaya donun ve amazon sayfasina dondugunuzu test edin

        driver.switchTo().window(ilkSayfahandleDegeri);

        expectedIcerik="Amazon";
        actualTitle= driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));


    }

    @After
    public void teardown(){
        driver.quit();
    }

}
