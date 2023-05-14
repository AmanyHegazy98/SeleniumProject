import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ch3Task {
    private WebDriver driver;
    public void setup(){
        System.setProperty("Webdriver.chrome.driver","E:\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");


         WebElement link=driver.findElement(By.linkText("Shifting Content"));
        link.click();
        WebElement link2=driver.findElement(By.linkText("Example 1: Menu Element"));
        link2.click();

        List<WebElement> elements =driver.findElements(By.tagName("li"));
       System.out.println(elements.size());

    }
    public static void main (String arg[]){

        Ch3Task tests=new Ch3Task();
        tests.setup();
    }
}
