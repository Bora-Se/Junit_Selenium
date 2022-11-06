package AutomationExercises;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static org.junit.Assert.assertTrue;

public class C02_LoginUser1 extends TestBase {

    @Test
    public void loginUserTesti(){

        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        WebDriver driver=new ChromeDriver();

        //Test Case 2: Login User with correct email and password
        //1. Launch browser WebElement titleButonu= driver.findElement(By.xp
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        WebElement homePage= driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        assertTrue(homePage.isDisplayed());
        //4. Click on 'Signup / Login' button
        WebElement signInLogInButonu= driver.findElement(By.xpath("//a[@href='/login']"));
        signInLogInButonu.click();
        //5. Verify 'Login to your account' is visible  //*[text()='Login to your account']
        WebElement loginTo= driver.findElement(By.xpath("//*[text()='Login to your account']"));
        assertTrue(loginTo.isDisplayed());
        //6. Enter correct email address and password  (//input[@name='email'])[1]
        /*WebElement emailAdres= driver.findElement(By.xpath("(//input[@name='email'])[1]"));
        emailAdres.sendKeys("aurora@gmail.com");
        WebElement paswordKutucugu= driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        paswordKutucugu.sendKeys("aurora");*/
        WebElement emailAddressBox= driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        WebElement passwordBox= driver.findElement(By.xpath("//input[@type='password']"));
        emailAddressBox.sendKeys("borasverige@gmail.com");
        passwordBox.sendKeys("Bora.1234");


        //7. Click 'login' button
        WebElement logInButton= driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        logInButton.click();
        bekle(2);
        //8. Verify that 'Logged in as username' is visible
        WebElement loggedInAs= driver.findElement(By.xpath("//li//a[text()=' Logged in as ']"));
        Assert.assertTrue(loggedInAs.isDisplayed());
        bekle(2);
        //9. Click 'Delete Account' button
        WebElement deleteAccount=driver.findElement(By.xpath("//a[@href='/delete_account']"));
        deleteAccount.click();
        bekle(1);
        //10. Verify that 'ACCOUNT DELETED!' is visible
        WebElement deleted=driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
        assertTrue(deleted.isDisplayed());





    }


}
