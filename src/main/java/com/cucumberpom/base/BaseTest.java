package com.cucumberpom.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberpom.utils.Constants;

public class BaseTest {

  public static WebDriver driver;
  public static Properties prop;

  public BaseTest() {
    prop = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(
          System.getProperty("user.dir")
              + "//src//main//java//com//cucumberpom//config//config.properties");
      prop.load(fileInputStream);
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void initBrowser() {
    String browser = System.getProperty("browser");

    if (browser.equalsIgnoreCase("chrome")) {
      System.setProperty("webdriver.chrome.driver",
          System.getProperty("user.dir") + "//resources//chromedriver.exe");
      driver = new ChromeDriver();
    } else {
      System.out.println("The browser was not defined in Configuration.");
    }

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Constants.IMPLICITLY_WAIT, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(Constants.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

    String url = prop.getProperty("ApplicationURLv1");
    driver.get(url);
  }
}
