package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    private WebDriver driver;
    public  MultipleWindowPage(WebDriver driver){
        this.driver=driver;

    }
    public void clickHere(){
        driver.findElement(By.linkText("Click Here")).click();
    }
}
