package Apractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q1 {

    /*..........Exercise1............
    BeforeClass ile driver'i olusturun ve class icinde static yapin
    Maximixe edin ve 10 sn bekletin
    http://www.google.com adresine gidin
    arama kutusuna "The Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Brave Heart" yazip, cikan sonuc sayisini yazdirin
    arama kutusuna "Harry Potter" yazip, cikan sonuc sayisini yazdirin
    AfterClass ile kapatin    */    // driver.close();  afterTest
    static WebDriver driver;
    //WebElement searchBox=  driver.findElement(By.xpath("//input[@name='q']']"));
    //searchBox.sendKeys("The Lord of the Rings" +Keys.ENTER );
    @BeforeClass
    public static void setup() {
       WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public static void tearDown(){
        // driver.close();

    }
    @After
    public void afterTest(){
        System.out.println("Test sonucu : " + driver.findElement(By.xpath("//div[@id='result-stats']")).getText());
    }
    @Before
    public void beforeTest(){
        driver.get("http://www.google.com");

    }
    @Test
    public void test1(){
        //once cookiesleri kabul edelim

        driver.findElement(By.xpath("//div[text()='Tümünü kabul et']")).click(); //input[@name='q']

        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("The Lord of the Rings" +Keys.ENTER );

        //WebElement searchBox=  driver.findElement(By.xpath("//input[@name='q']']"));
        //searchBox.sendKeys("The Lord of the Rings" +Keys.ENTER );
        driver.findElement(By.xpath("//input[@class='gLFyf gsfi']" ));
    }
    @Test
    public void test2(){
        driver.findElement(By.xpath("//input[@name='q']']")).sendKeys("Brave Heart" +Keys.ENTER );

        //WebElement searchBox=  driver.findElement(By.xpath("//input[@name='q']']"));
        //searchBox.sendKeys("Brave Heart" +Keys.ENTER );

    }
    @Test
    public void test3(){
        driver.findElement(By.xpath("//input[@name='q']']")).sendKeys("Harry Potter" +Keys.ENTER );

        //WebElement searchBox=  driver.findElement(By.xpath("//input[@name='q']']"));
        //searchBox.sendKeys("Harry Potter" +Keys.ENTER );

    }

}

