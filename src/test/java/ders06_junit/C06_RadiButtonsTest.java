package ders06_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_RadiButtonsTest {
    /* JUnit otomatik olarak test sonuclarini passed veya failed olarak verir
    ANCAK,
        JUnit temel olarak kodun calisip, problemsiz olarak bittigini raporlar
        JUnit'de Assert class'i kullanilarak testleri yaparsak
        o zaman istedigimiz dogru test raporlarini verecektir.
     */

    // https://www.facebook.com adresine gidin
    // Cookies'i kabul edin
    // "Create an Account" button'una basin
    // "radio buttons" elementlerini locate edin
    // size uygun olan cinsiyet button'unun secili oldugunu test edin

    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

}
