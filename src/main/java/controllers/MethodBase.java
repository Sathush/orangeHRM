package controllers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import utils.Constants;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import static controllers.PageBase.getDriver;

public class MethodBase extends Constants {



    /* To get the Website Name */

//    public String getUrlTitle() throws Exception
//    {
//        URL aURL = new URL(baseUrl);
//        String WebName = aURL.getHost();
//        String WebSiteName = WebName.toUpperCase();
//        return WebSiteName;
//    }


    /* To Press ENTER Key using Robot */
    public void hitEnter() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_ENTER);
        re.keyRelease(KeyEvent.VK_ENTER);
    }


    /* To Press BACKSPACE Key using Robot */
    public void hitBackspace() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_BACK_SPACE);
        re.keyRelease(KeyEvent.VK_BACK_SPACE);
    }


    /* To Press DELETE Key using Robot */
    public void hitDelete() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_DELETE);
        re.keyRelease(KeyEvent.VK_DELETE);
    }


    /* To Select all the Text/Web Elements using ROBOT */
    public void selectAll() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_A);
        re.keyRelease(KeyEvent.VK_CONTROL);
        re.keyRelease(KeyEvent.VK_A);
    }


    /* To Copy all the Selected Text/Web Elements using ROBOT */
    public void copyAll() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_C);
        re.keyRelease(KeyEvent.VK_CONTROL);
        re.keyRelease(KeyEvent.VK_C);
    }


    /* To Paste all the Selected Text/Web Elements using ROBOT */
    public void pasteAll() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_V);
        re.keyRelease(KeyEvent.VK_CONTROL);
        re.keyRelease(KeyEvent.VK_V);
    }


    /* To Capture Screenshot(Replaces if already exists) */
    /*
     * Also, Make sure that the automation in running in the foreground to
     * capture the Image of the Browser. Else, It'll capture the open Window
     */
    public void robotScreenCapture(String robotImageName) throws Exception
    {
        re = new Robot();
        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage bufferedImage = re.createScreenCapture(area);
        // Save as PNG
        File file = new File(robotImageName);
        if (file.exists()) {
            file.delete();
        }
        ImageIO.write(bufferedImage, "png", file);
    }


    /* To ZoomOut */
    public void robotZoomOut() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_SUBTRACT);
        re.keyRelease(KeyEvent.VK_SUBTRACT);
        re.keyRelease(KeyEvent.VK_CONTROL);
    }


    /* To ZoomIn */
    public void robotZoomIn() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_ADD);
        re.keyRelease(KeyEvent.VK_ADD);
        re.keyRelease(KeyEvent.VK_CONTROL);
    }


    /* To ScrollUp using ROBOT */
    public void robotScrollUp() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_PAGE_UP);
        re.keyRelease(KeyEvent.VK_PAGE_UP);
    }


    /* To ScrollDown using ROBOT */
    public void robotScrollDown() throws Exception
    {
        re = new Robot();
        re.keyPress(KeyEvent.VK_PAGE_DOWN);
        re.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }


    /* To ScrollUp using JavaScript Executor */
    public void scrollUp() throws Exception
    {
        ((JavascriptExecutor) getDriver()).executeScript("scroll(0, -100);");
    }


    /* To ScrollDown using JavaScript Executor */
    public void scrollDown() throws Exception
    {
        ((JavascriptExecutor) getDriver()).executeScript("scroll(0, 100);");
    }


    /* To Move cursor to the Desired Location */
    public void moveCursor(int X_Position, int Y_Position) throws Exception
    {
        re.mouseMove(X_Position, Y_Position);
    }


    /* To Accept the Alert Dialog Message */
    public void alertAccept() throws Exception
    {
        al = getDriver().switchTo().alert();
        al.accept();
    }


    /* To Dismiss the Alert Dialog Message */
    public void alertDismiss() throws Exception
    {
        al = getDriver().switchTo().alert();
        al.dismiss();
    }


    /* To Get the Alert Messages */
    public String getAlertText() throws Exception
    {
        al = getDriver().switchTo().alert();
        String text = al.getText();
        Thread.sleep(2000);
        alertAccept();
        return text;
    }


    /* To Upload a File using JAVA AWT ROBOT */
    public void fileUpload(String FileToUpload) throws Exception
    {
        Thread.sleep(5000);
        StringSelection filetocopy = new StringSelection(FileToUpload);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filetocopy, null);
        Thread.sleep(1000);
        re = new Robot();
        re.keyPress(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_V);
        re.keyRelease(KeyEvent.VK_V);
        re.keyRelease(KeyEvent.VK_CONTROL);
        re.keyPress(KeyEvent.VK_ENTER);
        re.keyRelease(KeyEvent.VK_ENTER);
    }


    /* To Perform a WebAction of Mouse Over */
    public void mousehover(WebElement element)
    {
        ac = new Actions(getDriver());
        ac.moveToElement(element).build().perform();
    }


    /* To Perform Select Option by Visible Text */
    public void selectByVisibleText(WebElement element, String value)
    {
        se = new Select(element);
        se.selectByVisibleText(value);
    }


    /* To Perform Select Option by Index */
    public void selectByIndex(WebElement element, int value)
    {
        se = new Select(element);
        se.selectByIndex(value);
    }


    /* To Perform Select Option by Value */
    public void selectByValue(WebElement element, String value)
    {
        se = new Select(element);
        se.selectByValue(value);
    }


    /* To click a certain Web Element */
    public void click(WebElement element)
    {
        element.click();
    }


    /* To click a certain Web Element using DOM/ JavaScript Executor */
    public void JSclick(WebElement element)
    {
        ((JavascriptExecutor) getDriver()).executeScript("return arguments[0].click();", element);
    }


    /* To Type at the specified location */
    public void sendKeys(WebElement element, String value)
    {
        element.sendKeys(value);
    }


    /* To Clear the content in the input location */
    public void clear(WebElement element)
    {
        element.clear();
    }


    /* To Drag and Drop from Source Locator to Destination Locator */
    public void dragandDrop(WebElement Source, WebElement Destination)
    {
        ac = new Actions(getDriver());
        ac.dragAndDrop(Source, Destination);
    }


    /*To Drag from the given WebElement Location and Drop at the given WebElement location */
    public void dragandDropTo(WebElement Source, int XOffset, int YOffset) throws Exception
    {
        ac = new Actions(getDriver());
        ac.dragAndDropBy(Source, XOffset, YOffset);
    }


    /*To Open a Page in New Tab */
    public void rightClick(WebElement element)
    {
        ac = new Actions(getDriver());
        ac.contextClick(element);
        ac.build().perform();
    }


    /*To Close Current Tab */
    public void closeCurrentTab()
    {
        getDriver().close();
    }


    /*To Perform Click and Hold Action */
    public void clickAndHold(WebElement element)
    {
        ac = new Actions(getDriver());
        ac.clickAndHold(element);
        ac.build().perform();
    }


    /*To Perform Click and Hold Action */
    public void doubleClick(WebElement element)
    {
        ac = new Actions(getDriver());
        ac.doubleClick(element);
        ac.build().perform();
    }


    /*To Switch To Frame By Index */
    public void switchToFrameByIndex(int index) throws Exception
    {
        getDriver().switchTo().frame(index);
    }


    /*To Switch To Frame By Frame Name */
    public void switchToFrameByFrameName(String frameName) throws Exception
    {
        getDriver().switchTo().frame(frameName);
    }


    /*To Switch To Frame By Web Element */
    public void switchToFrameByWebElement(WebElement element) throws Exception
    {
        getDriver().switchTo().frame(element);
    }


    /*To Switch out of a Frame */
    public void switchOutOfFrame() throws Exception
    {
        getDriver().switchTo().defaultContent();
    }


    /*To Get Tooltip Text */
    public String getTooltipText(WebElement element)
    {
        String tooltipText = element.getAttribute("title").trim();
        return tooltipText;
    }


    /*To Close all Tabs/Windows except the First Tab */
    public void closeAllTabsExceptFirst()
    {
        ArrayList<String> tabs = new ArrayList<String> (getDriver().getWindowHandles());
        for(int i=1;i<tabs.size();i++)
        {
            getDriver().switchTo().window(tabs.get(i));
            getDriver().close();
        }
        getDriver().switchTo().window(tabs.get(0));
    }


    /*To Print all the Windows */
    public void printAllTheWindows()
    {
        ArrayList<String> al = new ArrayList<String>(getDriver().getWindowHandles());
        for(String window : al)
        {
            System.out.println(window);
        }
    }
    public static boolean isDisplayed_ById(String locator) {
        return  getDriver().findElement(By.id(locator)).isDisplayed();
    }
    public static boolean isDisplayed_ByXpath(String locator) {
        return  getDriver().findElement(By.xpath(locator)).isDisplayed();
    }
    public static void setText_ByID(String locator,String inputText) {
        getDriver().findElement(By.id(locator)).sendKeys(inputText);

    }
    public static void setText_ByXpath(String locator,String inputText) {
        getDriver().findElement(By.xpath(locator)).sendKeys(inputText);

    }
    public static void setEnterKey_ByXpath(String locator) {
        getDriver().findElement(By.xpath(locator)).sendKeys(Keys.ENTER);

    }
    public static void clickButton_ById(String locator) {
        getDriver().findElement(By.id(locator)).click();
    }


    public static void clickButton_ByXpath(String locator) {
        getDriver().findElement(By.xpath(locator)).click();
    }


    public static void click_ById(String locator) {

        getDriver().findElement(By.id(locator)).click();
    }
    public static void click_ByName(String locator) {

        getDriver().findElement(By.name(locator)).click();
    }
    public static void click_ByXpath(String locator) {

        getDriver().findElement(By.xpath(locator)).click();

    }

    public static void clear_ById(String locator) {

        getDriver().findElement(By.id(locator)).clear();
    }
    public static void clear_ByXpath(String locator) {

        getDriver().findElement(By.xpath(locator)).clear();

    }
    public static void selectDropDown(String locator) {
        Select dropdown = new Select(getDriver().findElement(By.xpath(locator)));
        dropdown.selectByVisibleText("Database Testing");
    }
    public static void selectAction(String locator1 ,String locator2) {
        Actions type = new Actions(getDriver());
        type.moveToElement(getDriver().findElement(By.xpath(locator1))).click().build().perform();
        type.click(getDriver().findElement(By.xpath(locator2))).build().perform();
    }

    public static String get_Text(String locator) {

        return getDriver().findElement(By.xpath(locator)).getText();

    }

    public static void assertEqual_Text_ById(String locator, String expectedText) {

        String actualText = getDriver().findElement(By.id(locator)).getText();

        Assert.assertEquals(actualText, expectedText);
    }
    public static void assertEqual_Text_ByXpath(String locator, String expectedText) {
        SoftAssert softAssert = new SoftAssert();
        String actualText = getDriver().findElement(By.xpath(locator)).getText();
        softAssert.assertEquals(actualText,expectedText);
        softAssert.assertAll();
    }
}
