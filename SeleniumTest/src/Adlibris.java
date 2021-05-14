import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Dimension; 



public class Adlibris {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:/bin/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.adlibris.com/se");
        driver.manage().window().setSize(new Dimension(1920, 1080));

        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("Praktisk mjukvarutestning");
        element.submit(); 

        driver.findElement(By.cssSelector(".purchase__wrapper .btn--first-divider")).click();
        driver.findElement(By.cssSelector(".material-icons__shopping_cart")).click();

        WebDriverWait w = new WebDriverWait(driver,3);
        w.until(ExpectedConditions.elementToBeClickable(By.linkText("Till kassan")));

        driver.findElement(By.linkText("Till kassan")).click();


    }
}