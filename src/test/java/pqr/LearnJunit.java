package pqr;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LearnJunit extends Utils {


    @Before
    public void setup() {


        System.setProperty("webdriver.chrome.driver", "src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");

    }

    @Test
    public void userShouldBeRegisteredSuccessfully() {
        clickElementBy(By.xpath("//a[@class='ico-register']"));
        //First name
        enterText(By.xpath("//Input[@name='FirstName']"), "Bhumi");
        //Last Name
        enterText(By.xpath("//Input[@name='LastName']"), "Patel");
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailId = "Maria" + userName + "@gmail.com";
        //Enter email
        enterText(By.xpath("\"//Input[@name='Email']\""), emailId);
        //enter password
        enterText(By.xpath("\"//Input[@name='Password']\""), "bhumi26");
        //Enter Confirm password
        enterText(By.xpath("//Input[@name='ConfirmPassword']"), "bhumi26");
        //Click registration button
        clickElementBy(By.xpath("//Input[@name='register-button']"));
        //actual register message appears
        waitForElementDisplay(By.xpath("//div[@class=\"result\"]"), 10);
    }
    @Test
    public void usershouldbeabletonavigatetonotebookcategory() {
        // click on computer
        clickElementBy(By.xpath("//a[@href=\"/computers\"]"));
        // click on notebook
        clickElementBy(By.partialLinkText("Notebooks") );
        waitForElementDisplay(By.xpath("//div [@class=\"page-title\"]"),10);
        //actual result
        System.out.println("usershouldbeabletonavigatetonotebookcatergory");

    }

    @Test
    public void usershouldbeabletonavigatetocellphonepage() {
        //click on electronics
        clickElementBy(By.xpath("//a[@href=\"/electronics\"]"));
        //click on cellphone
        clickElementBy(By.partialLinkText("Cell phones"));

        waitForElementDisplay(By.xpath("//div[@class=\"page-title\"]"),10);
        //actual result
        System.out.println("usershouldbealbetonavigatetocellphonepage");


    }
    @Test
    public void usershouldbeabletologinsuccessfully() {
        //click on login
        clickElementBy(By.xpath("//a[@class=\"ico-login\"]"));
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
        String emailId = "Maria" + userName  + "@gmail.com";
        //Enter emailID
        enterText(By.xpath("//input[@class=\"email\"]"),"bhumi11@gmail.com");
        //Enter password
        enterText(By.xpath("//input[@class=\"password\"]"),"bhumi26");
        //Click on login button
        clickElementBy(By.xpath("//input[@class=\"button-1 login-button\"]"));

        waitForElementDisplay(By.xpath("//a[@class=\"ico-logout\"]"),10);
        //Actual result
        System.out.println("usershouldbeabletologinsuccessfully");
    }

    @Test
    public void usershouldbeabletoaddproducttoshoppingcart() {

        // click on book category
        clickElementBy(By.xpath("//a[@href=\"/books\"]"));
        //select a book
        clickElementBy(By.xpath("//a[@href=\"/first-prize-pies\"]"));
        //click on add to cart button
        clickElementBy(By.xpath("//input[@id=\"add-to-cart-button-38\"]"));
        //priduct added to cart
        waitForElementDisplay(By.xpath("//p[@class=\"content\"]"),10);
        // Actual result
        System.out.println("product is added to shopping cart");


    }
   // @After
    //public void closeBrowser () {
        // driver instance
      //  driver.quit();


    }





