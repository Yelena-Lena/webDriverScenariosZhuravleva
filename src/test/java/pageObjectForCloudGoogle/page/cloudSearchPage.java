package pageObjectForCloudGoogle.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cloudSearchPage {
    private WebDriver driver;
    @FindBy(xpath = "//b[contains(.,'Google Cloud Platform Pricing Calculator')]")
    private WebElement linkToCalculator;

    public cloudSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public cloudComputeEnginePage followLinkToCalculator() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[contains(.,'Google Cloud Platform Pricing Calculator')]")));
        linkToCalculator.click();
        return new cloudComputeEnginePage(driver);
    }


}
