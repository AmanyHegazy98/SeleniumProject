package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

  //  private By formAuthLink=By.linkText("Form Authentication");
    public HomePage(WebDriver driver){this.driver=driver;}
 /*   public LoginPage clickFormAuth(){
       driver.findElements(By.linkText("Form Authentication"));
        driver.findElement(formAuthLink).click();
        return new LoginPage(driver);
    }*/
      public LoginPage clickFormAuth(){
      clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickDropDown(){
          clickLink("Dropdown");
          return new DropDownPage(driver);
    }
    private void clickLink(String linkText){

        driver.findElement(By.linkText(linkText)).click();
    }
    public MultipleWindowPage multipleWindowPage(){
        clickLink("Multiple Windows");
        return new MultipleWindowPage(driver);
    }

    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPresses clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPresses(driver);
    }
    public JSAlertsPage clickJsAlerts(){
        clickLink("JavaScript Alerts");
        return new JSAlertsPage(driver);
    }
    public FileUploadPage clickFileUpload(){
         clickLink("File Upload");
         return new FileUploadPage(driver);


    }
}
