package ders06_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_RadioButtons {

    //1. Bir class oluşturun : RadioButtonTest
    //2. Gerekli yapiyi olusturun ve aşağıdaki görevi tamamlayın.
    //-https://www.facebook.com adresine gidin
    //-Cookies’i kabul edin
    //-“Create an Account” button’una basin
    //-“radio buttons” elementlerini locate edin
    //-Secili degilse cinsiyet butonundan size uygun olani secin

    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @Test
    public void test01() throws InterruptedException {
        //-https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");
        //-Cookies’i kabul edin
        WebElement cookiesButtonu= driver.findElement(By.xpath("(//button[@value='1'])[2]"));
        cookiesButtonu.click();
        //-“Create an Account” button’una basin
        WebElement yeniHesapButtonu= driver.findElement(By.xpath(""));
        yeniHesapButtonu.click();
        //-“radio buttons” elementlerini locate edin
        /*WebElement cinsiyetRadioButtonu= driver.findElement(By.xpath(""));

        //-Secili degilse cinsiyet butonundan size uygun olani secin


        if (!cinsiyetRadioButtonu.isSelected()){
            cinsiyetRadioButtonu.click();
        }
        Thread.sleep(5000);*/


    }



    @After
    public void teardown() {
        //driver.close();

    }
}
