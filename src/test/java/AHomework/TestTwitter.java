package AHomework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class TestTwitter extends TestBase {

    @Test
    public void testTwitter() {
        driver.get( "https://twitter.com" );
        driver.findElement( By.xpath("//*[text()='Tüm çerezleri kabul et']"  ) ).click();
        //WebElement kapatmaKutusu=driver.findElement( By.xpath( "(//*[@style=\"color: rgb(239, 243, 244);\"])[2]" ) );
        // kapatmaKutusu.click();
        driver.findElement(By.xpath("//span[text()='Kaydol']")).click();
        driver.findElement( By.xpath( "//*[text()='Telefon veya e-posta ile kaydol']" ) ).click();
        WebElement isimKutusu=driver.findElement( By.xpath( "//input[@autocomplete='name']" ) );
        Actions actions=new Actions( driver );
        actions.click(isimKutusu)
                .sendKeys( "Bora" )
                .sendKeys( Keys.TAB )
                .sendKeys( "+905363277775" )
                .sendKeys( Keys.TAB )
                .sendKeys( Keys.TAB )
                .sendKeys( "Ocak" )
                .sendKeys( Keys.TAB )
                .sendKeys( "11" )
                .sendKeys( Keys.TAB )
                .sendKeys( "1972" )
                .sendKeys( Keys.TAB )
                .perform();
        driver.findElement( By.xpath( "//*[text()='İleri']" ) ).click();
    }
}