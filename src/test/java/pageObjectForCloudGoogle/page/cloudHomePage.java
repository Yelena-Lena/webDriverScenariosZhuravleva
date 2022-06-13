package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class cloudHomePage {
    private static final String HOMEPAGE_URL = "https://cloud.google.com/";
    private WebDriver driver;
    Duration duration = Duration.ofSeconds(10);

    @FindBy(css=".devsite-top-logo-row-middle")
    private WebElement searchLoop;
    @FindBy (xpath="//input[@name='q']")
    private WebElement inputText;

    public cloudHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public cloudHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, duration)
                .until(ExpectedConditions.urlContains(HOMEPAGE_URL));
        return new cloudHomePage(driver);
    }

    public cloudSearchPage searchAction(String searchText){
        searchLoop.click();
        inputText.sendKeys(searchText + "\n");
        return new cloudSearchPage(driver);
    }

}
