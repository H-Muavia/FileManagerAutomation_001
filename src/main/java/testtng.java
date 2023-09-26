import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static org.junit.Assert.*;
import static org.openqa.selenium.By.xpath;




public class testtng {
    AndroidDriver driver;
    Dimension dim;
    private AndroidDriver B;
//    private AndroidDriver ;


    @BeforeClass()
    void StartApp() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"04097350AT000877");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"8.1");
        caps.setCapability("appPackage", "filemanager.fileexplorer.files.explorer");
        caps.setCapability("appActivity", "file.manager.filemanagment.best.filemanager2021.activities.SplashActivity");

/*
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"332556053900024");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"12");
        caps.setCapability("appPackage", "filemanager.fileexplorer.files.explorer");
        caps.setCapability("appActivity", "file.manager.filemanagment.best.filemanager2021.activities.SplashActivity");
*/
     //   URL url=new URL("http://127.0.0.1:4723/wd/hub");
     //   System.out.println(">>>>>><<<<<< APPIUM DRIVERS >>>>>><<<<<<");
      //  AndroidDriver driver= (AndroidDriver) new AndroidDriver(url, caps);

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        Thread.sleep(4000);

// Scroller
        dim = driver.manage().window().getSize();
        Thread.sleep(2000);



        System.out.println(">>>>>>>> APPLICATION STARTED...!");

        Dimension dim = driver.manage().window().getSize();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//        MobileElement element = (MobileElement) driver.findElementByAccessibilityId("SomeAccessibilityID");
//
//        this.driver=driver;


       /* System.out.println("Full Permissions Started");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath(
                "//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        System.out.println("Full Permissions Ended");
        System.out.println(">>>>Home Screen  Start");
        Thread.sleep(500);*/

                                    ////////////////////////////////////////////////////////////////////////////////////
