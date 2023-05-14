package Utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private  WebDriver driver;
    public WindowManager(WebDriver driver){
        this.driver=driver;

    }
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void toPage(String url){
        driver.navigate().to(url);

    }
    public void switchTabs(String tabTitle){
       var windows =driver.getWindowHandles();
       System.out.println("The number of tabs "+windows.size());
        System.out.println("WindowHandles");
        windows.forEach(System.out::println);
        for(String window:windows){
            System.out.println("Switching to window  "+window);
            driver.switchTo().window(window);
            System.out.println("the current window  "+driver.getTitle());

            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
