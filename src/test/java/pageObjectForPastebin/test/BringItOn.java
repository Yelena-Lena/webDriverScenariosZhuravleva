import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectForPastebin.page.pastebinHomePage;

import java.time.Duration;
import java.util.List;

public class BringItOn {
    private WebDriver driver;


    @BeforeTest(alwaysRun = true)
    public void BrowserSetup(){
        driver = new ChromeDriver();
    }
    @Test
    public void  commonSearchTermResultsNotEmpty() throws InterruptedException {
        String codeText = "git config --global user.name  \"New Sheriff in Town\"\n" +
                "git reset $(git commit-tree HEAD^{tree} -m \"Legacy code\")\n" +
                "git push origin master --force";
        String syntaxHighlightingText = "Bash";
        String pasteExpiration = "10 Minutes";
        String pasteNameText = "how to gain dominance among developers";
        List <String> assertParametres = new pastebinHomePage(driver)
                .openPage()
                .pasteAction(codeText,pasteNameText)
                .getParameters();

        String pageTitle;
        String searchHighlightedCodeText;
        String searchPasteCodeText;

        Assert.assertTrue(pageTitle.contains(pasteNameText));
        Assert.assertTrue(searchHighlightedCodeText.contains(syntaxHighlightingText));
        Assert.assertEquals(searchPasteCodeText,codeText);

       }
    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
    private static WebElement waitForFindElement(WebDriver driver,By by) {
        Duration duration = Duration.ofSeconds(10);
        return new WebDriverWait(driver, duration)
                .until(ExpectedConditions.presenceOfElementLocated(by));
    }
}
