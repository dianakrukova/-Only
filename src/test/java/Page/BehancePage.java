package Page;

import org.openqa.selenium.WebDriver;

public class BehancePage extends BasePage {
    private static final String BEHANCE = "https://www.behance.net/onlydigitalagency";

    public BehancePage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrlBehance () {
        return BEHANCE;
    }
}
