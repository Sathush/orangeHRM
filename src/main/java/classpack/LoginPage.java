package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.apache.log4j.Logger;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);


    public static boolean isLoginPannelDisplayed() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"frmLogin\"]");
    }

    public static void setUserName(String username) {
        MethodBase.setText_ByID("txtUsername", "Admin");
    }

    public static void setPassword(String password) {
        MethodBase.setText_ByID("txtPassword", "admin123");
    }

    public static void clickSubmit() {
        MethodBase.clickButton_ByXpath("//*[@id=\"btnLogin\"]");
    }

    public static boolean isDashboardDisplayed() {
      return  MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_dashboard_index\"]/b");

    }



}
