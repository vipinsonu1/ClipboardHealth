package com.pageLocater;

import com.base.TestBase;
import com.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPage  extends TestBase {


    @FindBy(className = "ant-input")
    WebElement input_Login;
    @FindBy(className = "ant-btn-primary")
    WebElement submit;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    public void Login(String email) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        input_Login.sendKeys(email);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        submit.click();

    }

}
