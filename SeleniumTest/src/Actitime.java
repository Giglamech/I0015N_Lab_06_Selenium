import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By; 
import org.openqa.selenium.Dimension; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Actitime {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:/bin/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,5); 

        driver.get("https://www.actitime.com/");
        driver.manage().window().setSize(new Dimension(1920, 1080));

        wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Try Free")));

        driver.findElement(By.linkText("Try Free")).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("first-name")));


        driver.findElement(By.id("first-name")).sendKeys("firstName");
        driver.findElement(By.id("last-name")).sendKeys("lastName");
        driver.findElement(By.id("email")).sendKeys("emailAdress");
        driver.findElement(By.id("company")).sendKeys("companyName");
    }
}