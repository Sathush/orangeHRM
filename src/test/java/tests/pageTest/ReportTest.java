package tests.pageTest;

import classpack.LoginPage;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.Report;
import testData.LoginData;
import utils.Constants;

public class ReportTest extends TestBase {
    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test
    public void testReport() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(Report.isDashboardDisplayed(), "LoginPannel is not Displayed");

        Report.clickLeave();
        Report.clickReport();
        Report.clickLeaveEntittlement();
        softAssert.assertTrue(Report.isReportDisplayed(), "LoginPannel is not Displayed");
        Report.getGenerateForDropDown("Leave Type");
        LOGGER.info("Leave Type Selected");

        softAssert.assertTrue(Report.isLeaveEntitlementsandUsageReportDisplayed(), "Leave Entitlementsand Usage Report is not Displayed");

        Report.getLeaveTypeDropDown("Maternity US");
        softAssert.assertEquals(Report.getSelectedgetLeaveTypeDropDown(), "Maternity US", "Leave value is incorrect");
        LOGGER.info("get leave type dropdown worked");

        Report.getFromDropDown("2015-01-01 - 2015-12-31");
        softAssert.assertEquals(Report.getSelectedgetFromDropDownDropDown(), "2015-01-01 - 2015-12-31", "Leave value is incorrect");
        LOGGER.info("get from dropdown worked");

        Report.getJobTittleDropDown("CEO");
        softAssert.assertEquals(Report.getSelectedgetJobTittleDropDownDropDown(), "CEO", "Leave value is incorrect");
        LOGGER.info("get from dropdown worked");

        Report.getLocationDropDown("Canada");
        softAssert.assertEquals(Report.getSelectedgetLocationDropDownDropDown(), "Canadian Development Center", "Leave value is incorrect");
        LOGGER.info("get from dropdown worked");

        Report.getSubunitDropDown("Finance");
        softAssert.assertEquals(Report.getSelectedgetSubUnitDropDownDropDown(), "Finance", "Leave value is incorrect");
        LOGGER.info("get from dropdown worked");

        Report.checkCheckBox1();
        LOGGER.info("CheckBox1 Selected");

        Report.clickView();
        softAssert.assertTrue(Report.isReportDisplayedchackbox(),"Dashboard Page is not displayed");
        softAssert.assertAll();


    }
}
