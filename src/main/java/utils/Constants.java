package utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;

public class Constants {
    public static final String UBUNTU = "ubuntu";
    public static final String WINDOWS = "windows";
    public static final String CHROME = "chrome";
    public static final String FIREFOX = "firefox";
    public static int DEFAULT_EXPLICIT_TIME_OUT = 20;

    public static final String AB_TEST_LINK = "/abtest";


    public static final String Addmeassage = "Your personal information has been successfully updated.";
    public static Robot re;
    public static Alert al;
    public static Actions ac;
    public static Select se;
}
