package tests.pageTest;

import controllers.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.shop.Register;

public class RegisterTest extends TestBase {


        @Test
        public void testRegister( ) {
           SoftAssert softAssert = new SoftAssert();
         //   softAssert.assertTrue(Register.isPageDisplayed(), "Shop Page is not Displayed");
            Register.clickregister();
            //softAssert.assertTrue(Register.isRegisterPageDisplayed(), "Shop Page is not Displayed");
            Register.setFirstName();
            Register.setLastName();
            Register.setPhone();
            Register.setEmail();
            Register.setAddress1();
            Register.setAddress2();
            Register.setCity();
            Register.setCode();
            Register.setState();
            Register.setUsername();
            Register.setPassword();
            Register.setConfirmPassword();
            Register.clickSubmit();
           // LOGGER.info("successful Register");
         //   softAssert.assertTrue(Register.isRegisterPageDisplayed(),"Account Page is not displayed");
//           softAssert.assertAll();



    }
}
