package Page;

import org.openqa.selenium.WebDriver;

public class PitchPage extends BehancePage {

    private static final String PITCH = "https://pitch.com/v/only-x9f8ka/c8ec614d-59c5-4d68-84a5-08aa98992ece";

    public PitchPage(WebDriver driver) {
        super(driver);
    }

    public String getCurrentUrlPitch() {
        return  PITCH;
    }
}
