import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestParallelDevice extends BaseTestParallel {
    public void sleepTest(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void testDriverApp() throws MalformedURLException {

        MobileElement alert4 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow Once\"]"));
        alert4.click();
        MobileElement alert5 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"OK\"]"));
        alert5.click();
        MobileElement alert6 = appTest2.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]"));
        alert6.click();

        MobileElement btnLoginToStars = appTest2.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeButton"));
        btnLoginToStars.click();
        MobileElement edCode = appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
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
        MobileElement edPass = appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther");
        edPass.click();
        edPass.sendKeys("D");
        sleepTest();
        appTest2.findElementByXPath("//XCUIElementTypeButton[@name=\"ic eye\"]").click();
        appTest2.findElementByXPath("//XCUIElementTypeButton[@name=\"ic eye\"]").click();
        edPass.sendKeys("Q");
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
        appTest2.findElementByXPath("//XCUIElementTypeApplication[@name=\"[S]mobi Community Mobility Driver\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther").click();
        MobileElement btnLogin = appTest2.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        btnLogin.click();
    }


}
