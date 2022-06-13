package pageObjectForCloudGoogle.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class frameComputeEngine {
    private WebDriver driver;
    @FindBy(xpath = "//input[@id='input_85']")
    private WebElement numberOfInstances;
    @FindBy(xpath = "//md-select-value[@id='select_value_label_77']/span/div")
    private WebElement operatingSystem;
    @FindBy(xpath = "//md-option[@value='free']")
    private WebElement valueFromOperatingSystemList;
    @FindBy(id = "select_value_label_78")
    private WebElement vMClass;
    @FindBy(xpath = "//md-option[@value='regular']")
    private WebElement valueFromVMClassList;
    @FindBy(xpath = "//md-select-value[@id='select_value_label_80']/span")
    private WebElement series;
    @FindBy(id = "select_option_195")
    private WebElement valueFromSeries;
    @FindBy(xpath = "//md-select[@placeholder=\"Instance type\"]")
    private WebElement instanceTypeOnForm;
    @FindBy(id = "select_value_label_81")
    private WebElement valueFromInstanceTypeList;
    @FindBy(xpath = "//md-card-content/div/div[1]/form/div[12]/div[1]/md-input-container/md-checkbox")
    private WebElement addGPU;
    @FindBy(id = "select_451")
    private WebElement typeGPU;
    @FindBy(xpath = "//md-option[@id='select_option_456']/div")
    private WebElement valueFromTypeGPU;
    @FindBy(xpath = "=//md-select-value[@id='select_value_label_450']/span")
    private WebElement numberofGPUs;
    @FindBy(id = "select_option_462")
    private WebElement valueFromNumberOfGPUs;
    @FindBy(id = "select_519")
    private WebElement localSSDPaste;
    @FindBy(id = "select_option_195")
    private WebElement valueFromLocalSSD;
    @FindBy(id = "select_value_label_83")
    private WebElement region;
    @FindBy(xpath = "//*[@id=\"select_value_label_83\"]/span[1]/div")
    private WebElement valueFromRegion;
    @FindBy(id = "select_125")
    private WebElement committedUsage;
    @FindBy(xpath = "//*[@id=\"select_value_label_84\"]/span[1]/div")
    private WebElement valueFromCommittedUsage;
    @FindBy(xpath = "//button[@aria-label='Add to Estimate']")
    private WebElement addBtn;
    ///for asserts test 1
    @FindBy(xpath = "//*[@id=\"compute\"]/md-list/md-list-item[4]/div")
    private WebElement classVM;
    @FindBy(xpath = "//*[@id=\"compute\"]/md-list/md-list-item[5]/div[1]")
    private WebElement instanceType;
    @FindBy(xpath = "//*[@id=\"compute\"]/md-list/md-list-item[1]/div")
    private WebElement Region;
    @FindBy(xpath = "//*[@id=\"compute\"]/md-list/md-list-item[8]/div[1]")
    private WebElement localSSD;
    @FindBy(xpath = "//*[@id=\"compute\"]/md-list/md-list-item[3]/div")
    private WebElement commitmentTerm;
    @FindBy(xpath = "//*[@id=\"resultBlock\"]/md-card/md-card-content/div/div/div/h2/b")
    private WebElement cost;

    //for test 2
    @FindBy(id="email_quote")
    private WebElement emailBtn;
    @FindBy(id="input_443")
    private WebElement emailField;
    @FindBy(xpath="//*[@aria-label=\"Send Email\"]")
    private WebElement sendEmailBtn;



    public frameComputeEngine(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public frameComputeEngine enterElements(int numberOfTest) {

        numberOfInstances.sendKeys("4");
        operatingSystem.click();
        valueFromOperatingSystemList.click();
        vMClass.click();
        valueFromVMClassList.click();
        series.click();
        valueFromSeries.click();
        instanceTypeOnForm.click();
        valueFromInstanceTypeList.click();
        addGPU.click();
        typeGPU.click();
        valueFromTypeGPU.click();
        numberofGPUs.click();
        valueFromNumberOfGPUs.click();
        localSSDPaste.click();
        valueFromLocalSSD.click();
        region.click();
        valueFromRegion.click();
        committedUsage.click();
        valueFromCommittedUsage.click();
        addBtn.click();

        if(numberOfTest == 1){
            emailBtn.click();
        }
        else{
        }
        return new frameComputeEngine(driver);
    }

    public frameComputeEngine enterEmail(String loginFromEmail){
        emailField.sendKeys(loginFromEmail);
        sendEmailBtn.click();
        return new frameComputeEngine(driver);
    }

    public String getVMClass() {
        return classVM.getText();
    }

    public String getInstanceType() {
        return instanceType.getText();
    }

    public String getRegion() {
        return Region.getText();
    }

    public String getLocalSSD() {
        return localSSD.getText();
    }

    public String getCommitmentTerm() {
        return commitmentTerm.getText();
    }

    public String getCost() {
        return cost.getText();
    }
}
