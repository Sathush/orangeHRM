package pageObjects.shop;

import controllers.MethodBase;
import controllers.PageBase;

public class EmploymentStatus extends PageBase {
    public static boolean isDashboardDisplay(){
        return MethodBase.isDisplayed_ById("menu_dashboard_index");

    }
    public static void Adminbtn(){
        MethodBase.clickButton_ById("menu_admin_viewAdminModule");
    }

    public static void EmpStatus(){
        MethodBase.clickButton_ById("menu_admin_employmentStatus");
    }
    public static void PayGrade(){
        MethodBase.clickButton_ById("menu_admin_viewPayGrades");

    }
    public static boolean isEmpSatatusPannelDIsplay(){
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"search-results\"]/div[1]/h1");
    }
    public static void Addbtn(){
        MethodBase.clickButton_ById("btnAdd");
    }
    public static boolean isAddEmpSatatusDIsplay(){
        return MethodBase.isDisplayed_ById("empStatusHeading");
    }

    public static void Name(String name){
        MethodBase.setText_ByID("empStatus_name","name");
    }
    public static void Savebtn(){
        MethodBase.clickButton_ById("btnSave");
    }

}
