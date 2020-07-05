package pageObjects.shop;

import controllers.MethodBase;

public class PayGrades {
    public static boolean isDashboardDisplay(){
        return MethodBase.isDisplayed_ById("menu_dashboard_index");

    }
    public static void Adminbtn(){
        MethodBase.clickButton_ById("menu_admin_viewAdminModule");
    }

    public static void Jobbtn(){
        MethodBase.clickButton_ById("menu_admin_Job");
    }
    public static void PayGrade(){
        MethodBase.clickButton_ById("menu_admin_viewPayGrades");

    }
    public static void isPayGradesDIsplay(){
        MethodBase.clickButton_ById("//*[@id=\"search-results\"]/div[1]/h1");
    }
}
