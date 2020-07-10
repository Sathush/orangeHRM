package tests.pageTest;

import controllers.TestBase;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.EmploymentStatus;
import testData.EmploymentStatusData;

public class EmploymentStatusTest extends TestBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = EmploymentStatusData.class,dataProvider = "EmpStatus")
    public void EmpStatus(String Name) {
        EmploymentStatus.isDashboardDisplay();
        EmploymentStatus.Adminbtn();
        EmploymentStatus.EmpStatus();
        EmploymentStatus.isEmpSatatusPannelDIsplay();
        EmploymentStatus.Addbtn();
        EmploymentStatus.isAddEmpSatatusDIsplay();
        EmploymentStatus.Name(Name);
        EmploymentStatus.Savebtn();

    }
}
