package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser = "Chrome";
    static String baseURL="https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            driver  = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Edge")){
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }else{
            System.out.println("not valid browser");
        }
        driver.get(baseURL);  //method to invoke url
        driver.manage().window().maximize();  //maximise windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); //timeout session
        String title = driver.getTitle();   //Storing title
        System.out.println("Title of the page :"+title);  //Printing title in console
        String url = driver.getCurrentUrl(); //Predefined method
        System.out.println("current URL :"+url);  //getting url
        String source = driver.getPageSource();  //storing source page
        System.out.println("Page source :"+source);  //printing the source page
        WebElement userNameField = driver.findElement(By.name("username"));  //storing username field
        userNameField .sendKeys("Admin");   //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password")); //sending password field
        passwordField.sendKeys("admin123");   //sending keys to password field
        driver .close(); //closing closure
    }
}
