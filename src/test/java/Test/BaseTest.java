package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;




public abstract class BaseTest {
        private WebDriver driver;

    @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
            getDriver().manage().window().maximize();
            getDriver().get("https://only.digital/");
        }


    @AfterMethod
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

