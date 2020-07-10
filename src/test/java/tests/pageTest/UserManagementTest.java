package tests.pageTest;

import classpack.LoginPage;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testData.LoginData;

public class UserManagementTest {
    private static final Logger LOGGER = Logger.getLogger(LoginTest.class);

    @Test(dataProviderClass = LoginData.class,dataProvider = "LoginExcel")
    public void testlogin(String username, String password) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPannelDisplayed(), "LoginPannel is not Displayed");
        LoginPage.setUserName(username);
        LoginPage.setPassword(password);
        LoginPage.clickSubmit();
        softAssert.assertTrue(LoginPage.isDashboardDisplayed(),"Dashboard Page is not displayed");
        softAssert.assertAll();

        LOGGER.info("successful Login");
    }
}
