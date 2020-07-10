package pageObjects.shop;

import controllers.MethodBase;
import controllers.PageBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Report extends PageBase {

    private static By GenerateDropDown  = By.id("leave_balance_report_type");
    private static By LeaveTypeDropDown  = By.id("leave_balance_leave_type");
    private static By FromDropDown  = By.id("period");
    private static By JobTittleDropDown  = By.id("leave_balance_job_title");
    private static By LocationDropDown  = By.id("leave_balance_location");
    private static By SubunitDropDown  = By.id("leave_balance_sub_unit");
    private static By checkbox1 =By.id("leave_balance_include_terminated");



    public static boolean isDashboardDisplayed() {
       return MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_dashboard_index\"]/b");
    }

    public static void checkCheckBox1() {
        WebElement checkbox = getDriver().findElement(checkbox1);
        if (!checkbox.isSelected())
            checkbox.click();
    }


    public static void clickLeave() {
        MethodBase.clickButton_ById("menu_leave_viewLeaveModule");
    }

    public static void clickReport() {
        MethodBase.clickButton_ById("menu_leave_Reports");
    }
    public static void clickLeaveEntittlement() {
        MethodBase.clickButton_ById("menu_leave_viewLeaveBalanceReport");
    }
    public static boolean isReportDisplayed() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"menu_dashboard_index\"]/b");
    }
    public static boolean isReportDisplayedchackbox() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"leave_balance_include_terminated\"]");
    }

    public static void getGenerateForDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(GenerateDropDown));
        dropDownOptionmonth.selectByVisibleText(txt);
    }
    public static boolean isLeaveEntitlementsandUsageReportDisplayed() {
        return MethodBase.isDisplayed_ByXpath("//*[@id=\"leave-balance-report\"]/div[1]/h1");
    }
    public static void getLeaveTypeDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(LeaveTypeDropDown));
        dropDownOptionmonth.selectByVisibleText(txt);
    }
    public static String getSelectedgetLeaveTypeDropDown() {
        Select dropDownOption = new Select(getDriver().findElement(LeaveTypeDropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void getFromDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(FromDropDown));
        dropDownOptionmonth.selectByVisibleText(txt);
    }
    public static String getSelectedgetFromDropDownDropDown() {
        Select dropDownOption = new Select(getDriver().findElement(FromDropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void getJobTittleDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(JobTittleDropDown));
        dropDownOptionmonth.selectByVisibleText(txt);
    }
    public static String getSelectedgetJobTittleDropDownDropDown() {
        Select dropDownOption = new Select(getDriver().findElement(JobTittleDropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void getLocationDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(LocationDropDown));
        dropDownOptionmonth.selectByIndex(2);
    }
    public static String getSelectedgetLocationDropDownDropDown() {
        Select dropDownOption = new Select(getDriver().findElement(LocationDropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }

    public static void getSubunitDropDown(String txt) {
        Select dropDownOptionmonth = new Select(getDriver().findElement(SubunitDropDown));
        dropDownOptionmonth.selectByVisibleText(txt);
    }
    public static String getSelectedgetSubUnitDropDownDropDown() {
        Select dropDownOption = new Select(getDriver().findElement(SubunitDropDown));
        return dropDownOption.getFirstSelectedOption().getText();
    }
    public static void clickView() {
        MethodBase.clickButton_ById("viewBtn");
    }


    }
