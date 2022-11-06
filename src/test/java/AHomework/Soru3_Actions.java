package AHomework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class Soru3_Actions extends TestBase {

    @Test
    public void test01(){

        ///*
        //    Yeni Class olusturun ActionsClassHomeWork
        //    1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        //    2- Hover over Me First" kutusunun ustune gelin
        //    3- Link 1" e tiklayin
        //    4- Popup mesajini yazdirin
        //    5- Popup'i tamam diyerek kapatin
        //    6- "Click and hold" kutusuna basili tutun
        //    7-"Click and hold" kutusunda cikan yaziyi yazdirin
        //    8- "Double click me" butonunu cift tiklayin
        //     */

        //    Yeni Class olusturun ActionsClassHomeWork
        Actions actions=new Actions(driver);
        //    1- "http://webdriveruniversity.com/Actions" sayfasina gidin
        driver.get("http://webdriveruniversity.com/Actions");
        //    2- Hover over Me First" kutusunun ustune gelin
        WebElement hoverOverMeFirst=driver.findElement(By.xpath("(//button[@class='dropbtn'])[1]"));
        actions.moveToElement(hoverOverMeFirst).perform();
        //    3- Link 1" e tiklayin
        WebElement link1= driver.findElement(By.xpath("(//a[@class='list-alert'])[1]"));
        link1.click();
        //    4- Popup mesajini yazdirin
        System.out.println(driver.switchTo().alert().getText());

        //    5- Popup'i tamam diyerek kapatin
        driver.switchTo().alert().accept();

        //    6- "Click and hold" kutusuna basili tutun
        WebElement clickandHold= driver.findElement(By.xpath("(//div[@class='col-lg-12 text-center'])[3]"));
        actions.clickAndHold(clickandHold).perform();

        //    7-"Click and hold" kutusunda cikan yaziyi yazdirin
        System.out.println(clickandHold.getText());
        //    8- "Double click me" butonunu cift tiklayin

        WebElement doubleClickMe=driver.findElement(By.xpath("//div[@id='double-click']"));
        actions.doubleClick(doubleClickMe).perform();


    }


}
