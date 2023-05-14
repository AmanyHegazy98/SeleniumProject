package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class AlertClass extends BaseTests {
    @Test
    public void testAcceptAlerts(){
       var alertPage= homePage.clickJsAlerts();
       alertPage.clickInOkButton();
       alertPage.clickInAlertMessage();
    }
}
