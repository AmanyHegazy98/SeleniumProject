package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoversTest extends BaseTests {
    @Test
    public void testHoverUser1(){

          var hoverPage =homePage.clickHovers();
        var caption= hoverPage.hoverOverFigure(1);
      assertTrue(caption.isCaptionDisplay(),"caption not display") ;
        assertEquals(caption.getTitle(),"name: user1","captionTitle not true ");
        assertEquals(caption.getLinkText(),"View profile","Caption Link Text incorrect ");
        assertTrue(caption.getLink().endsWith("/users/1"),"link is not correct");
    }

}
