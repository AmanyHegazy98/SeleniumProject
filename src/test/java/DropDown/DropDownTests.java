package DropDown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DropDownTests extends BaseTests {
   @Test
    public void testSelectOption(){
        // why put it in variable
        String option="Option 1";
      var dropDownPage=homePage.clickDropDown();
    dropDownPage.selectFromDD(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"incorrect Number of selections");
        assertTrue(selectedOptions.contains(option),"option not selected");
    }
}
