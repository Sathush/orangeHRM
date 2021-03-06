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
    public static boolean isPayGradesDIsplay(){
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"search-results\"]/div[1]/h1");
    }
    public static void Addbtn(){
        MethodBase.clickButton_ById("btnAdd");
    }
    public static boolean isAddPayGradesDIsplay(){
        return MethodBase.isDisplayed_ById("payGradeHeading");
    }

    public static void Name(String name){
        MethodBase.setText_ByID("payGrade_name","name");
    }
    public static void Savebtn(){
        MethodBase.clickButton_ById("btnSave");
    }


}
