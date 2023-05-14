package base;

import Pages.HomePage;
import Utils.WindowManager;
import jdk.jshell.spi.SPIResolutionException;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage ;
    @BeforeClass
    public void setup(){
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //ch 3
      //  driver.manage().window().maximize();
       // driver.manage().window().setSize(new Dimension(375,812));
      //  WebElement inputLink=driver.findElement(By.linkText("Inputs"));
        //inputLink.click();
      //  List<WebElement> links =driver.findElements(By.tagName("a"));
       // System.out.println(links.size());
       // WebElement inputLink=driver.findElement(By.linkText("Amany"));
       // inputLink.click();
       // System.out.println(driver.getTitle());
      //  driver.quit();
        //ch 4.1
        homePage=new HomePage(driver);
       // goHome();

    }

    @BeforeMethod
    public  void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

}