/*
        System.out.println(">>>>>>>Short Permissions Start With Out Ads<<<<<<<<");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        System.out.println("<<<<<<<Short Permissions End>>>>>>>>>");

        System.out.println("Know Appivation Is on To Home Screen");   */


        System.out.println("*************************************   Short Permissions With Ads   ************************************");
        System.out.println(">>>>>>  Interstitial Ad Open");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        Thread.sleep(2000);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        System.out.println("<<<<<<<Short Permissions With Ads End>>>>>>>>>");


        System.out.println("Know Appivation Is on To Home Screen");
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);



    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(priority = 1)
    public void ImagesTestCase() throws InterruptedException {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Test Cases For Images <<<<<<<<<<<<<<<<<<<<<<<<<<<");
//        this.driver=driver;


        System.out.println(">>>>> Images View Randomly In Folders");
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_imageView")).click();
        System.out.println(">>>>>>>> Pic Open ");
        Thread.sleep(2000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView[1]")).click();
        System.out.println("<<<<<<<<<<< Back");

        Thread.sleep(2000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.8);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        Thread.sleep(2000);
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }


                                ////////////////////////////////////////////////////////////////////////////////////

        System.out.println(">>>>> Images Add To Favorite");
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println(">>>>> Know Removing From Favorite");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        System.out.println("Know checking Is It Remove From Favorite Or Not");
        Thread.sleep(3000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();

        System.out.println("After Add to Favorite And Removing We Are On Home Screen");
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }


                                                ////////////////////////////////////////////////////////////////////////////////


        System.out.println("Images Rename File");

        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
//
        System.out.println("before first try");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));


        Random random= new Random();
        random.setSeed(123456789);

        code.sendKeys(random.toString());

        Thread.sleep(3000);

        System.out.println(random);

        Thread.sleep(1500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_ok_button")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();
        System.out.println("After rename Back to Home Screen");


                                             ///////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Images Deletes");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        try {
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_imageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("Image Deleted And Know Back To Home Page");
        Thread.sleep(3500);
        System.out.println("Know Recylce This Deleted File");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        System.out.println("Befor Ad");
        driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
        try {
//            driver.findElement(By.id("close-button-icon")).click();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("After Ad");
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recyclebin_sidemenu_button")).click();
        Thread.sleep(3500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recycle_restore_button")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println("After Recycle We Are Know On Home Screen");

        Thread.sleep(3000);


                                /////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Images Folder and Images Details Started");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_side_arrow")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_buton")).click();
        Thread.sleep(4500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_ok_button")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_imageview")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_imagevideo_popupbutton")).click();
        Thread.sleep(4500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_ok_button")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();
        System.out.println("Dtails Function end");

                                 ////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Images Search Option Start");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/images_button")).click();
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        try {
//            driver.findElement(By.id("close-button-icon")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_cardview")).click();
        Thread.sleep(2000);
        try {
//            driver.findElement(By.id("close-button-icon")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        WebElement codee = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext"));
        Thread.sleep(3500);
        codee.sendKeys("302");
        System.out.println("input >>>>>>>>>>> 302");
        Thread.sleep(4500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();
        System.out.println("Searching Ended Now We Are On Home Screen");


                               /////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Images Share Starting");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/images_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_imageview")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        Thread.sleep(2500);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/share_imagevideo_popupbutton")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(6000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
//        Thread.sleep(2500);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();
        System.out.println("Share Images Ended");

        System.out.println("Now We Are On Home Screen");

        Thread.sleep(3500);
        //Images Test Cases End
    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test(priority = 2)
    public void VideoTest() throws InterruptedException {
        System.out.println("Test Cases For Video Folder");


        Thread.sleep(2000);
        System.out.println("Videos Folder Opening");

        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");
            System.out.println("Splash Load Fail");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[2]")).click();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("Click On Video After this line");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);

        driver.manage().timeouts().implicitlyWait(12000,TimeUnit.SECONDS);
        Thread.sleep(16000);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("After Video Play and Know On Home Screen");

        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }



        /////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Video Favorite and UnFavorite");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");
            System.out.println("Splash Load Pass");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        System.out.println("We are Going To Favorite Video");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");
            System.out.println("Splash Load Fail");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

        System.out.println("Know We UnFavorite It");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[3]")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

        System.out.println("Checking is it UnFavorite or Not ");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();
        System.out.println("After Favorite And UnFavorite We Are Now Back On Home Screen");

        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }



        ///////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Rename File And Check Its Details and Also Folder Details");
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/video_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_imageview")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("Rename");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_imagevideo_popupbutton")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement code2 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);

        Random random= new Random();
        random.setSeed(123456789);

        code2.sendKeys(random.toString());
        System.out.println(random);
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_ok_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println("Rename Done");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        System.out.println("Know checking whether It's Rename or Not and File Details");
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_imagevideo_popupbutton")).click();
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_ok_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_side_arrow")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_buton")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/detail_ok_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();
        System.out.println("After Rename And Details Check Know We Are On Home Screen");



                                      ////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Videos Delete Starting");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/video_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross succesfully");
            System.out.println("Splash Load both Pass and Fail");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("Delete ");
        Thread.sleep(2000);
        WebElement someElement2 =
                driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]"));

        TouchAction ac22=new TouchAction(driver);
        ac22.longPress(element(someElement2)).perform().release();
        System.out.println(">>>> Long Press for Delete image or video");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/deletedialog_ok_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();

        System.out.println("Delete Function End And We Are On Home Screen");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);

        System.out.println("Know Checking Is Delete File Goes To Recycle Bin ");

        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recycle_button")).click();
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recyclebin_sidemenu_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recycle_restore_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recyclebin_back_icon")).click();


                                               /////////////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Videos Searching Start");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/video_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.view.ViewGroup/android.widget.ImageView[2]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext"));
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        code.sendKeys("Body");
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.navigate().back();
        System.out.println("I Searched Body And It Found");
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);

        System.out.println("Searching Part End And We Are On Home Screen");


                                              //////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Share Video Start");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/video_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");
            System.out.println("Splash Load both pass and Fail");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_folder_play_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/image_video_more_option")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/share_imagevideo_popupbutton")).click();
        driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
        Thread.sleep(4000);
        System.out.println("On Gmail");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("android:id/button1")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross succesfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/folderviewer_back_icon")).click();
        System.out.println("File Share Function End And Know We Are On To Home Screen");


    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test(priority = 3)
    public void AudioTestCases() throws InterruptedException {

        System.out.println("We are Now Starting Audio Files Test Cases");


        System.out.println("Simply Playing Audio");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_cardview")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(12000,TimeUnit.SECONDS);
        Thread.sleep(6000);
//        System.out.println("Know Sending Video To 1:36");
//        driver.findElement(By.xpath("//android.widget.SeekBar[@content-desc=\"00:08\"]")).click();
//        driver.manage().timeouts().implicitlyWait(12000,TimeUnit.SECONDS);
//        Thread.sleep(6000);
//        System.out.println("Know Puasing ");
//        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/exo_pause")).click();
//        driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
//        Thread.sleep(3000);
//        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/btn_back")).click();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
//        Thread.sleep(3000);

        System.out.println("Simply Playing Audio Ends And Know We Are On Home Screen");
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }



        ///////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Audio File Favorite And UnFavorite");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("Know We Are In Audio Folder So We Doing Favorite File");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Media_fav_button")).click();

        System.out.println("Favorite Done Know Again Doing UnFavorite Audio File");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_sidemenu_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Media_fav_button")).click();

        System.out.println("UnFavorite Done Know Check Again ");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_sidemenu_button")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.navigate().back();
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        System.out.println("After Favorite And Un favorite We Are On To Home Screen");



                                                 /////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Rename and Details Of Audio File");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        System.out.println("Renaming File ");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_sidemenu_button")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Media_rename_button")).click();

        System.out.println("Value Input");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);

        Random random= new Random();
        random.setSeed(123456789);

        code.sendKeys(random.toString());
        System.out.println(random);

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);

        System.out.println("Value Added ");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_ok_button")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        System.out.println("Rename Done And Know We Are On Home Screen");


                                    /////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Searching File In Audio Folder");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_button")).click();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        System.out.println("We Are In Audio Folder");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        System.out.println("Entering Values");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement codee2 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext"));
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        codee2.sendKeys("zia");
        System.out.println("input >>>>>>>>>>>>>>>>>>>>>>> zia ");

        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(3000);
        System.out.println("File Found");
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();
        driver.navigate().back();
        System.out.println("File Found and Now We Go Back To Home Screen");

        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start_x=(int)(dim.width*0.5);
            int start_y=(int)(dim.height*0.2);

            int end_x=(int)(dim.width*0.5);
            int end_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end_x,end_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }


                                  ////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("Deleting Audio File");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
         driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/audio_sidemenu_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Media_delete_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/deletedialog_ok_button")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/Allmediaviewer_back_icon")).click();


        System.out.println("Know Recycle This Deleted File");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recycle_button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recyclebin_sidemenu_button")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recycle_restore_button")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/recyclebin_back_icon")).click();

        System.out.println("After Deleting And Recyle It , Know We Are On To Home Screen");


                            /////////////////////////////////////////////////////////////////////////////////////


        System.out.println("Share Audio Files On Gmail");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        Thread.sleep(4000);
        driver.navigate().back();
        System.out.println("After Share We Are Now On Home Screen");
        Thread.sleep(4000);

    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @Test(priority = 4)
    public void DocumentTest() throws InterruptedException {
        System.out.println(">>>>>>>>>> Test Cases For Document Files <<<<<<<<<<<");


        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        System.out.println("Opening All Files");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        System.out.println("All Documents Opening");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
//        System.out.println(".txt  File opening");
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
//        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
//        Thread.sleep(4000);
//
//        int starts1_x=(int)(dim.width*0.5);
//        int starts1_y=(int)(dim.height*0.8);
//
//        int ends1_x=(int)(dim.width*0.5);
//        int ends1_y=(int)(dim.height*0.2);
//        @SuppressWarnings("rawtypes")
//        TouchAction tss1=new TouchAction(driver);
//        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
//
//        tss1.press(PointOption.point(starts1_x,starts1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(ends1_x,ends1_y)).release().perform();
//
//
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        driver.navigate().back();
//        System.out.println("Closing .txt File");
//
//        System.out.println(".xls File Opening");
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        Thread.sleep(4000);
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]")).click();
//        driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
//        Thread.sleep(5000);
//
//        int starts2_x=(int)(dim.width*0.5);
//        int starts2_y=(int)(dim.height*0.8);
//
//        int ends2_x=(int)(dim.width*0.5);
//        int ends2_y=(int)(dim.height*0.2);
//        @SuppressWarnings("rawtypes")
//        TouchAction tsss2=new TouchAction(driver);
//        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
//
//        tsss2.press(PointOption.point(starts2_x,starts2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(ends2_x,ends2_y)).release().perform();
//
//        Thread.sleep(500);
//        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
//        driver.navigate().back();
//        System.out.println(".xls File Closing");
//        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


        System.out.println("pdf File Opening");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]")).click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(5000);

        int startss1_x=(int)(dim.width*0.5);
        int startss1_y=(int)(dim.height*0.8);

        int endss1_x=(int)(dim.width*0.5);
        int endss1_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction tsss1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        tsss1.press(PointOption.point(startss1_x,startss1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(endss1_x,endss1_y)).release().perform();

        Thread.sleep(500);
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("pdf File Close");
        System.out.println("All Files Opened and Know you are on Home Screen");

        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        Thread.sleep(3000);

        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }



        ////////////////////////////////////////////////////////////////////////////////////

        System.out.println(">>> All Types 1 File Add To Favorite And UnFavorite");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        System.out.println(">>>>>>>> .txt File From All Documents Opening");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2000);
        System.out.println(">>>>>>>> Now UnFavorite This File");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2000);
        System.out.println(">>>>>>>> Know Check Is It Remove From Favorites Or Not");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();


        Thread.sleep(1000);
        System.out.println(">>> Know For XLS File");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
        System.out.println(">>>>>>>> Adding To Favorite");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();

        System.out.println(">>>>>>>> Now Removing It From Favorite");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();

        System.out.println(">>>>>>>> Know checking Is it remove from Favorite or Not");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();


        System.out.println(">>> Know Fro PDF Files");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();
        System.out.println(">>>>>>>> Know Adding");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();

        System.out.println(">>>>>>>> Know Removing File");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();

        System.out.println(">>>>>>>> Know Checking Is It Remove From Favorite Or Not");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }


                                                ////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>Rename Any File<<<<<<<<<<<<<");

        System.out.println(">>> Firstly Changing .txt File");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        Thread.sleep(2000);

        Random random= new Random();
        random.setSeed(123456789);
        Thread.sleep(1000);

        code.sendKeys(random.toString());
        System.out.println(random);

        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);


        System.out.println(">>> Know For XLS Files");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);
        WebElement code2 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        Thread.sleep(2500);

        Random random1= new Random();
        random1.setSeed(123456789);
        Thread.sleep(1000);

        code2.sendKeys(random1.toString());
        System.out.println(random);

        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1500);


        System.out.println(">>> Know For PDF Files Rename");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);
        WebElement code3 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        Thread.sleep(2500);

        Random random2= new Random();
        random2.setSeed(123456789);
        Thread.sleep(1000);

        code3.sendKeys(random2.toString());
        System.out.println(random);


        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();

        System.out.println("<<<<<<<<<  After Rename All Files We Are On Home Screen");


                                        ////////////////////////////////////////////////////////////////////////////////////////


        System.out.println("**************************************  Checking Details Of All Files  ********************************************");


        System.out.println(">>>>>>>>>>>>>  For All Document Folder");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();

        System.out.println(">>>>>>>>>>>>>  Firstly Doc Files Details");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();

        System.out.println(">>>>>>>>>>>>>  Know For XLS Files");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();

        System.out.println(">>>>>>>>>>>>>  Know For PDF Files");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[6]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);

        System.out.println("*********************************  We Check Details Of All Available Files  ************************************");
        System.out.println(">>>>>  Know We Are On Home Screen");

        Thread.sleep(1000);

        System.out.println(">>>>>>  Know Check Details From Their Folder");
        System.out.println(">>>>>>   Firstly We Check For XLS Files   <<<<<<<<" );
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(500);
        driver.navigate().back();
        System.out.println("<<<<<  XLS Files Details End ");


        System.out.println(">>>>>>>>>>  Secondly We Check For PDF Files");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(500);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().back();
        System.out.println("<<<<<<   PDF Files Details Complete");

        System.out.println("<<<<<  After Checking Details Of Files , Know We Are On Home Screen");
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }



        ///////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>  We Are Going To Search Any File In All Document");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(1500);
        WebElement code4 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext"));
        Thread.sleep(3500);
        code4.sendKeys("errorLog");
        System.out.println("errorlog");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
        driver.navigate().back();

        System.out.println("<<<<<<<  After Search We Are Know On Home Screen");


                                    ////////////////////////////////////////////////////////////////////////////////////
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>  Deleting Files");

        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(1000);
        driver.navigate().back();
        Thread.sleep(1000);
        driver.navigate().back();

        System.out.println(">>>>>>>>>>>>>  Videos Deleted And Know We Are Going o Recycle It");
        Thread.sleep(2500);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(1000);
        driver.navigate().back();

        System.out.println("<<<<<<<  After Recycle Bin We Are Know On Home Screen");
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
                 try {
                     System.out.println(">>>>>>>>> We are In Try ");
                     Thread.sleep(2000);

                     int start5_x=(int)(dim.width*0.5);
                     int start5_y=(int)(dim.height*0.2);

                     int end5_x=(int)(dim.width*0.5);
                     int end5_y=(int)(dim.height*0.8);
                     @SuppressWarnings("rawtypes")
                     TouchAction ts5=new TouchAction(driver);
                     //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

                     ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                             .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

                     Thread.sleep(2000);
                     System.out.println("Try End");
                 }
                 catch (Exception a){
                     System.out.println("No Need Of Scroller");
                 }


                         ///////////////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>   Sharing any File");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(1000);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().back();

        System.out.println(">>>>>>>>>>>>>   After Share File We Are Know On Home Screen");
        Thread.sleep(5000);

    }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 5)
    public void ZippedTestNG() throws InterruptedException {

        System.out.println("******************************************  Zipped Folder  *****************************************");

        System.out.println(">>>>>  Unzipping Folder");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.navigate().back();

        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try ");
            Thread.sleep(2000);

            int start5_x=(int)(dim.width*0.5);
            int start5_y=(int)(dim.height*0.2);

            int end5_x=(int)(dim.width*0.5);
            int end5_y=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts5=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }

        System.out.println("<<<<<  Folder Extraction Complete");



                                    //////////////////////////////////////////////////////////////////////////////////

        System.out.println(">>>  Zipped Folder Adding To Favorite And Un favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(3000);
        System.out.println(">>>>>>>>>>>>  Favorite File Present In Favorite Folder");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println(">>>>>>>>>>>>  Know Un Favorite That File");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        System.out.println(">>>>>>>>>>>  Know Checking Is It Remove From Favorite Or Not");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        System.out.println(">>>>>>>>>>>  Yes File Remove From Folder");
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(1500);

        System.out.println("<<<<<<<<<<  After Favorite And UnFavorite We Are Know On Home Screen");


                                    ///////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>  Searched Any File From Zipped Folder<<<");

        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_allmediaviwer_edittext"));
        Thread.sleep(3500);
        code.sendKeys("z 2");
        System.out.println("z 2");
        Thread.sleep(3500);
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().back();

        System.out.println("<<<<<<  After Searching Any File We Are On Home Screen");



                                    ///////////////////////////////////////////////////////////////////////////////////

        System.out.println(">>>>>  Rename Zipped Folder And Check Its Details<<<");

        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(4000);
        WebElement code2 = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        Thread.sleep(2500);
        Random random= new Random();
        random.setSeed(123456789);

        code2.sendKeys(random.toString());
        System.out.println(random);

        Thread.sleep(4000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2000);

        System.out.println(">>>>>>>>>>>>  Know Checking Details Of Rename File");

        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("<<<<<<<<<  After Rename And Its Details Checks We Are Know On To Home Screen");


                            /////////////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>  know Deleting Zipped File And Recover It From Recycle Bin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("<<<<<<<<<<<<<<<<<<   File Deleted Successfully");

        System.out.println(">>>>>>>>>>>>>>>>>>  Know Recycle It ");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("<<<<<<<<<<<<<<<<<<<File Restored");

        System.out.println(">>>>>>>>>>>>>>>>>>Checking Is It Restored Or Not");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(4000);
        driver.navigate().back();

        System.out.println("<<<<<<<<<<<<<<<<<<  Files Present Here");

        System.out.println("<<<<<<<<<<<<<<<<<<  Ater Deleting And Restored W Are Now On To Home Screem");
        Thread.sleep(2000);


                            /////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>  Share Zipped File");

        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        Thread.sleep(2000);
        driver.navigate().back();

        System.out.println("<<<<<<<<<<  fter Zipped File Share We Are On Home Screen");

        System.out.println("Zipped Folder Test Cases Ends");
        Thread.sleep(5000);
    }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Test(priority = 6)
    public void AppsTestNG() throws InterruptedException {

        System.out.println("*************************************  Apps Folder Test Cases  *****************************************");

        System.out.println(">>>>>  Apps Open ");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Home Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(7500, TimeUnit.SECONDS);
        Thread.sleep(7500);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> New App Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(5000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button[2]")).click();

        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(3000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.8);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        System.out.println(">>>>>>>>>>>>First Scrolling Complete");
        Thread.sleep(3000);


//
//        int start1_x=(int)(dim.width*0.5);
//        int start1_y=(int)(dim.height*0.2);
//
//        int end1_x=(int)(dim.width*0.5);
//        int end1_y=(int)(dim.height*0.8);
//        @SuppressWarnings("rawtypes")
//        TouchAction ts1=new TouchAction(driver);
//        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
//
//        ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(end1_x,end1_y)).release().perform();
//
//        Thread.sleep(2000);
//        System.out.println(">>>>>>>>>>Second Scrolling Complete");


        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try For Scrolling");
            Thread.sleep(2000);

            int start5_x1=(int)(dim.width*0.5);
            int start5_y1=(int)(dim.height*0.2);

            int end5_x1=(int)(dim.width*0.5);
            int end5_y1=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts51=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts51.press(PointOption.point(start5_x1,start5_y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x1,end5_y1)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }

        System.out.println("<<<<<<<<<App Opend And Know We Are Back On  Home Screen");


                                ////////////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>Stoping Application From App");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Home Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        try{
            System.out.println("We are In a Try >>>>> Checking Force Disable Enable Or Not");
            Thread.sleep(500);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
            Thread.sleep(500);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
            System.out.println("Force Stop Successfully ");
        }
        catch (Exception e){
            System.out.println("Force Stop Disable ");
        }

        Thread.sleep(3500);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try For Scrolling");
            Thread.sleep(2000);

            int start5_x2=(int)(dim.width*0.5);
            int start5_y2=(int)(dim.height*0.2);

            int end5_x2=(int)(dim.width*0.5);
            int end5_y2=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts52=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts52.press(PointOption.point(start5_x2,start5_y2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x2,end5_y2)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }
        System.out.println("<<<<<<<<<<<<<<<<<After App Stoping We Are Now Back On Home Screen");


                                ///////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>>>Uninstall App");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Home Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(3500);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(1500);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try For Scrolling");
            Thread.sleep(2000);

            int start5_x2=(int)(dim.width*0.5);
            int start5_y2=(int)(dim.height*0.2);

            int end5_x2=(int)(dim.width*0.5);
            int end5_y2=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts52=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts52.press(PointOption.point(start5_x2,start5_y2)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x2,end5_y2)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }
        Thread.sleep(1500);
        System.out.println("<<<<<<<<<<<<<<<<<<After uninstalling We Are Now On To Home Screen");


                                ///////////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>>>App Info");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Home Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("<<<<<<<<<<<<<<<<<After App Details We Are Now To Home Screen");


                                //////////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>>>>>>>Searched In App");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.Button")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Home Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/search_apps_edittext"));
        Thread.sleep(3000);
        code.sendKeys("AI Quran");
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("<<<<<<<<<<<<<<<<<<<After Search We Are On To Home Screen");
        Thread.sleep(5000);

    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 7)
    public void ApkTestNG() throws InterruptedException {

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<< APKs Folder Test Cases >>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
/*
        System.out.println(">>>>>>> Opening APKs Files For Installation >>>>>>>");
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

        Thread.sleep(2500);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        try {
            System.out.println(">>>>>>>>> We are In Try To Check Scrooling");
            Thread.sleep(2000);

            int start5_x1=(int)(dim.width*0.5);
            int start5_y1=(int)(dim.height*0.2);

            int end5_x1=(int)(dim.width*0.5);
            int end5_y1=(int)(dim.height*0.8);
            @SuppressWarnings("rawtypes")
            TouchAction ts51=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts51.press(PointOption.point(start5_x1,start5_y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end5_x1,end5_y1)).release().perform();

            Thread.sleep(2000);
            System.out.println("Try End");
        }
        catch (Exception a){
            System.out.println("No Need Of Scroller");
        }

        System.out.println("<<<<<<<< After Installing App We Are Know On To Home Screen <<<<<<<<<");

*/
                                            /////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>>>>  Add To Favorite and Then UnFavorite APKs Files");
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("<<<<<<  Favorite Done");

        System.out.println(">>>>>>>>>>  Know Checking Is File Present In Favorite Folder Or Not");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }

