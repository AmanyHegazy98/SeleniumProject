package Navigation;

import base.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigationTests extends BaseTests {
    @Test
public void testNavigation(){
        homePage.clickFormAuth();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().toPage("https://www.google.com/");

    }
    @Test
    public void testSwitchingTabs(){
        homePage.multipleWindowPage().clickHere();
        getWindowManager().switchTabs("New Window");
    }


}
