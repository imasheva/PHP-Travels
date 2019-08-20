import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ParentClassBaseUI {
    String mainUrl = "https://phptravels.org/clientarea.php";
    WebDriver driver;


    @BeforeMethod
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }



    @AfterMethod
    public void afterActions() {
        driver.quit();

    }
}
