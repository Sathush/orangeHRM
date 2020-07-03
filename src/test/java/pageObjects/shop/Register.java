package pageObjects.shop;

import classpack.LoginPage;
import controllers.MethodBase;
import controllers.PageBase;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Register extends PageBase {
    private static final Logger LOGGER = Logger.getLogger(LoginPage.class);

    //private static By mecury_tour  = By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/p[1]/img");
    //private static By RegisterPage =  By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
    //private static By txtfirstname =By.name("firstName");
    //private static By txtlastname=By.name("lastName");
    //private static By txtphone = By.name("phone");
    //private static By txtemail = By.id("userName");
    //private static By txtaddress1 = By.name("address1");
   // private static By txtaddress2 = By.name("address2");
    //private static By txtcity = By.name("city");
//    private static By txtstate = By.name("state");
//    private static By txtpostalCode = By.name("postalCode");
//    private static By txtusername = By.name("email");
//    private static By txtpassword = By.name("password");
//    private static By txtconfirmPassword = By.name("confirmPassword");
//    private static By btnsubmit = By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");

    public static void  isPageDisplayed() {
        MethodBase.isDisplayed_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img");
        //return getDriver().findElement(mecury_tour).isDisplayed();
    }
    public static void clickregister() {
       MethodBase.clickButton_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
    }

    public static void setFirstName() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input","sathu");
       // getDriver().findElement(txtfirstname).sendKeys(firstname);
    }
    public static void setLastName() {
    MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[3]/td[2]/input","sathush");
    }
    public static void setPhone() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[4]/td[2]/input","07712345678");
    }
    public static void setEmail() {
        MethodBase.setText_ByXpath("//*[@id=\"userName\"]","sadjok@gmail");
    }
    public static void setAddress1() {
       MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[7]/td[2]/input","asdffghjvhm");
    }
    public static void setAddress2() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[8]/td[2]/input","dfyhgjhkj");
    }
    public static void setCity() {
       MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input","vgsfgjhk");
    }
    public static void setState() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[9]/td[2]/input","dfygfhk");
    }
    public static void setCode() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/input","dryfgjk");
    }
    public static void setUsername() {
        MethodBase.setText_ByXpath("//*[@id=\"email\"]","drytfghk");
    }
    public static void setPassword() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[15]/td[2]/input","123456");;
    }
    public static void setConfirmPassword() {
        MethodBase.setText_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[16]/td[2]/input", "123456");
    }
        public static void clickSubmit(){
            MethodBase.clickButton_ByXpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[18]/td/input");
        }



}


