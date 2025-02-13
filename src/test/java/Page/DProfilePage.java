package Page;

import org.openqa.selenium.WebDriver;

public class DProfilePage extends BasePage {

    private static final String DPROFIL = "https://dprofile.ru/only";
    public DProfilePage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrlDprofile() {
        return DPROFIL;
    }
}
