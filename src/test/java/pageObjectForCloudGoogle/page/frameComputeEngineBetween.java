package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frameComputeEngineBetween {
    private WebDriver driver;
    @FindBy(id = "myFrame")
    private WebElement linkToFrame;

    public frameComputeEngineBetween(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public frameComputeEngine switchToFrame(){
        driver.switchTo().frame(linkToFrame);
        return new frameComputeEngine(driver);
    }
}
