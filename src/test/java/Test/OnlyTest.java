package Test;

import Page.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class OnlyTest extends BaseTest {

    @Test
    public void footerBehanceTest() {
        String behanceButton = new HomePage(getDriver())
                .bigFooterLogo()
                .clickButtonCookie()
                .clickPage()
                .clickClosePage()
                .clickBehance()
                .getCurrentUrlBehance();

        Assert.assertEquals(behanceButton, "https://www.behance.net/onlydigitalagency");
    }

    @Test
    public void footerDprofileTest() {
        String dProfileButton = new HomePage(getDriver())
                .bigFooterLogo()
                .clickDprofil()
                .getCurrentUrlDprofile();

        Assert.assertEquals(dProfileButton, "https://dprofile.ru/only");
    }

    @Test
    public void footerPitchTest() {
        String pitchButton = new HomePage(getDriver())
                .bigFooterLogo()
                .clickPitch()
                .getCurrentUrlPitch();

        Assert.assertEquals(pitchButton, "https://pitch.com/v/only-x9f8ka/c8ec614d-59c5-4d68-84a5-08aa98992ece");

    }

    public OnlyTest() {
        super();
    }

}

