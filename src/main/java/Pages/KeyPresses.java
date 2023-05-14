package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By textField = By.id("target");
    private By result = By.id("result");

    public KeyPresses(WebDriver driver) {
        this.driver = driver;
    }

    public void getKeyPresses(String text ) {
        driver.findElement(textField).sendKeys(text);

    }
    public String getResult(){
        return driver.findElement(result).getText();
    }

}
