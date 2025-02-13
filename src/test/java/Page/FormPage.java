package Page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FormPage extends BasePage {
    @FindBy(xpath = "//button[contains(@class,'Footer_button__RHd0Q')]")
    private WebElement closePage;

    public FormPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickClosePage() {
        Actions actions = new Actions(getDriver());
        actions.sendKeys(Keys.ESCAPE).perform();
        return new HomePage(getDriver());
    }
}
