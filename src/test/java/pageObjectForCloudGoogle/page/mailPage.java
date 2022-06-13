package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class mailPage {

    @FindBy(id="login")
    private WebElement loginMail;
    @FindBy(xpath = "//*[@id=\"refreshbut\"]/button/i")
    private WebElement toMailBtn;

    private static final String HOMEPAGE_URL = "https://yopmail.com/";
    private WebDriver driver;

    public mailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public mailPage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains(HOMEPAGE_URL));
        return new mailPage(driver);
    }

    public String getLogin() {
      String loginValue = loginMail.getAttribute("value") + "@yopmail.com";
      return loginValue;
    }

    public emailPage openEmailPage(){
        toMailBtn.click();
        return new emailPage(driver);
    }

}
