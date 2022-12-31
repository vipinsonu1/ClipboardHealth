package testCase;

import com.base.TestBase;
import com.pageLocater.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;
    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }
    @Test
    @Parameters({"email"})
    public void verifyLoginPage(String email) throws InterruptedException {
      loginPage.Login(email);
    }
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
