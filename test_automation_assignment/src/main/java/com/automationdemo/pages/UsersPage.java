package com.automationdemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationdemo.base.TestBase;

public class UsersPage extends TestBase  {
	 @FindBy(xpath = "//div[@class='atLogoImg']")
	    WebElement actiTimeLogo;
	    @FindBy(xpath = "//div[@class='userNameContent']")
	    WebElement userLink;

	    public UsersPage() {
	        PageFactory.initElements(driver, this);
	    }
	    public Boolean validateActiTimeLogo() {
	        return actiTimeLogo.isDisplayed();
	    }

	    public UsersPage clickOnUser() {
	        try {
	            Thread.sleep(500);
	        } catch (InterruptedException e) {
	            System.out.println(e.toString());
	        }
	        userLink.click();
	        return new UsersPage();
	    }
	}

