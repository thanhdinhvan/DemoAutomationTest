import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestLoginScreen extends BaseTest {

    @AfterMethod
    public void closeApp(){
        appium.closeApp();
    }

    @BeforeMethod
    public  void openApp(){
        appium.resetApp();
    }

    @Test
    public void testLoginScreenView() throws MalformedURLException {
        MobileElement app;
        Assert.assertTrue(appium.findElement(By.id("LoginScreen_2.View")).isEnabled());
        MobileElement staticText = appium.findElement(By.id("discriptionLoginScreen"));
        //Check exits discription on screen
        Assert.assertTrue(staticText.isDisplayed());
        Assert.assertEquals(staticText.getText(),"Create Account");

        //Check exits ed_user_name on screen
        MobileElement edUserName = appium.findElement(By.id("ed_user_name"));
        Assert.assertTrue(edUserName.isDisplayed());
        Assert.assertTrue(edUserName.isEnabled());
        Assert.assertEquals(edUserName.getText(),"User name");
        edUserName.click();
        edUserName.sendKeys("aaaaazzzzz");
        Assert.assertEquals(edUserName.getText(),"aaaaabbbbb");

        //Check exits discription on screen
        MobileElement edPass = appium.findElement(By.id("ed_pass"));
        Assert.assertTrue(edPass.isDisplayed());
        Assert.assertTrue(edPass.isEnabled());
        Assert.assertEquals(edPass.getText(),"Password");
        edPass.click();
        edPass.sendKeys("aaaaazzzzz");
        Assert.assertEquals(edPass.getText(),"aaaaabbbbb");

        appium.findElement(By.id("img_back_ground_view_login")).click();

        //Check btn login Apple on screen
        MobileElement btnLoginApple = appium.findElement(By.id("btn_login_apple"));
        Assert.assertTrue(btnLoginApple.isDisplayed());
        Assert.assertTrue(btnLoginApple.isEnabled());
        Assert.assertEquals(btnLoginApple.getText(),"Sign in with Apple");
        btnLoginApple.click();
        //Check alert on screen
        Assert.assertEquals(appium.switchTo().alert().getText(),"Login Apple\nAuthenticate failed");
        appium.switchTo().alert().dismiss();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Check btn login Google
        MobileElement btnLoginGoogle = appium.findElement(By.id("btn_login_google"));
        Assert.assertTrue(btnLoginGoogle.isDisplayed());
        Assert.assertTrue(btnLoginGoogle.isEnabled());
        Assert.assertEquals(btnLoginGoogle.getText(),"Sign in with Google");
        btnLoginGoogle.click();
        Assert.assertEquals(appium.switchTo().alert().getText(),"Login Google\nAuthenticate failed");
        appium.switchTo().alert().dismiss();

        //Check btn login on Screen
        MobileElement btnLogin = appium.findElement(By.id("btn_login"));
        Assert.assertTrue(btnLogin.isDisplayed());
        Assert.assertTrue(btnLogin.isEnabled());
        Assert.assertEquals(btnLogin.getText(),"Log in");
        btnLogin.click();
        //TO-DO:

        //Check screen Home
        MobileElement screenHome = appium.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"Home\"]"));
        screenHome.isDisplayed();
        System.out.println(screenHome.getText());
        Assert.assertTrue(screenHome.isDisplayed());

    }

    @Test
    public void testSettingScreen() throws MalformedURLException {
        testLoginScreenView();
        MobileElement tabBarbutton = appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Setting\"]"));
        Assert.assertTrue(tabBarbutton.isEnabled());
        Assert.assertEquals(tabBarbutton.getText(),"Setting");
        tabBarbutton.click();
        MobileElement screenSetting = appium.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"Setting\"]"));
        Assert.assertTrue(screenSetting.isDisplayed());

        MobileElement btnLogout = appium.findElement(By.id("btn_log_out"));
        Assert.assertTrue(btnLogout.isDisplayed());
        Assert.assertTrue(btnLogout.isEnabled());
        Assert.assertEquals(btnLogout.getAttribute("label"),"Log Out");
        btnLogout.click();

        WebDriverWait wait = new WebDriverWait(appium, 4);
        WebElement messageElement = wait.until( ExpectedConditions.presenceOfElementLocated(By.id("LoginScreen_2.View")));

    }

    @Test
    public void testListMusicScreen() throws MalformedURLException {
        testLoginScreenView();
        MobileElement tabBarbutton = appium.findElementByXPath("//XCUIElementTypeButton[@name=\"List Music\"]");
        Assert.assertTrue(tabBarbutton.isEnabled());
        Assert.assertEquals(tabBarbutton.getText(),"List Music");
        tabBarbutton.click();

        //Check table View
        MobileElement tableView = appium.findElementByXPath("//XCUIElementTypeApplication[@name=\"LoginScreen-2\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable");
        Assert.assertTrue(tableView.isDisplayed());
        MobileElement btnAdd = appium.findElement(By.id("btn_add_user"));
        Assert.assertTrue(btnAdd.isDisplayed());
        Assert.assertTrue(btnAdd.isEnabled());
        Assert.assertEquals(btnAdd.getAttribute("label"),"ADD User");
        btnAdd.click();
        btnAdd.click();
        List<MobileElement> tableViewCell = appium.findElementsByXPath("//XCUIElementTypeApplication[@name=\"LoginScreen-2\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell");
        Assert.assertEquals(tableViewCell.size(),5);
    }

}
