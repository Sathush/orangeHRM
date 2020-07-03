package classpack;

import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    private static By loginPannel  = By.id("logInPanelHeading");
    private static By Username =By.id("txtUsername");
    private static By Password=By.id( "txtPassword");
    private static By btnLogin = By.id("btnLogin");
    private static By Dashboerd = By.id("menu_dashboard_index");

    public static boolean isLoginPannelDisplayed() {
        return getDriver().findElement(loginPannel).isDisplayed();
    }

    public static void setUserName(String username) {
        getDriver().findElement(Username).sendKeys(username);
    }

    public static void setPassword(String password) {
        getDriver().findElement(Password).sendKeys(password);
    }

    public static void clickSubmit() {
        getDriver().findElement(btnLogin).click();
    }
    public static boolean isDashboardDisplayed() {
        return getDriver().findElement(Dashboerd).isDisplayed();
    }



}
