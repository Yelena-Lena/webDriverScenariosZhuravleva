import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HurtMePlenty {
//    private WebDriver driver;
//
//    @BeforeTest(alwaysRun = true)
//    public void BrowserSetup(){
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    public void  commonSearchTermResultsNotEmpty() throws InterruptedException {
//
//        String searchLine = "Google Cloud Platform Pricing Calculator";
//        String vmClass = "Regular";
//        String instanceType = "n1-standard-8    (vCPUs: 8, RAM: 30 GB)";
//        String localSSD = "2x375 Gb";
//        String commitmentTerm = "1 Year";
//
//        driver.get("https://cloud.google.com/");
//        WebElement searchLoop = waitForFindElement(driver, By.cssSelector(".devsite-top-logo-row-middle"));
//        searchLoop.click();
//        WebElement searchText = waitForFindElement(driver, By.xpath("//input[@name='q']"));
//        searchText.sendKeys(searchLine + "\n");
//
//        new WebDriverWait(driver, Duration.ofSeconds(10))
//                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//b[contains(.,'Google Cloud Platform Pricing Calculator')]")));
//        WebElement linkToCalculator = waitForFindElement(driver, By.xpath("//b[contains(.,'Google Cloud Platform Pricing Calculator')]"));
//        linkToCalculator.click();
//
//        driver.switchTo().frame(0);
//        WebElement NumberOfInstances = waitForFindElement(driver, By.xpath("//input[@id='input_85']"));
//        NumberOfInstances.sendKeys("4");
//
//        WebElement operatingSystem  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        operatingSystem.click();
//        WebElement valueFromOperatingSystemList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromOperatingSystemList.click();
//
//        WebElement vMClass  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        vMClass.click();
//        WebElement valueFromvMClassList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromvMClassList.click();
//
//        WebElement instanceTypeOnForm  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        instanceTypeOnForm.click();
//        WebElement valueFromInstanceTypeList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromInstanceTypeList.click();
//
//        WebElement addGPU  = waitForFindElement(driver, By.xpath("//md-card-content[@id='mainForm']/div[2]/div/md-card/md-card-content/div/div/form/div[11]/div/md-input-container/md-checkbox/div"));
//        addGPU.click();
//
//        WebElement numberOfGPU  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        numberOfGPU.click();
//        WebElement valueFromNumberOfGPUList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromNumberOfGPUList.click();
//
//        WebElement gPUType  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        gPUType.click();
//        WebElement valueFromGPUTypeList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromGPUTypeList.click();
//
//        WebElement localSSD  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        localSSD.click();
//        WebElement valueFromLocalGPUList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromLocalGPUList.click();
//
//        WebElement datacenterLocation  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        datacenterLocation.click();
//        WebElement valueFromDatacenterLocationList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromDatacenterLocationList.click();
//
//        WebElement commitedUsage  = waitForFindElement(driver, By.xpath("//*[@class='md-select-menu-container'][@id='select_container_99']"));
//        commitedUsage.click();
//        WebElement valueFromCommitedUsageList = waitForFindElement(driver,By.xpath("//md-option[@value='free']"));
//        valueFromCommitedUsageList.click();
//
//        WebElement addBtn  = waitForFindElement(driver, By.xpath("//button[@aria-label='Add to Estimate']"));
//        addBtn.click();
//    }
//
//    @AfterTest(alwaysRun = true)
//    public void browserTearDown() {
//        driver.quit();
//        driver = null;
//    }
//    private static WebElement waitForFindElement(WebDriver driver,By by) {
//        Duration duration = Duration.ofSeconds(10);
//        return new WebDriverWait(driver, duration)
//                .until(ExpectedConditions.presenceOfElementLocated(by));
//    }
}
