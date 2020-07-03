package pageObjects.shop;

import controllers.PageBase;
import org.openqa.selenium.By;

public class JobTittle extends PageBase {

    private static By Dashboerd  = By.xpath("//*[@id=\"menu_dashboard_index\"]/b");
    private static By btnAdmin  = By.id("menu_admin_viewAdminModule");
    private static By btnJob =By.id("menu_admin_Job");
    private static By btnJobTittle=By.id( "menu_admin_viewJobTitleList");
    private static By JobTittlesPannel  = By.xpath("//*[@id=\"search-results\"]/div[1]/h1");
    private static By btnAdd = By.id("btnAdd");
    private static By AddJobTittlePannel  = By.id("saveHobTitleHeading");
    private static By txtJobTittle  = By.id("jobTitle_jobTitle");
    private static By jobTitle_Discription  = By.id("jobTitle_jobDescription");
    private static By jobTitle_note  = By.id("jobTitle_note");

    private static By btnSave  = By.id("btnSave");


    public static boolean isDashboardDisplayed() {
        return getDriver().findElement(Dashboerd).isDisplayed();
    }

    public static void clickAdmin() {
        getDriver().findElement(btnAdmin).click();
    }
    public static void clickJob() {
        getDriver().findElement(btnJob).click();
    }

    public static void clickJobTittle() {
        getDriver().findElement(btnJobTittle).click();
    }

    public static boolean isJobTittlePannelDisplayed() {
        return getDriver().findElement(JobTittlesPannel).isDisplayed();
    }

    public static void clickAddJob() {

        getDriver().findElement(btnAdd).click();
    }
    public static boolean isAddJobTittlePannelDisplayed() {
        return getDriver().findElement(AddJobTittlePannel).isDisplayed();
    }

    public static void setJobTittle(String tittle) {
        getDriver().findElement(txtJobTittle).sendKeys(tittle);
    }
    public static void setJobTittleDescription(String Description) {
        getDriver().findElement(jobTitle_Discription).sendKeys(Description);
    }

    public static void setJobTitle_note(String Note) {
        getDriver().findElement(jobTitle_note).sendKeys(Note);
    }
    public static void clickSave() {
        getDriver().findElement(btnSave).click();
    }
}

