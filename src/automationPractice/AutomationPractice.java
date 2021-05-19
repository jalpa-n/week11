package automationPractice;
/*

Open url : http://automationpractice.com/index.php
        Click on Sign In
        Enter correct Email in Email field
        Enter wrong Password in Password field
        Click on Sign In button.
        Expected Result:
        Error Message “There is 1 error”

*/

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class AutomationPractice {

  WebDriver driver;

  @Before
  public void automation() {
    String baseUrl = " http://automationpractice.com/index.php";
    System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    driver = new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get(baseUrl);

  }

  @Test
  public void verifyUserGetErrorMessageWhenEnterWrongPassword() {
    driver.findElement(By.xpath("//a[@class='login']")).click();
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
    driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("A@1234567");
    driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();

  }
}

