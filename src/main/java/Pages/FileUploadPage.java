package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    public FileUploadPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickOnUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickOnUploadButton();
    }
}
