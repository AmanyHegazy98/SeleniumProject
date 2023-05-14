package Login;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import base.BaseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import static org.testng.Assert.*;


public class LoginTests extends BaseTests {



   /* @Before
    public void setup(){
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");

        homePage=new HomePage(driver);

    }*/
    @Test
    public void testSuccessfulLogin(){


        LoginPage loginPage =homePage.clickFormAuth();
         loginPage.setUserName("tomsmith");
         loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage =loginPage.clickLogin();
        secureAreaPage.getAlertText();

        assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");

    }
   /* @After
    public void down (){
        driver.quit();
    }*/
}
