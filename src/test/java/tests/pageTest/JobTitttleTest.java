package tests.pageTest;

import controllers.MethodBase;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.JobTittle;
import classpack.LoginPage;
import testData.JobTittleData;
import testData.LoginData;

public class JobTitttleTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = JobTittleData.class,dataProvider = "JobTittleExcel")
    public void testJobTittle(String jobTittle, String jobDescription, String jobNote, String status, String alert ) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isDashboardDisplayed(), "Dashboard is not Displayed");
        JobTittle.clickAdmin();
        JobTittle.clickJob();
        JobTittle.clickJobTittle();
        JobTittle.isJobTittlePannelDisplayed();
        JobTittle.clickAddJob();
        JobTittle.isAddJobTittlePannelDisplayed();
        JobTittle.setJobTittle(jobTittle);
        JobTittle.setJobTittleDescription(jobDescription);
        JobTittle.setJobTitle_note(jobNote);
        JobTittle.clickSave();

        if (status.equals("valid")){
        softAssert.assertTrue(JobTittle.isJobTittlePannelDisplayed(),"Not succesfully save the job tittle");
        }else
        {
            softAssert.assertEquals(MethodBase.get_Text("//span[@for]"),alert,"message not show");
        }
        softAssert.assertTrue(LoginPage.isDashboardDisplayed(),"Dashboard Page is not displayed");
        softAssert.assertAll();

        LOGGER.info("successful Login");
    }
}
