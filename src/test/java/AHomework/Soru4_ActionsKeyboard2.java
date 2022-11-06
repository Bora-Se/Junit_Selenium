package AHomework;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class Soru4_ActionsKeyboard2 extends TestBase {

    //    1- Bir Class olusturalim KeyboardActions2
    //    2- https://html.com/tags/iframe/ sayfasina gidelim
    //    3- video'yu gorecek kadar asagi inin



    @Test
    public void test2ikinciYol(){
        //TODO***********************       Nevzat Beyin Cözümüne Uygulanan Sayfa Kaydirma      *********************************

        //    2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe");
        //    3- video'yu gorecek kadar asagi inin

        driver.get("https://html.com/tags/iframe/");

        // https://www.guru99.com/scroll-up-down-selenium-webdriver.html
        WebElement iframeVideoElementi = driver.findElement(By.xpath("//div[@class=\"render\"]"));

        JavascriptExecutor javaScript = (JavascriptExecutor) driver;
        javaScript.executeScript("arguments[0].scrollIntoView();", iframeVideoElementi);

        WebElement ilkIframe= driver.findElement(By.xpath("//iframe[@width='560']"));
        driver.switchTo().frame(ilkIframe);
        threadSleep(2);

        WebElement playButton= driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        playButton.click();

        WebElement isvideoPlayed=driver.findElement(By.xpath("//video[@class='video-stream html5-main-video']"));
        Assert.assertTrue(isvideoPlayed.isDisplayed());


    }

    private void threadSleep(int i) {
    }
}
