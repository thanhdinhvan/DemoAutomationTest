import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestTaxiApp extends BaseTestSequence {

public void sleepTest(){
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

    @Test
    public void testloginUser() throws  MalformedURLException {

        configTest();
        configTestPralells();
        MobileElement alert1 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]"));
        alert1.click();
        MobileElement alert2 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow Once\"]"));
        alert2.click();
        MobileElement alert3 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
        alert3.click();
        appTest2.findElementByXPath("//XCUIElementTypeStaticText[@name=\"Already have an account?\"]").click();
        MobileElement edUserNamr = appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi　Community　Mobility\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther");
        edUserNamr.click();
        String str = "son.dangthai+2@vti.com.vn";
        edUserNamr.sendKeys("s");
        sleepTest();
        edUserNamr.sendKeys("o");
        sleepTest();
        edUserNamr.sendKeys("n");
        sleepTest();
        edUserNamr.sendKeys(".");
        sleepTest();
        edUserNamr.sendKeys("d");
        sleepTest();
        edUserNamr.sendKeys("a");
        sleepTest();
        edUserNamr.sendKeys("n");
        sleepTest();
        edUserNamr.sendKeys("g");
        sleepTest();
        edUserNamr.sendKeys("t");
        sleepTest();
        edUserNamr.sendKeys("h");
        sleepTest();
        edUserNamr.sendKeys("a");
        sleepTest();
        edUserNamr.sendKeys("i");
        sleepTest();
        edUserNamr.sendKeys("+");
        sleepTest();
        edUserNamr.sendKeys("2");
        sleepTest();
        edUserNamr.sendKeys("@");
        sleepTest();
        edUserNamr.sendKeys("v");
        sleepTest();
        edUserNamr.sendKeys("t");
        sleepTest();
        edUserNamr.sendKeys("i");
        sleepTest();
        edUserNamr.sendKeys(".");
        sleepTest();
        edUserNamr.sendKeys("c");
        sleepTest();
        edUserNamr.sendKeys("o");
        sleepTest();
        edUserNamr.sendKeys("m");
        sleepTest();
        edUserNamr.sendKeys(".");
        sleepTest();
        edUserNamr.sendKeys("v");
        sleepTest();
        edUserNamr.sendKeys("n");
        sleepTest();
        MobileElement edPassUser = appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi　Community　Mobility\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeOther");
        edPassUser.click();
        edPassUser.sendKeys("1");
        sleepTest();
        edPassUser.sendKeys("2");
        sleepTest();
        //
        MobileElement alert4 = appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow Once\"]"));
        alert4.click();
        MobileElement alert5 = appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
        alert5.click();
        MobileElement alert6 = appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]"));
        alert6.click();
        MobileElement btnLoginToStars = appium.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        btnLoginToStars.click();
        MobileElement edCode = appium.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
        edCode.click();
        edCode.sendKeys("D");
        sleepTest();
        edCode.sendKeys("Q");
        sleepTest();
        edCode.sendKeys("D");
        sleepTest();
        edCode.sendKeys("W");
        sleepTest();
        edCode.sendKeys("9");
        sleepTest();
        edCode.sendKeys("2");
        sleepTest();
        edCode.sendKeys("7");
        sleepTest();
        edCode.sendKeys("9");
        sleepTest();
        edCode.sendKeys("1");
        MobileElement edPass = appium.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
        edPass.click();
        edPass.sendKeys("D");
        sleepTest();
        appium.findElementByXPath("//XCUIElementTypeButton[@name=\"ic eye\"]").click();
        appium.findElementByXPath("//XCUIElementTypeButton[@name=\"ic eye\"]").click();
        edPass.sendKeys("Q");
        //
        edPassUser.sendKeys("3");
        sleepTest();
        edPassUser.sendKeys("4");
        sleepTest();
        edPassUser.sendKeys("5");
        sleepTest();
        edPassUser.sendKeys("6");
        sleepTest();
        edPassUser.sendKeys("7");
        sleepTest();
        edPassUser.sendKeys("8");
        sleepTest();
        appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi　Community　Mobility\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]").click();
        MobileElement btnLoginUser = appTest2.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        btnLoginUser.click();
        sleepTest();
        //divice2
//        configTestPralells();

        sleepTest();
        edPass.sendKeys("D");
        sleepTest();
        edPass.sendKeys("W");
        sleepTest();
        edPass.sendKeys("9");
        sleepTest();
        edPass.sendKeys("2");
        sleepTest();
        edPass.sendKeys("7");
        sleepTest();
        edPass.sendKeys("9");
        sleepTest();
        edPass.sendKeys("1");
        sleepTest();
        appium.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther").click();
        MobileElement btnLogin = appium.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        btnLogin.click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(true);
    }



}
