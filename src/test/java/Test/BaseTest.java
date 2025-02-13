package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



public abstract class BaseTest {
        private WebDriver driver;

    @BeforeTest
        public void setUp() {
            driver = new ChromeDriver();
            getDriver().manage().window().maximize();
            getDriver().get("https://only.digital/");
        }


        @AfterTest
        public void tearDown() {
            clearBrowserCookies(driver);
            closeWebDriver(driver);
        }


        public static void closeWebDriver(WebDriver driver) {
            if (driver != null) {
                driver.quit();
            }
        }
        public static void clearBrowserCookies(WebDriver driver) {
            driver.manage().deleteAllCookies();
        }

        protected WebDriver getDriver() {
            return driver;
        }


    }

