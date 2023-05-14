package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFieldUpload(){
        var uploadPage=homePage.clickFileUpload();
        uploadPage.uploadFile("");
    }

}
