package pageObjectForPastebin.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import waits.CustomConditions;

import java.time.Duration;
import java.util.List;

public class pastebinHomePage {

   private static final String HOMEPAGE_URL = "https://pastebin.com";
   private WebDriver driver;
   Duration duration = Duration.ofSeconds(10);

   @FindBy (id="postform-text")
   private WebElement searchInput;
   @FindBy (id="select2-postform-format-container")
   private WebElement searchSyntaxHighlighting;
   @FindBy (xpath = "//li[contains(text(), 'Bash')]")
   private List<WebElement> valueFromHighlightingDropDownList;
   @FindBy (id = "select2-postform-expiration-container")
   private WebElement searchPasteExpiration;
   @FindBy (xpath =  "//li[contains(text(), '10 Minutes')]")
   private WebElement valueFromDropDownList;
    @FindBy (id =  "postform-name")
    private WebElement searchPasteName;
    @FindBy (xpath =  "//button[contains(text(), 'Create New Paste')]")
    private WebElement searchPasteBtn;

    public pastebinHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public pastebinHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, duration)
                .until(ExpectedConditions.urlContains(HOMEPAGE_URL));
        return new pastebinHomePage(driver);
    }

    public pastebinPastePage pasteAction(String pasteNameText, String syntaxHighlightingText, String codeText){
        searchInput.sendKeys(codeText);
        searchSyntaxHighlighting.click();
        valueFromHighlightingDropDownList.get(1).click();
        searchPasteExpiration.click();
        valueFromDropDownList.click();
        searchPasteName.sendKeys(pasteNameText);
        searchPasteBtn.click();

        new WebDriverWait(driver, duration)
                .until(ExpectedConditions.titleContains(pasteNameText));

        return new pastebinPastePage(driver);
    }

}
