package nopcommerce;
/*
Homework – 2
        Navigate to website a[@ id = "menu_dashboard_index"]"
        Click on register link.
        Fill the all fields.
        Click on register button.
        Verify that the user register successfully.
*/

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Nopcommerce_2 {

    WebDriver driver;

    @Before

    public void navigateTONopCommerce() {

        String baseurl = "https://demo.nopcommerce.com";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();//maximeze window
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(baseurl);
    }

    @Test
    public void verifyuserClickonRegisterTabSuccessfully() {

        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        driver.findElement(By.xpath("//input[@id='gender-female']")).click();

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("jalpa");

        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("ganatra");

        driver.findElement(By.xpath("//option[@value=\"23\"]")).click();

        driver.findElement(By.xpath("//option[@value='6']")).click();

        driver.findElement(By.xpath("//option[@value='1986']")).click();

        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("Abc@gmail.com");

        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("junit Ltd");

        driver.findElement(By.xpath("//input[@type='checkbox']")).click();

        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("A@1234567");

        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("A@1234567");

        driver.findElement(By.xpath("//button[@name='register-button']")).click();

    }

    @After

    public void tearDown() {

        driver.quit();

    }
}