//        File file = new File("path/to/file");
//        boolean fileExists = file.exists();
//        Assert.assertTrue(fileExists, "File not found in folder");


        File folder = new File(String.valueOf(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout")));
        String[] files = folder.list();
        boolean fileFound = false;
        label:
        for (String file : files)
            if (file.equals("zzz1.apk")) {
                fileFound = true;
                break label;
            }
        Assert.assertTrue(fileFound, "File not found in folder");


        try{
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
            driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
            Thread.sleep(2500);
            try {
                System.out.println("We are in a Try to check Open App AD");
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                System.out.println(">>>> Open App Ad cross successfully");

            } catch (Exception e) {
                System.out.println(">>>> Ad cross failed");
            }
        }
        catch (Exception e){
            System.out.println("Ok");
        }


        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("<<<<<<  File Present In Favorite Folder and Know UnFavorite It");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();

        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(3500);

        System.out.println(">>>>>>>>  Check Again Is File Remove From Favorite Or Not");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("<<<<<<  After Favorite And Unfavorite We Are Know On To Home Screen");


                                        ////////////////////////////////////////////////////////////////////////////


        System.out.println("*****************  Rename Any File And Check Its Details  *********************");
        System.out.println(">>>>>>>  Firstly Rename");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);

        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));
        Thread.sleep(3000);

        Random random= new Random();
        random.setSeed(123456789);

        code.sendKeys(random.toString());
        System.out.println(random);
        Thread.sleep(3000);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(3500);
        System.out.println("<<<<<<  Rename Done  <<<<<<");

        System.out.println(">>>>>>>>>>>>  Know Checking Details Of Rename File");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("<<<<<<  Details Checked  <<<<<<<");

        System.out.println("<<<<<<<<<<<<<<<  After Rename And Details Check We Are Know On To Home Screen  <<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


                                    //////////////////////////////////////////////////////////////////////////////////

        System.out.println(">>>>>>>>>>  Delete APKs Files And Then Recycle It");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        System.out.println("<<<<<<<<  After Delete APKs Files  <<<<<<<<<<");

        System.out.println(">>>>>>>>>>>  Know Recycle It ");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("<<<<<<<<<<  Recycle Successfully  <<<<<<<<<<<<");

        System.out.println(">>>>>>>>  Know Is File Back To Its Location");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("<<<<<<<<  After Delete File And Then Recycle It Know On To Home Screen  <<<<<<<<<<<<");


                                    //////////////////////////////////////////////////////////////////////////////////


        System.out.println(">>>>>>>>  Share APKs Files On To Gmail");
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {
            System.out.println("We are in a Try to check Open App AD AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("<<<<<<<<<  After Share APKs Files To Gmail Know We Are On To Home Screen  <<<<<<<<<<<<");
        Thread.sleep(4500);


    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 8)
    public void NewFilesTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> New Files <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("Opening First Two Files");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Thread.sleep(500);
        try {
            System.out.println("We are in a Try to check Interstitial AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Interstitial Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        Thread.sleep(2500);
        try {
            System.out.println("We are in a Try to check Open App AD");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(">>>> Open App Ad cross successfully");

        } catch (Exception e) {
            System.out.println(">>>> Ad cross failed");
        }
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

        Thread.sleep(2000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.8);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        Thread.sleep(2000);

        driver.navigate().back();

        System.out.println("Simple Files Opening End");


                                    ////////////////////////////////////////////////////////////////////////////////


        System.out.println("New File Rename , Favorite , UnFavorite and Details Check");

        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        System.out.println("Firslt Rename");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);

        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));

        Random random= new Random();
        random.setSeed(123456789);

        code.sendKeys(random.toString());

        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        System.out.println("Rename Done");

        System.out.println("Know Checking Details Of Rename File");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        Thread.sleep(2500);
        System.out.println("Details Done");

        System.out.println("Add To Favorite And UnFavorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[1]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(500);
        driver.navigate().back();
        System.out.println("Favorite And UnFavorite Done");


                                /////////////////////////////////////////////////////////////////////////////////


        System.out.println("Know Delete New File and Recycle It");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("File Deleted");

        System.out.println("Know In Recycle Bin For restore");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("File Restored Successfully");

        System.out.println("Know Check Is File Present To Its Orignal Place Or Not");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("File Present To Its Orignal Location");


                                            //////////////////////////////////////////////////////////////////////////


        System.out.println("New File Share To Gmail");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("After Share We Are Know On To Home Screen");



    }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Test(priority = 9)
    public void DownloadsTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Downloads Folder <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println(">>>>>Download File Opening");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        Thread.sleep(4000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("File opened and closed , Know on Home Screen");


                                                ////////////////////////////////////////////////////////////////////////


        System.out.println("Know we are going to Rename and checking Details Of Files");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(3000);

        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/rename_edittext"));

        Random random= new Random();
        random.setSeed(123456789);

        Thread.sleep(2500);
        code.sendKeys(random.toString());
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);

        System.out.println("Know Checking Details");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(3500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(3500,TimeUnit.SECONDS);
        driver.navigate().back();
        Thread.sleep(800);

        System.out.println("Details Cheched And We Are On To Home Screen");
        Thread.sleep(1000);


                                                ///////////////////////////////////////////////////////////////////////


        System.out.println("Adding File To Favorite And Un Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(3000);
        System.out.println("Know UnFavorite It");
        Thread.sleep(500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(3000);

        System.out.println("Know Check Is File Remove From Favorite Or Not");
        Thread.sleep(500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(1500);
        driver.navigate().back();

        System.out.println("Favorite And Un Favorite Done");
        Thread.sleep(2500);


                                                ///////////////////////////////////////////////////////////////////////


        System.out.println("Know Deleting File From Download");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("File Delete Complete");

        System.out.println("Know Recover It From Recycle Bin");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("File Recovered ");

        System.out.println("Know Check Is File Recovered To Its Location Or Not ");
        Thread.sleep(1500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("File Present");

        driver.navigate().back();

        System.out.println("After That We Are Know On to Home Screen");
        Thread.sleep(2500);


                                                //////////////////////////////////////////////////////////////////////


        System.out.println("Know Share Download File");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(7500,TimeUnit.SECONDS);
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);

        System.out.println("After Share We Are Know On To Home Screen");
        Thread.sleep(2500);



    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 10)
    public void FTPTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> FTP Folder Opening <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< ");
        Thread.sleep(4000);
        driver. findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(3500);
        driver.navigate().back();

        System.out.println("After FTP Share We Are Back To Home Screen");
        Thread.sleep(2500);
    }


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 11)
    public void FavoriteTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Favorite Folder Opening <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(3000);
        System.out.println("No File Present In Favorite Folder");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Back To Home Screen");

////////
        System.out.println("Firstly Adding Images To Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(2500);
        System.out.println("Second File");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.ImageView[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(1500);
        driver.navigate().back();
        Thread.sleep(2000);

        System.out.println("Know Opening Favorite Folder and Remove Both Files");
        Thread.sleep(500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        System.out.println("Removing Second File");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        System.out.println("Both Images Are Removed");

////////
        System.out.println("Know Adding Video Files To Favorite");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Files Added");

        System.out.println("In Favorite Folder");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        System.out.println("Video File Removed From Favorite");

////////
        System.out.println("Know Adding Audio Files");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Audio Files Added");

        System.out.println("Know In Favorite Folder");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("After Audio Files Removing We Are Know On To Home Screen");

///////
        System.out.println("Know Adding Document Files To Favorite");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Document Files Added To Favorite");

        System.out.println("Know In Favorite");
        Thread.sleep(1000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("After Removing Document Files From Favorite , know On To Home Screen");

////////

        System.out.println("Zipped Files Adding To Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Zipped Files Added");

        System.out.println("Know Removing From Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("After Removing Zipped Files From Favorite, Know We Are On To Home Scren");

////////
        System.out.println("Know Adding APKs To Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("APKs Files Added");

        System.out.println("Opening Favorite Folder");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Files Remove From Favorite");

////////
        System.out.println("New Files Adding");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("New Files Added");

        System.out.println("Favorite Folder");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("New Files Removed From Favorite");

////////
        System.out.println("Download Files Added To Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[5]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        System.out.println("Downloaded Files Added");

        System.out.println("Opening Favorite");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);

        System.out.println("After Download Files Removed From Favorite We Are Know On To Home Screen");
        Thread.sleep(3000);

    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 12)
    public void RecycleBinTestNG() throws InterruptedException {

        System.out.println("*****************************************************  Recycle Bin Test Cases  ***************************************************");

        System.out.println(">>>>>>  Recycle Bin Start");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();

        System.out.println("File Deleted");

        System.out.println("Opening Recycle Bin");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        Thread.sleep(1500);
        driver.navigate().back();

        System.out.println("File Recovered and Know At Home Screen");
        Thread.sleep(2500);

    }


 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 13)
    public void WhatsAppCleenTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> WhatsApp Cleaner <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        Thread.sleep(3000);
        System.out.println("Swipe Down");
        Thread.sleep(2000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.7);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        System.out.println("WhatsApp Cleaner Opening");
        Thread.sleep(2500);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(2500);

        System.out.println("Simple Flow Clean Complete");


//        System.out.println("Cleaner Stop During Cleaning");
//        Thread.sleep(2500);
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
//        Thread.sleep(2500);
//        driver.findElement(By.xpath("")).click();
//        Thread.sleep(2500);
//        driver.findElement(By.xpath("")).click();

        System.out.println("Swipe UP");
        Thread.sleep(4000);

        int start3_x=(int)(dim.width*0.5);
        int start3_y=(int)(dim.height*0.3);

        int end3_x=(int)(dim.width*0.5);
        int end3_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts3.press(PointOption.point(start3_x,start3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end3_x,end3_y)).release().perform();

        Thread.sleep(2500);

        System.out.println("<<<<<<< <<<<<<< <<<<< Back To Home Screen");
        Thread.sleep(2500);


    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 14)
    public void FacebookCleanTestNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Facebook Cleaner <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println("Swipe Down");
        Thread.sleep(4000);

        int start1_x=(int)(dim.width*0.5);
        int start1_y=(int)(dim.height*0.7);

        int end1_x=(int)(dim.width*0.5);
        int end1_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction ts1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end1_x,end1_y)).release().perform();

        System.out.println("Swipe Left");
        Thread.sleep(2500);

        int start2_x=(int)(dim.width*0.1);
        int start2_y=(int)(dim.height*0.5);

        int end2_x=(int)(dim.width*0.9);
        int end2_y=(int)(dim.height*0.5);
        @SuppressWarnings("rawtypes")
        TouchAction ts2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts2.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end2_x,end2_y)).release().perform();

        System.out.println("Facebook Cleaner Opening");
        Thread.sleep(2500);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
        Thread.sleep(9000);
        System.out.println("open");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(5000);
        System.out.println("Clean");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        System.out.println("Back");
        System.out.println(">>>>>> Facebook Clean Done");
        Thread.sleep(4000);

        int start3_x=(int)(dim.width*0.5);
        int start3_y=(int)(dim.height*0.3);

        int end3_x=(int)(dim.width*0.5);
        int end3_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts3.press(PointOption.point(start3_x,start3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end3_x,end3_y)).release().perform();

        Thread.sleep(2500);

        System.out.println("<<<<<<< <<<<<<< <<<<< Back To Home Screen");
        Thread.sleep(2500);

    }


 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 15)
    public void TwiterCleanTestNg() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> TWITTER CLEANER <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("Swipe Down");
        Thread.sleep(4000);

        int start1_x=(int)(dim.width*0.5);
        int start1_y=(int)(dim.height*0.7);

        int end1_x=(int)(dim.width*0.5);
        int end1_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction ts1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end1_x,end1_y)).release().perform();

        System.out.println("Swipe Left");
        Thread.sleep(1500);

        int start2_x=(int)(dim.width*0.1);
        int start2_y=(int)(dim.height*0.5);

        int end2_x=(int)(dim.width*0.9);
        int end2_y=(int)(dim.height*0.5);
        @SuppressWarnings("rawtypes")
        TouchAction ts2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts2.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end2_x,end2_y)).release().perform();

        System.out.println("Swipe Left");
        Thread.sleep(2500);

        int start3_x=(int)(dim.width*0.1);
        int start3_y=(int)(dim.height*0.5);

        int end3_x=(int)(dim.width*0.9);
        int end3_y=(int)(dim.height*0.5);
        @SuppressWarnings("rawtypes")
        TouchAction ts3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts3.press(PointOption.point(start3_x,start3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end3_x,end3_y)).release().perform();

        System.out.println("Twitter Opening");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
        Thread.sleep(9000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(4000);

        System.out.println(">>>>>> Twitter Clean Done");
        System.out.println("Swipe UP");
        Thread.sleep(4000);

        int start4_x=(int)(dim.width*0.5);
        int start4_y=(int)(dim.height*0.3);

        int end4_x=(int)(dim.width*0.5);
        int end4_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts4=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts4.press(PointOption.point(start4_x,start4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end4_x,end4_y)).release().perform();

        Thread.sleep(2500);

        System.out.println("<<<<<<< <<<<<<< <<<<< Back To Home Screen");
        Thread.sleep(2500);




    }

 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 16)
    public void InstagramCleanTsetNG() throws InterruptedException {
        Thread.sleep(3500);
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Instagram Cleaner <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

            System.out.println("Swipe Down");
            Thread.sleep(4000);
            int start1_x=(int)(dim.width*0.5);
            int start1_y=(int)(dim.height*0.7);

            int end1_x=(int)(dim.width*0.5);
            int end1_y=(int)(dim.height*0.3);
            @SuppressWarnings("rawtypes")
            TouchAction ts1=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end1_x,end1_y)).release().perform();

            System.out.println("Swipe Right Side");
            Thread.sleep(1500);

            int start2_x=(int)(dim.width*0.9);
            int start2_y=(int)(dim.height*0.5);

            int end2_x=(int)(dim.width*0.1);
            int end2_y=(int)(dim.height*0.5);
            @SuppressWarnings("rawtypes")
            TouchAction ts2=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts2.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end2_x,end2_y)).release().perform();

            Thread.sleep(4000);

            System.out.println("Opening Instagram");

            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
            Thread.sleep(11000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
            Thread.sleep(2000);

            System.out.println(">>>>>> Instagram Clean Done");
            System.out.println("Swipe UP");
            Thread.sleep(4000);

            int start4_x=(int)(dim.width*0.5);
            int start4_y=(int)(dim.height*0.3);

            int end4_x=(int)(dim.width*0.5);
            int end4_y=(int)(dim.height*0.7);
            @SuppressWarnings("rawtypes")
            TouchAction ts4=new TouchAction(driver);
            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

            ts4.press(PointOption.point(start4_x,start4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end4_x,end4_y)).release().perform();

            Thread.sleep(2500);

            System.out.println("<<<<<<< <<<<<<< <<<<< Back To Home Screen");
             driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);



    }


 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 17)
    public void YoutubeCleanTestNG() throws InterruptedException {

        Thread.sleep(3500);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Youtube CLEANER <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        System.out.println("Swipe Down");
        Thread.sleep(4000);

        int start1_x=(int)(dim.width*0.5);
        int start1_y=(int)(dim.height*0.7);

        int end1_x=(int)(dim.width*0.5);
        int end1_y=(int)(dim.height*0.3);
        @SuppressWarnings("rawtypes")
        TouchAction ts1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end1_x,end1_y)).release().perform();

        System.out.println("Swipe Right");
        Thread.sleep(1500);

        int start2_x=(int)(dim.width*0.9);
        int start2_y=(int)(dim.height*0.5);

        int end2_x=(int)(dim.width*0.1);
        int end2_y=(int)(dim.height*0.5);
        @SuppressWarnings("rawtypes")
        TouchAction ts2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts2.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end2_x,end2_y)).release().perform();

        System.out.println("Swipe Right");
        Thread.sleep(2500);

        int start3_x=(int)(dim.width*0.9);
        int start3_y=(int)(dim.height*0.5);

        int end3_x=(int)(dim.width*0.1);
        int end3_y=(int)(dim.height*0.5);
        @SuppressWarnings("rawtypes")
        TouchAction ts3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts3.press(PointOption.point(start3_x,start3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end3_x,end3_y)).release().perform();

        System.out.println("Youtube Opening");
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[3]")).click();
        Thread.sleep(11000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(4000);

        System.out.println(">>>>>> Youtube Clean Done");
        System.out.println("Swipe UP");
        Thread.sleep(4000);

        int start4_x=(int)(dim.width*0.5);
        int start4_y=(int)(dim.height*0.3);

        int end4_x=(int)(dim.width*0.5);
        int end4_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts4=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts4.press(PointOption.point(start4_x,start4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end4_x,end4_y)).release().perform();

        Thread.sleep(2500);

        System.out.println("<<<<<<< <<<<<<< <<<<< Back To Home Screen");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);



    }

 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 18)
    public void CleanerTopTestNG() throws InterruptedException {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> Cleaner Master <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");


        System.out.println(">>>>> Memory Booster");
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[1]")).click();
        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(19500,TimeUnit.SECONDS);
        Thread.sleep(13500);

        System.out.println(">>>>> Memory Cleaner Start");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        System.out.println("<<<<<<<<<< Cleaner Closed");

//
//        System.out.println("Unused App's");
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.cardview.widget.CardView[1]/android.widget.LinearLayout/android.widget.Button")).click();
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        System.out.println("first");
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]")).click();
//        System.out.println("second");
//        driver.manage().timeouts().implicitlyWait(11000,TimeUnit.SECONDS);
//        Thread.sleep(7000);
//
//        int start_x=(int)(dim.width*0.5);
//        int start_y=(int)(dim.height*0.8);
//
//        int end_x=(int)(dim.width*0.5);
//        int end_y=(int)(dim.height*0.2);
//        @SuppressWarnings("rawtypes")
//        TouchAction ts=new TouchAction(driver);
//        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
//
//        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                .moveTo(PointOption.point(end_x,end_y)).release().perform();
//
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.manage().timeouts().implicitlyWait(8000,TimeUnit.SECONDS);
//        driver.navigate().back();

        System.out.println("Downloads Cleaner Not Going To Open");
        System.out.println("Un Used Apps Not Going To Open");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);




    }
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 19)
    public void HomeScreenSearchTsetNG() throws InterruptedException {

        System.out.println(">>>>>>>>>>>>> Searching Rendom Files In Home Screen Search");

        driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[2]")).click();
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/storageview_edittext"));
        code.sendKeys("Java");

        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);

        code.sendKeys("Zzz");
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView[1]")).click();

        Thread.sleep(4000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.2);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.8);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        Thread.sleep(2000);

        System.out.println("<<<<<<<<<<<<<< Know Back On To Home Screen");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);


    }


 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 20)
    public void DarkMode() throws InterruptedException {

        System.out.println("Dark Mode And Light Mode Changes from Setting");
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(1200,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Switch")).click();
        Thread.sleep(5500);
        System.out.println("Dark Mode Options Enable");
//        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//
//        WebElement darkModeToggle = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/darkmode_switch"));
//        boolean currentDarkModeStatus = darkModeToggle.isSelected();
//
//        // Toggle dark mode
//        darkModeToggle.click();
//
//        // Get the updated dark mode status
//        boolean updatedDarkModeStatus = darkModeToggle.isSelected();
//
//        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
//        // Verify that dark mode has been activated
//        assertNotEquals("Dark mode should be toggled", currentDarkModeStatus, updatedDarkModeStatus);
//        assertTrue("Dark mode should be activated", updatedDarkModeStatus);
//
//        System.out.println("Done");



        System.out.println("Know Again Back To Light Mode");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(1200,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.Switch")).click();
        driver.manage().timeouts().implicitlyWait(7000,TimeUnit.SECONDS);
        Thread.sleep(5500);
        System.out.println("Light Mode Again Done");

//        System.out.println("Know Is Dark Option Actually Enable Or Not");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);


    }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 21)
    public void RecycleBin() throws InterruptedException {

        Thread.sleep(2500);
        System.out.println("Recycle Bin Option ON and OF");

//        System.out.println("By Default Option ON");
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        System.out.println(" Option Default ON");

        System.out.println("Know Check Is Recycle Bin Working Correctly");
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        System.out.println("Check Recycle Bin Contain Any File");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        System.out.println("Recycle Bin Contain No File");
        Thread.sleep(2500);
        driver.navigate().back();
        Thread.sleep(2500);
        System.out.println("Know Delete Any File From New Files Folder");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[3]")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        Thread.sleep(2500);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("File Deleted ");

        System.out.println("Know Check recycle Bin");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        Thread.sleep(2500);
        driver.navigate().back();
        System.out.println("File Restored Successfully");

        System.out.println("Know Check is File Recoverd or Not");
        driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(4500,TimeUnit.SECONDS);
        System.out.println("File Present");
        Thread.sleep(2500);
        driver.navigate().back();

        System.out.println("Recycle Bin Setting Ended And Now on Home Screen");
        Thread.sleep(3000);

    }

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 22)
    public void LanguageTestNG() throws InterruptedException {

        System.out.println("****************************************************** Language Change Start *****************************************************");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);


        Thread.sleep(2000);

        int start_x=(int)(dim.width*0.5);
        int start_y=(int)(dim.height*0.7);

        int end_x=(int)(dim.width*0.5);
        int end_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction ts=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end_x,end_y)).release().perform();

        Thread.sleep(2000);

        int start1_x=(int)(dim.width*0.5);
        int start1_y=(int)(dim.height*0.8);

        int end1_x=(int)(dim.width*0.5);
        int end1_y=(int)(dim.height*0.2);
        @SuppressWarnings("rawtypes")
        TouchAction ts1=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts1.press(PointOption.point(start1_x,start1_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end1_x,end1_y)).release().perform();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        Thread.sleep(2000);


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[8]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
//        Thread.sleep(5000);


        Thread.sleep(5000);
            String Expecteddialg = "اقسام";
            String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
            Assert.assertEquals(Actualdialog, Expecteddialg);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println("******************************************* Home Screen language Change Successfully into urdu ");

                                           ////////////////////////////////////////////////////////////////////////////
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);

        System.out.println(">>>>>>> Know Change Language Urdu To Turkish");


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[6]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(5000);

        String Expecteddialg01 = "Kategoriler";
        String Actualdialog01 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog01, Expecteddialg01);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog01, Expecteddialg01);

        System.out.println("************************************************ Home Screen language Change Successfully into Turkish ");

        ////////////////////////////////////////////////////////////////////////////
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(3000);

                                         /////////////////////////////////////////////////////////////////////////

        System.out.println(">>>>>> Know Change Language Turkish To Bangali");


        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);

        Thread.sleep(2000);

        int start2_x=(int)(dim.width*0.5);
        int start2_y=(int)(dim.height*0.2);

        int end2_x=(int)(dim.width*0.5);
        int end2_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts2=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts2.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end2_x,end2_y)).release().perform();

        Thread.sleep(2000);

        int start3_x=(int)(dim.width*0.5);
        int start3_y=(int)(dim.height*0.2);

        int end3_x=(int)(dim.width*0.5);
        int end3_y=(int)(dim.height*0.7);
        @SuppressWarnings("rawtypes")
        TouchAction ts3=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts3.press(PointOption.point(start3_x,start3_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end3_x,end3_y)).release().perform();

        Thread.sleep(2000);
        int start4_x=(int)(dim.width*0.5);
        int start4_y=(int)(dim.height*0.2);

        int end4_x=(int)(dim.width*0.5);
        int end4_y=(int)(dim.height*0.8);
        @SuppressWarnings("rawtypes")
        TouchAction ts4=new TouchAction(driver);
        //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();

        ts4.press(PointOption.point(start4_x,start4_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                .moveTo(PointOption.point(end4_x,end4_y)).release().perform();

        Thread.sleep(2000);



        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);

        Thread.sleep(5000);

        String Expecteddialg02 = "বিভাগসমূহ";
        String Actualdialog02 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog02, Expecteddialg02);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog02, Expecteddialg02);

        System.out.println("************************************************* Home Screen language Change Successfully into Bengali ");

        ////////////////////////////////////////////////////////////////////////////

        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
        Thread.sleep(3000);

        /////////////////////////////////////////////////////////////////////////

        System.out.println(">>>>>> Know Change Language Bangali To English");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ListView/android.widget.CheckedTextView[5]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);

        Thread.sleep(5000);

        String Expecteddialg04 = "Categories";
        String Actualdialog04 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView")).getText();
        Assert.assertEquals(Actualdialog04, Expecteddialg04);
        Thread.sleep(2000);
        //Assert.assertEquals(Actualdialog02, Expecteddialg02);

        System.out.println("*************************************************** Home Screen language Change Successfully into English ");

        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);

    }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 23)
    public void ShareTestNG() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        System.out.println("************************************ Share Setting Start *************************************");

        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        System.out.println(">>>>> gmail icon");

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.navigate().back();
        System.out.println(">>>>>> Know Check All Things Are Present Or NOt Like TEXT,APP LINK,COMMENT etc");
        driver.manage().timeouts().implicitlyWait(9500,TimeUnit.SECONDS);
        Thread.sleep(3000);

        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<< Share Setting Ended And now On Home Screen");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

    }


    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 24)
    public void FeedbackTestNG() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("*************************************** FeedBack Setting Start *************************************");

        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[4]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[7]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        System.out.println("FeedBack Input");
        WebElement code = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/feedback_textview"));
        code.sendKeys("PAKISTAN");
        System.out.println(">>>> Enter Country name");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        System.out.println("<<<<<<<<<<<<<<<< Back From Feedback to HomeScreen");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 25)
    public void RateUSTestNG() throws InterruptedException {

        Thread.sleep(5000);
        System.out.println("*********************************************** Rate US Start **********************************************");
        System.out.println("Rate Us Over 3 Star Start>>>>>");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.View[4]")).click();
        System.out.println("We Reach On Play Store, So We Don't Have Data On , We go back");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        System.out.println("Back From Rate US To Home Screen");



        Thread.sleep(5000);
        System.out.println("************************************************  Rate Us Under 4 Stars ********************************************");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.View[3]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        System.out.println(">>>>>>Check box of Rate US");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[1]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[4]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[1]/android.widget.CheckBox[7]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.EditText")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        System.out.println("FeedBack Input");
        WebElement codee = driver.findElement(By.id("filemanager.fileexplorer.files.explorer:id/feedback_textview"));
        codee.sendKeys("PAKISTAN");
        System.out.println(">>>> Enter Country name");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.navigate().back();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.cardview.widget.CardView/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.Button")).click();
        System.out.println(">>>>>Moving over Gmail");
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")).click();
        driver.manage().timeouts().implicitlyWait(5500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();

        System.out.println("<<<<<<<<<<<<After Rate Us under 3 , Now back on to Setting");
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);


    }


    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Without Internet
    @Test(priority = 26)
    public void PrivacyPolicy() throws InterruptedException {


        Thread.sleep(5000);
        System.out.println("**********************************************  Opening Privacy Policy From Setting ***********************************************");
        driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[1]")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[7]")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        System.out.println(">>>>>>> Due to No Internet We Are Going Back To Home Page <<<<<<<<<<<<");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(500,TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
        System.out.println("<<<<<<<<<<<<<<<<<  We Are Back On To Home Screen");



    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 27)
    public void TermsOfServicesTestNG(){

        System.out.println("******************************************** Terms Of Services ***************************************");

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView[3]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/androidx.cardview.widget.CardView/android.widget.TextView[2]")).click();
        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("")).click();
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("")).click();
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
//        driver.findElement(By.xpath("")).click();

        System.out.println("<<<<<<<<  Due To No Internet We Are Know Back To Home Screen");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();

        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);

    }
 /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @AfterClass
    public void AppEnd() throws InterruptedException {

        System.out.println("*****************************************  Program End ***************************************");
        System.out.println("*****************************************   App Closed *********************************");

        driver.manage().timeouts().implicitlyWait(12000,TimeUnit.SECONDS);
        Thread.sleep(5000);

        driver.quit();

    }


}
