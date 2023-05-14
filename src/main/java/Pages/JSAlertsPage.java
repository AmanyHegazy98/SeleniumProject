package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSAlertsPage {
    private WebDriver driver;
    private By triggerAlertButton=By.xpath("//button[text()=\"Click for JS Alert\"]");
    public JSAlertsPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickInAlertMessage(){
        driver.findElement(triggerAlertButton).click();
    }
    public void clickInOkButton(){
        driver.findElement(triggerAlertButton).click();
    }
}
