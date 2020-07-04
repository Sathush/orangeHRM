package pageObjects.shop;

import controllers.MethodBase;
import controllers.PageBase;
import org.openqa.selenium.By;

public class JobTittle extends PageBase {
//
//    private static By Dashboerd  = By.xpath("//*[@id=\"menu_dashboard_index\"]/b");
//    private static By btnAdmin  = By.id("menu_admin_viewAdminModule");
//    private static By btnJob =By.id("menu_admin_Job");
//    private static By btnJobTittle=By.id( "menu_admin_viewJobTitleList");
//    private static By JobTittlesPannel  = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");
//    private static By btnAdd = By.id("btnAdd");
//    private static By AddJobTittlePannel  = By.id("saveHobTitleHeading");
//    private static By txtJobTittle  = By.id("jobTitle_jmenu_admin_viewAdminModuleobTitle");
//    private static By jobTitle_Discription  = By.id("jobTitle_jobDescription");
//    private static By jobTitle_note  = By.id("jobTitle_note");
//
//    private static By btnSave  = By.id("btnSave");


    public void  isDashboardDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\\\"menu_dashboard_index\\\"]/b");
    }

    public static void clickAdmin() {
        MethodBase.clickButton_ByXpath("//*[@id=\"menu_admin_viewAdminModule\"]");
    }
    public static void clickJob() {
    MethodBase.clickButton_ByXpath("//*[@id=\"menu_admin_Job\"]");

    }

    public static void clickJobTittle() {

       MethodBase.clickButton_ByXpath("//*[@id=\"menu_admin_viewJobTitleList\"]");
    }

    public static void isJobTittlePannelDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\"search-results\"]/div[1]/h1");
    }

    public static void clickAddJob() {
    MethodBase.clickButton_ByXpath("//*[@id=\"btnAdd\"]");
    }
    public static void isAddJobTittlePannelDisplayed() {
        MethodBase.isDisplayed_ByXpath("//*[@id=\"saveHobTitleHeading\"]");
    }

    public static void setJobTittle(String tittle) {
        MethodBase.setText_ByXpath("//*[@id=\"jobTitle_jobTitle\"]",tittle);
    }
    public static void setJobTittleDescription(String Description) {
        MethodBase.setText_ByXpath("//*[@id=\"jobTitle_jobDescription\"]", Description);
    }

    public static void setJobTitle_note(String Note) {

        MethodBase.setText_ByXpath("//*[@id=\"jobTitle_note\"]", Note);
    }
    public static void clickSave() {
        MethodBase.clickButton_ByXpath("//*[@id=\"btnSave\"]");
    }
}

