package AutomationExercises;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C1_RegisterUser extends TestBase {

    @Test
    public void registerUserTesti(){

        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.navigate().to("http://automationexercise.com");
        //3. Verify that home page is visible successfully  -- .getText(); yapamadi (//a[@href='/'])[2]
        WebElement homePage= driver.findElement(By.xpath("(//a[@href='/'])[2]"));
        Assert.assertTrue(homePage.isDisplayed());
        //System.out.println(driver.findElement(By.xpath("\"(//a[@href=\\\"/\\\"])[2]\"")).getText()); --bulamadi
        /*String expectedHomePageText= "home page";
        String actuelHomePageText= driver.findElement(By.xpath("\"(//a[@href=\\\"/\\\"])[2]\"")).getText();
        System.out.println(actuelHomePageText);
        Assert.assertTrue(actuelHomePageText.contains(expectedHomePageText));          */

        //  //     mail=aurora@gmail.com
        //        //     password=aurora

        //4. Click on 'Signup / Login' button   -- ikiside ok
        WebElement signInLogInButonu= driver.findElement(By.xpath("//a[@href='/login']"));
        signInLogInButonu.click();
        //driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();

        //5. Verify 'New User Signup!' is visible -- ikiside ok
        WebElement newUserSignUp= driver.findElement(By.xpath("(//h2[text()='New User Signup!'])"));
        Assert.assertTrue(newUserSignUp.isDisplayed());
        /*String expectedText ="New User Signup!";
        String actuelText= driver.findElement(By.xpath("(//h2[text()='New User Signup!'])")).getText();
        Assert.assertEquals(expectedText,actuelText);*/

        //6. Enter name and email address -- iki bilgiyi de tek seferde gonderelim
        WebElement nameKutucugu= driver.findElement(By.xpath("//input[@type='text']"));
        nameKutucugu.sendKeys("Bora");
        WebElement mailKutucugu= driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        mailKutucugu.sendKeys("borasverige@gmail.com");

        //7. Click 'Signup' button
        WebElement signInButton= driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        signInButton.submit();
        //driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

        //8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enterAccountMetni= driver.findElement(By.xpath("//b[text()='Enter Account Information']"));
        Assert.assertTrue(enterAccountMetni.isDisplayed());   // ---   (//b[text()='Enter Account Information'])

        //9. Fill details: Title, Name, Email, Password, Date of birth -- Mr-- (//input[@type='radio'])[1]
        /*WebElement mrRadioButonu= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        mrRadioButonu.click();   // (//input[@type='radio'])[2] --Mrs xPath i 2. element
        //Buradan sonra 1. Tab Name, 2. Tab pasword
        WebElement paswordButonu= driver.findElement(By.xpath("//input[@type='password']"));
        paswordButonu.sendKeys("Bora.1234"); // days--  //select[@id='days']
        WebElement daysButonu= driver.findElement(By.xpath("//select[@id='days']"));
        daysButonu.sendKeys("1");
        WebElement montsButonu= driver.findElement(By.xpath("//select[@id='months']"));
        montsButonu.sendKeys("January");
        WebElement yearsButonu= driver.findElement(By.xpath("//select[@id='years']"));
        yearsButonu.sendKeys("1972");*/
        Actions actions=new Actions(driver);
        Faker faker=new Faker();
        WebElement titleButonu= driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
        actions.click(titleButonu).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("Bora.1234").sendKeys(Keys.TAB)
                .sendKeys("13").sendKeys(Keys.TAB)
                .sendKeys("Oct").sendKeys(Keys.TAB)
                .sendKeys("2000").sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_DOWN). sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN). sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_UP)
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT).perform();
                /*.sendKeys(faker.internet().password())
                .sendKeys(faker.name().firstName())
                .sendKeys(faker.name().lastName()).sendKeys(Keys.TAB)
                .sendKeys(email).sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_LEFT)
                .sendKeys(Keys.ENTER).perform();   */

        //10. Select checkbox 'Sign up for our newsletter!'

        //WebElement newcheckboxButonu= driver.findElement(By.xpath("//input[@name='newsletter']"));
        //newcheckboxButonu.click();
        //11. Select checkbox 'Receive special offers from our partners!'
        //WebElement newcheckboxButonu2= driver.findElement(By.xpath("//input[@id='optin']"));
        //newcheckboxButonu2.click();
        //10-11
        WebElement newsLatter= driver.findElement(By.xpath("//input[@name='newsletter']"));
        WebElement reciveSpecial= driver.findElement(By.xpath("//input[@name='optin']"));
        actions.moveToElement(newsLatter).click(newsLatter).moveToElement(reciveSpecial).click(reciveSpecial).
                sendKeys(Keys.TAB).perform();

        //12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        //WebElement isimKutusu= driver.findElement(By.xpath("//input[@name='firstname']"));
        //13. Click 'Create Account button'
        //WebElement createAccountButonu= driver.findElement(By.xpath("//button[@data-qa='create-account']"));
        //createAccountButonu.click();
        //12-13
        actions.sendKeys("Nevzat").sendKeys(Keys.TAB).sendKeys("Celik").sendKeys(Keys.TAB)
                .sendKeys("ISVEC").sendKeys(Keys.TAB).sendKeys("huddinge/Stockholm").sendKeys(Keys.TAB)
                .sendKeys("-").sendKeys(Keys.TAB).sendKeys("New Zealand").sendKeys(Keys.TAB)
                .sendKeys("-").sendKeys(Keys.TAB).sendKeys("Stockholm").sendKeys(Keys.TAB)
                .sendKeys("12321").sendKeys(Keys.TAB).sendKeys("+4623232323").sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).perform();


        //14. Verify that 'ACCOUNT CREATED!' is visible
        //WebElement accountCrt=driver.findElement(By.xpath("//*[text()='Account Created!']"));
        //Assert.assertTrue(accountCrt.isDisplayed());
        /*String expectedMessage="ACCOUNT CREATED!";
        String actualMessage=accountCrt.getText();
        Assert.assertEquals(expectedMessage,actualMessage);*/
        /*WebElement accountCreateMetni= driver.findElement(By.xpath(""));
        Assert.assertTrue(accountCreateMetni.isDisplayed());*/
        //15. Click 'Continue' button
        //WebElement continueButonu= driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
       //continueButonu.click();
       driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();
        //16. Verify that 'Logged in as username' is visible
        WebElement loggedMetni= driver.findElement(By.xpath("(//li//a)[10]"));
        Assert.assertTrue(loggedMetni.isDisplayed());
        //WebElement logged=driver.findElement(By.xpath("(//li//a)[10]"));
        //Assert.assertTrue(logged.isDisplayed());
        //17. Click 'Delete Account' button
        WebElement deleteAccountButonu= driver.findElement(By.xpath("//a[@href='/delete_account']"));
       deleteAccountButonu.click();

        //18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        WebElement acconuntDeleteMetni= driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
        Assert.assertTrue(acconuntDeleteMetni.isDisplayed());
        WebElement continueButonu2= driver.findElement(By.xpath(""));
        continueButonu2.click();

        /*WebElement deleted=driver.findElement(By.xpath("//*[text()='Account Deleted!']"));
        //   assertTrue(deleted.isDisplayed());
        String expectedMessage2="ACCOUNT DELETED!";
        String actualMessage2=deleted.getText();
        Assert.assertEquals(expectedMessage2,actualMessage2);*/

    }


}
