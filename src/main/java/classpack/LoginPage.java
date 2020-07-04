package classpack;

import controllers.MethodBase;
import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);
//
//    private static By loginPannel = By.id("logInPanelHeading");
//    private static By Username = By.id("txtUsername");
//    private static By Password = By.id("txtPassword");
//    private static By btnLogin = By.id("btnLogin");
//    private static By Dashboerd = By.xpath("//*[@id=\"menu_dashboard_index\"]/b");

    public static void isLoginPannelDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\"frmLogin\"]");
    }

    public static void setUserName(String username) {
        MethodBase.setText_ByXpath("//*[@id=\"txtUsername\"]", "Admin");
    }

    public static void setPassword(String password) {
        MethodBase.setText_ByXpath("//*[@id=\"txtPassword\"]", "admin123");
    }

    public static void clickSubmit() {
        MethodBase.clickButton_ByXpath("//*[@id=\"btnLogin\"]");
    }

    public static void isDashboardDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_dashboard_index\"]/b");
    }



}
