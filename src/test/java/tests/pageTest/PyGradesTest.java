package tests.pageTest;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.PayGrades;
import testData.JobTittleData;

public class PyGradesTest {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = JobTittleData.class,dataProvider = "JobTittleExcel")
    public void testJobTittle(String jobTittle, String jobDescription, String jobNote) {
        PayGrades.isDashboardDisplay();
        PayGrades.Adminbtn();
        PayGrades.Jobbtn();
        PayGrades.PayGrade();
        PayGrades.isPayGradesDIsplay();
    }
}
