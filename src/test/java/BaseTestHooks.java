import PageObjects.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestHooks
{
    public static WebDriver driver;
    public static HomePage homePage;


    @Before
    public void Setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }


    @After
    public void teardown(Scenario Scenario)
    {
        byte[] screenShotbyte = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        Scenario.embed(screenShotbyte,"image/png");
        //driver.close();
    }

    public static String getpagetitle()
    {
       return driver.getTitle();
    }


}

