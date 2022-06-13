package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cloudComputeEnginePage {

    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"cloud-site\"]/devsite-iframe/iframe")
    private WebElement linkToFrame;

    public cloudComputeEnginePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public frameComputeEngineBetween switchToFrame(){
        driver.switchTo().frame(linkToFrame);
        return new frameComputeEngineBetween(driver);
    }


}
