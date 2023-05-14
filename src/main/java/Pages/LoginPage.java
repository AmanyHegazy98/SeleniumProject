package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String username){
        driver.findElement(By.id("username")).sendKeys(username);
    }
    public void setPassword(String pass){
        driver.findElement(By.id("password")).sendKeys(pass);
    }
    public SecureAreaPage clickLogin(){
        driver.findElement(By.tagName("button")).click();
        return new SecureAreaPage(driver);
    }
}
