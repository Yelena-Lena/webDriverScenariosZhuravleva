package pageObjectForPastebin.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectForPastebin.page.pastebinHomePage;
import pageObjectForPastebin.page.pastebinPastePage;

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
        String pasteNameText = "how to gain dominance among developers";

        pastebinHomePage HomePage = new pastebinHomePage(driver).openPage();
        pastebinPastePage pageWithPaste = HomePage.pasteAction(pasteNameText, syntaxHighlightingText,codeText);
        Assert.assertTrue(pageWithPaste.getTitle().contains(pasteNameText), "Title doesn't contain the specified text.");
        Assert.assertTrue(pageWithPaste.getHighlightedCode().contains(syntaxHighlightingText), "Syntax  doesn't highlighted for bash.");
        Assert.assertEquals(pageWithPaste.getPasteCode(),codeText,"Code doesn't contain the paste code.");
       }

    @AfterTest(alwaysRun = true)
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }

}
