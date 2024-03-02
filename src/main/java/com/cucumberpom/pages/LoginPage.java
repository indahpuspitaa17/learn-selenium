package com.cucumberpom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class LoginPage extends BaseTest {

  @FindBy(name = "email")
  WebElement emailInputField;

  @FindBy(name = "password")
  WebElement passwordInputField;

  @FindBy(xpath = "//div/button[@type='submit']")
  WebElement masukButtonV1;

  public LoginPage() {
    PageFactory.initElements(driver, this);

  }

  public String getTitle() {
    return driver.getTitle();
  }

  public void doLogin() {
    emailInputField.sendKeys(prop.getProperty("email"));
    passwordInputField.sendKeys(prop.getProperty("password"));

    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();", masukButtonV1);
  }
}
