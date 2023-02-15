import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogoutScript {
    //public static void main(String[] args) {
    public static void logout() {
        System.setProperty("webdriver.chrome.driver", "D:\\IntelliJ IDEA Community Edition 2022.3.1\\projects\\OrangeHRM\\src\\main\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Create Web Element
        WebElement cmbpro = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i"));
        WebElement sellogout = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Action
        cmbpro.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        sellogout.click();

    }
}