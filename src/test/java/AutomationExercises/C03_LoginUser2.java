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

public class C03_LoginUser2 extends TestBase {

    @Test
    public void loginUser2Testi(){

        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        WebDriver driver=new ChromeDriver();
    //Test Case 3: Login User with incorrect email and password
    //1. Launch browser
    //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
    //3. Verify that home page is visible successfully
        WebElement homePage= driver.findElement(By.xpath("//a[@href='/']"));
        Assert.assertTrue(homePage.isDisplayed());
    //4. Click on 'Signup / Login' button
        WebElement signInLogInButonu= driver.findElement(By.xpath("//a[@href='/login']"));
        signInLogInButonu.click();
    //5. Verify 'Login to your account' is visible --//*[text()='Login to your account']
        WebElement loginTo= driver.findElement(By.xpath("//*[text()='Login to your account']"));
        assertTrue(loginTo.isDisplayed());
    //6. Enter incorrect email address and password
        WebElement emailAddressBox= driver.findElement(By.xpath("//input[@data-qa='login-email']"));
        WebElement passwordBox= driver.findElement(By.xpath("//input[@type='password']"));
        emailAddressBox.sendKeys("aurora@gmail.com");
        passwordBox.sendKeys("aurora");
    //7. Click 'login' button
        WebElement logInButton= driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        logInButton.click();
        bekle(2);
    //8. Verify error 'Your email or password is incorrect!' is visible
        WebElement yourMailIncorrect= driver.findElement(By.xpath("//*[text()='Your email or password is incorrect!']"));
        assertTrue(yourMailIncorrect.isDisplayed());



  }

}
