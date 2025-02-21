package seleniumgluecode;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;
    private static int numberCase = 0;

    @Before
    public void setUp() {
        numberCase++;
        System.out.println("Se esta ejecutando el scenario Nro:" + numberCase);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.detacoop.cl/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        System.out.println("El scenario Nro:" + numberCase + " se ejecuto correctamente");
        driver.quit();
    }

    public static ChromeDriver getDriver() {
        return (ChromeDriver) driver;
    }

}
