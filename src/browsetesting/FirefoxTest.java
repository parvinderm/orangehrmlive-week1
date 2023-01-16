package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {

    public static void main(String[] args) {
        String baseurl = "https://opensource-demo.orangehrmlive.com/";//storing url
        System.setProperty("webdriver.firefox.driver","src/drivers/geckodriver.exe");  //setting webdriver
        WebDriver driver = new FirefoxDriver();  //Creating object of chrome web driver
        driver.get(baseurl);   //method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));   //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("The title of page :"+title);  //Printing title in console
        String url = driver.getCurrentUrl();   //Predefined methods
        System.out.println("Current Url :"+url);   //getting URL
        String source = driver.getPageSource();  //storing source page
        System.out.println("Page source :"+source);  //printing the source page
        WebElement userNameField = driver.findElement(By.name("username"));   //Storing username field
        userNameField.sendKeys("Admin");    //sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));    //storing password field
        passwordField.sendKeys("admin123");   //sendkeys to password field
        
    }
}
