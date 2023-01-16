package browsetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {

    public static void main(String[] args) {
        String baseurl= "https://opensource-demo.orangehrmlive.com/"; //storing base url
        System.setProperty("webdriver.edgedriver.driver","src/drivers/msedgedriver.exe"); //setting webdriver
        WebDriver driver = new EdgeDriver(); //Creating object of edge driver
        driver.get(baseurl);  //method to invoke url
        driver.manage().window().maximize();  //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //timeout session
        String title = driver.getTitle();  //Storing title
        System.out.println("Title of the page:"+title);// Printing title in console
        String url = driver.getCurrentUrl();  //Predfined method
        System.out.println("Current Url:"+url);//getting url
        String source = driver.getPageSource();  //storing source page
        System.out.println("Page source :"+source);  //printing the source page
        WebElement userNameField = driver.findElement(By.name("username"));  //storing username
        userNameField.sendKeys("Admin");//sending keys to username field
        WebElement passwordField = driver.findElement(By.name("password"));  //storing password field
        passwordField.sendKeys("admin123");  //sendkeys to password field
        driver.close(); //closing browser
    }
}
