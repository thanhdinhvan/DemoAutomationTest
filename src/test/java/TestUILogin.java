
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;



public class TestUILogin extends BaseTest{


    public void testLoginScreen() throws  MalformedURLException {
        MobileElement app;

    }


    public  void TestUILoginEX() throws MalformedURLException {
        MobileElement app;
//        app = appium.findElement(By.id("IntegerA"));
//        app.click();
//        app.sendKeys("thanh123456");
//        String str = app.getAttribute("value");
        appium.findElement(By.id("btnNextVC")).click();
        //Assert.assertEquals("", str);
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        MobileElement cell1 = appium.findElement(By.xpath("// XCUIElementTypeCell [1]"));
        File fileCell = ((TakesScreenshot)cell1).getScreenshotAs(OutputType.FILE);
       // copyIMG(fileCell,cell1.getAttribute("name") );
        MobileElement btnCong =  appium.findElement(By.id("btnCong"));
        MobileElement btnTru =  appium.findElement(By.id("btnTru"));
//        try {
//            appium.findElement(By.id("btnNextVC")).wait(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        btnCong.click();
        btnCong.click();
        btnCong.click();
        btnCong.click();
        MobileElement lbKetQua = appium.findElement(By.id("lbKetQua"));
        String str = lbKetQua.getText();
        File file = ((TakesScreenshot)btnTru).getScreenshotAs(OutputType.FILE);
        File fileScreen = ((TakesScreenshot)appium).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("/Users/vanthanh/IdeaProjects/TestUIIOS/src/test/screenShots/screen.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        //copyIMG(file,btnTru.getText());
        //String value
        //copyIMG(fileScreen,appium.findElement(By.xpath("//XCUIElementTypeNavigationBar[@name=\"VanThanh\"]")).getAttribute("name"));
        System.out.println(btnTru.getScreenshotAs(OutputType.FILE).getPath());
        org.openqa.selenium.Point point = btnCong.getCenter();
        int centerx = point.getX();
        int centerY = point.getY();

        //XCUIElementTypeNavigationBar[@name="Inventory.VCTest"]

        File scrFile = btnCong.getScreenshotAs(OutputType.FILE);
        Dimension dimension = appium.manage().window().getSize();
        TouchAction touchAction = new TouchAction(appium);
        touchAction.press(PointOption.point(196,241))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(80,241))
                .release()
                .perform();
        //System.out.println(str);
//        UID,
//                accessibilityContainer,
//                accessible,
//                enabled,
//                frame,
//                index,
//                label,
//                name,
//                rect,
//                selected,
//                type,
//                value,
//                visible,
//                wdAccessibilityContainer,
//                wdAccessible,
//                wdEnabled,
//                wdFrame,
//                wdIndex,
//                wdLabel,
//                wdName,
//                wdRect,
//                wdSelected,
//                wdType,
//                wdUID,
//                wdValue,
//                wdVisible
    }

    public void getColorApp() {
        System.out.println("getColorApp");
//        BufferedImage image;
//        int width;
//        int height;
//            try {
//                File input = new File(path);
//                image = ImageIO.read(input);
//                width = image.getWidth();
//                height = image.getHeight();
//
//                int count = 0;
//
//                for(int i=0; i<height; i++) {
//
//                    for(int j=0; j<width; j++) {
//
//                        count++;
//                        Color c = new Color(image.getRGB(j, i));
//                        System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
//                    }
//                }
//
//            } catch (Exception e) {}




//        try {
//            ImageIO.write(rp, type, new File("d:\\red.jpg"));
//            ImageIO.write(gp, type, new File("d:\\green.jpg"));
//            ImageIO.write(bp, type, new File("d:\\blue.jpg"));
//        } catch (IOException ex) {
//
//        }
    }}
