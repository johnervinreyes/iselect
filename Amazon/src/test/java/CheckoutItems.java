import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckoutItems {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.findElement(By.cssSelector("#nav-cart > .nav-line-2")).click();
        driver.findElement(By.name("proceedToRetailCheckout")).click();
        driver.findElement(By.id("enterAddressFullName")).click();


    }

}
