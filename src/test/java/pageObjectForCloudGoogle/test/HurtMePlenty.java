package pageObjectForCloudGoogle.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectForCloudGoogle.page.*;

public class HurtMePlenty {
    private WebDriver driver;


    @BeforeTest(alwaysRun = true)
    public void BrowserSetup(){
        driver = new ChromeDriver();
    }

    @Test
    public void  commonSearchTermResultsNotEmpty() throws InterruptedException {
       String textForSearch = "Google Cloud Platform Pricing Calculator";
       String vMClass = "Regular";
       String instanceType = "n1-standard-8    (vCPUs: 8, RAM: 30 GB)";
       String localSSD = "2x375 Gb";
       String datacenterLocation = "Frankfurt (europe-west3)";
       String committedUsage = "1 Year";
       String estimatedCost = "4,024.56";

       cloudHomePage homePage = new cloudHomePage(driver);
       homePage.openPage();
       cloudSearchPage searchPage = homePage.searchAction(textForSearch);
       cloudComputeEnginePage computeEnginePage = searchPage.followLinkToCalculator();
       frameComputeEngineBetween firstFrame = computeEnginePage.switchToFrame();
       frameComputeEngine lastFrame = firstFrame.switchToFrame();
       lastFrame.enterElements(0);

       Assert.assertTrue(lastFrame.getVMClass().contains(vMClass), "VW Class is not Regular");
       Assert.assertTrue(lastFrame.getInstanceType().contains(instanceType), "InstanceType is not n1-standard-8");
       Assert.assertTrue(lastFrame.getRegion().contains(datacenterLocation), "Region is not Frankfurt");
       Assert.assertTrue(lastFrame.getLocalSSD().contains(localSSD), "LocalSSD is not 2x375 Gb");
       Assert.assertTrue(lastFrame.getCommitmentTerm().contains(committedUsage), "Committed usage is not 1 Year");

       Assert.assertTrue(lastFrame.getCost().contains(estimatedCost), "Cost is not correct");

    }

    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

}

