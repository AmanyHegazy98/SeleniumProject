package KeyPresses;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyPressesTests extends BaseTests {
    @Test
    public void testBackSpace(){
         var keyPage =homePage.clickKeyPresses();
         keyPage.getKeyPresses("A"+ Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");

    }
    @Test
    public void testBay(){
        var keyPage =homePage.clickKeyPresses();
        keyPage.getKeyPresses(Keys.chord(Keys.ALT+"227"));
        assertEquals(keyPage.getResult(),"You entered: NUMPAD7");

    }
}
