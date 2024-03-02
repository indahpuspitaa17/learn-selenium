package com.cucumberpom.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//div/button[@type='submit']")
	WebElement submitButton;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String getTitle() {
		return driver.getTitle();
	}

	public void doLogin() {
		email.sendKeys(prop.getProperty("email"));
		password.sendKeys(prop.getProperty("password"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", submitButton);
	}
}
