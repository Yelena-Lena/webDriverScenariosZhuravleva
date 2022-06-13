package pageObjectForCloudGoogle.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectForCloudGoogle.page.*;

public class HardCore { private WebDriver driver;

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
        lastFrame.enterElements(1);

        mailPage homePageForMail = new mailPage(driver);
        homePageForMail.openPage();
        String login = homePageForMail.getLogin();

        lastFrame.enterEmail(login);
        emailPage costFromEmail = homePageForMail.openEmailPage();

        Assert.assertTrue(costFromEmail.getCostFromEmail().contains(estimatedCost));

    }

    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

}

