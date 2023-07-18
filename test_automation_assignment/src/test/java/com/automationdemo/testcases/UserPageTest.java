package com.automationdemo.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automationdemo.base.TestBase;
import com.automationdemo.pages.HomePage;
import com.automationdemo.pages.LoginPage;
import com.automationdemo.pages.UsersPage;

public class UserPageTest extends TestBase {
    HomePage homePage;
    UsersPage userPage;
    LoginPage loginPage;

    public UserPageTest() {
        super();
    }

    @BeforeMethod
    public void seup() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.loging(properties.getProperty("username"), properties.getProperty("password"));
        userPage=homePage.clickOnUserLink();
    }

    @Test(priority = 1)
    public void loginPageLogoTest() {
        userPage =  userPage.clickOnUser();
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
