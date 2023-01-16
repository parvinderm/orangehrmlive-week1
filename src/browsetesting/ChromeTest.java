package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseurl="https://opensource-demo.orangehrmlive.com/";  //storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); //setting webdriver
        WebDriver driver = new ChromeDriver();  //Creating object of chrome driver
        driver.get(baseurl);  //method to invoke url
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
