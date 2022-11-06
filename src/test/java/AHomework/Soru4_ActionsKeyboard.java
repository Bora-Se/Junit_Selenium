package AHomework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru4_ActionsKeyboard extends TestBase {


    @Test
    public void test01() {
        //    1- Bir Class olusturalim KeyboardActions2
        Actions actions = new Actions(driver);
        //    2- https://html.com/tags/iframe/ sayfasina gidelim
        driver.get("https://html.com/tags/iframe");
        //    3- video'yu gorecek kadar asagi inin
        actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN).perform();

        //    4- videoyu izlemek icin Play tusuna basin
        WebElement playIframe = driver.findElement(By.xpath("//div[@class='ytp-cued-thumbnail-overlay-image']"));

        //WebElement playButton= driver.if
        //driver.findElement(By.xpath("//button[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']"));
        //playButton.click();

        //    5- videoyu calistirdiginizi test edin

        //driver.close();


    }
}