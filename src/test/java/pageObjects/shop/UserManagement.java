package pageObjects.shop;

import controllers.MethodBase;
import controllers.PageBase;

public class UserManagement extends PageBase {

    public void  isDashboardDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\\\"menu_dashboard_index\\\"]/b");
    }

    public static void clickAdmin() {
        MethodBase.clickButton_ById("menu_admin_viewAdminModule");
    }
    public static void UserManagement() {
        MethodBase.clickButton_ById("menu_admin_UserManagement");

    }
    public static void User() {
        MethodBase.clickButton_ById("menu_admin_viewSystemUsers");

    }
    public static void setUname() {

        MethodBase.clickButton_ById("searchSystemUser_userName");
    }
    public static void DropDownUserRole(){
        MethodBase.click_ById("searchSystemUser_userType");
    }
}
