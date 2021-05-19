package nopcommerce;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class nopCommerce {
    WebDriver driver;

    @Before
    public void setUp() {

        String baseUrl = "https://www.google.com/";
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);

        driver.findElement(By.xpath("//div[text()='I agree']")).click();
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("nopcommerce demo store");
        driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@class='gNO89b']")).click();
        driver.findElement(By.xpath("//a[@href='https://demo.nopcommerce.com/']//h3[text()='nopCommerce demo store']")).click();
    }
    @Test
    public void verifyUserClickOnComputerTabAndNavigateToComputerPageSuccessfully() {

        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']")).click();
    }

    @Test
    public void verifyUserClickOnElectronicsTabAndNavigateToElectronicsPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"))).click();
    }

    @Test
    public void verifyUserClickOnApparelTabAndNavigateToApparelPageSuccessfully(){

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"))).click();
    }
    @Test
    public void verifyUserClickOnDigitalDownloadsTabAndNavigateToDigitalDownloadsPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Digital downloads ']"))).click();
    }
    @Test
    public void verifyUserClickOnBooksTabAndNavigateToBooksPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"))).click();
    }
    @Test
    public void verifyUserClickOnJewelryTabAndNavigateToJewelryPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"))).click();
    }
    @Test
    public void verifyUserClickOnGiftCardsTabAndNavigateToGiftCardsPageSuccessfully() {

        driver.findElement((By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"))).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}
