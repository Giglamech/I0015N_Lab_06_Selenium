import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By; 
import org.openqa.selenium.Dimension; 


public class GoogleSearch {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:/bin/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        driver.manage().window().setSize(new Dimension(1920, 1080));


        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Software testing");
        element.submit(); 


    }
}