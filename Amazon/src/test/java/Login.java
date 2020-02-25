import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

    public static void main(String[] args){

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",projectPath+"/driver/chromedriver/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.findElement(By.cssSelector("#nav-link-accountList > .nav-line-2")).click();
        driver.findElement(By.id("ap_email")).click();
        driver.findElement(By.id("ap_email")).sendKeys("jer_bsm@yahoo.com");
        driver.findElement(By.id("ap_email")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("ap_password")).click();
        driver.findElement(By.id("ap_password")).sendKeys("123456");
        driver.findElement(By.id("ap_password")).sendKeys(Keys.ENTER);

    }
}
