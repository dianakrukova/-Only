package Page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy (xpath = "/html/body/div[2]/button")
    private WebElement cookie;

    @FindBy (xpath = "//div[contains(@class,'copyrightsBig FooterText_root___Rdpb')]//span[@class='line']")
    private WebElement logo;

    @FindBy (xpath = "//button[contains(@class,'Footer_button__RHd0Q')]")
    private WebElement close;

    @FindBy (css = "div[class='Socials_socialsWrap__DPtp_ Footer_socials__C39yX'] a:nth-child(1)")
    private WebElement logoBehance;

    @FindBy(css = "footer[class='Footer_root___6Q28'] a:nth-child(2) span:nth-child(1)")
    private WebElement logoDprofil;

    @FindBy(css = "div[class='Documents_documentsWrap__iNfwU Footer_documents___mRvU'] a:nth-child(2)")
    private WebElement logoPitch;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage clickButtonCookie() {
        cookie.click();
        return this;
    }

    public HomePage bigFooterLogo() {
        try {
            getWait10().until(ExpectedConditions.visibilityOf(logo));
            if (logo.isDisplayed()) {
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].scrollIntoView(true);", logo);
            } else {
                throw new RuntimeException("Элемент не найден на странице");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при прокрутке до элемента: " + e.getMessage());
        }
        return this;
    }

    public FormPage clickPage() {
        close.click();
        return new FormPage(getDriver());
    }


    public BehancePage clickBehance() {
        logoBehance.click();
        return new BehancePage(getDriver());
    }

    public DProfilePage clickDprofil() {
        logoDprofil.click();
        return new DProfilePage(getDriver());
    }

    public PitchPage clickPitch() {
        logoPitch.click();
        return new PitchPage(getDriver());
    }

}
