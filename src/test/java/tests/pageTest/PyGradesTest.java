package tests.pageTest;

import classpack.LoginPage;
import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.PayGrades;
import testData.JobTittleData;

public class PyGradesTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = JobTittleData.class,dataProvider = "JobTittleExcel")
    public void testJobTittle(String Name, String jobDescription, String jobNote) {
        softAssert = new SoftAssert();
        softAssert.assertTrue(PayGrades.isDashboardDisplay(), "Dashboard is not Displayed");
        PayGrades.Adminbtn();
        PayGrades.Jobbtn();
        PayGrades.PayGrade();
        softAssert.assertTrue(PayGrades.isPayGradesDIsplay(), "Dashboard is not Displayed");
        PayGrades.Addbtn();
        softAssert.assertTrue(PayGrades.isAddPayGradesDIsplay(), "Dashboard is not Displayed");
        PayGrades.Name(Name);
        PayGrades.Savebtn();
        softAssert.assertAll();
    }
}
