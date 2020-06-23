package browserStack;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Provider;

public class testNgTest {
    WebDriver driver;

        //********************* Mahmoud Shuaibi TestNG Framework ***********************************************

    @BeforeMethod
    public void setup(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();




    }
    @Test(priority = 5)
    public void testee()throws Exception{
        driver.get("https://aggrandizementsolutions.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[2]/a")).click();
        Thread.sleep(3000);


    }

    @Test(priority = 2)
    public void services()throws Exception{
        driver.get("https://aggrandizementsolutions.com/");
        driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/section[8]/div/h1/span[3]")).isDisplayed());
        Thread.sleep(3000);

    }



    @AfterMethod
    public void exit(){
        driver.quit();
    }
}
