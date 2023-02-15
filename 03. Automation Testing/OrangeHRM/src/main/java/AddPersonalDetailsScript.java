import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddPersonalDetailsScript {
    //public static void main(String[] args) {
//    System.out.println("Inside APDScript");
    public static void AddPersonalDetails() {
        System.out.println("Inside Function");
        System.setProperty("webdriver.chrome.driver", "D:\\IntelliJ IDEA Community Edition 2022.3.1\\projects\\OrangeHRM\\src\\main\\java\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewPersonalDetails/empNumber/7");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        System.out.println("-----");
        //Create Web Element
//        WebElement btnmyinfo = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a"));
       // WebElement btnmyinfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
        WebElement btnmyinfo = driver.findElement(By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
//        WebElement btnmyinfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a"));
        System.out.println("btnMyInfo");
        //*[@id="app"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a
        WebElement fname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"));
        System.out.println("fname");
        WebElement mname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"));
        System.out.println("mname");
        WebElement lname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"));

        WebElement nname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
        WebElement empid = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
        WebElement othid = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
        WebElement drilicno = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));

        WebElement dtplicexpdate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));

        WebElement ssnno = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
        WebElement sinno = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"));

        Select cmbnationality = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]")));

        Select cmbmarrstatus = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[1]")));

        WebElement dtpdob = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));

        WebElement rbfemale = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"));
        WebElement milservice = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[1]/div/div[2]/input"));

        WebElement cbsmoker = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span/i"));
        WebElement btnpdsave = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[5]/button"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Action
        btnmyinfo.click();
        fname.sendKeys("Thushigha");
        mname.sendKeys("Thushi");
        lname.sendKeys("Srishantharuban");
        nname.sendKeys("Kichuma");
        empid.sendKeys("T001");
        othid.sendKeys("Thushi001");
        drilicno.sendKeys("123456789");

        dtplicexpdate.sendKeys("2023-08-28");

        ssnno.sendKeys("00112233");
        sinno.sendKeys("123");
        cmbnationality.selectByVisibleText("Sri Lankan");
        cmbmarrstatus.selectByVisibleText("Single");
        dtpdob.sendKeys("1999-08-18");

        boolean selectfe = rbfemale.isSelected();
        // performing click operation if element is not already selected
        if (selectfe == false) {
            rbfemale.click();
        }

        milservice.sendKeys("No");

        boolean isEnabled = cbsmoker.isEnabled();
        // performing click operation if element is displayed
        if (isEnabled == true) {
            cbsmoker.click();
        }
        btnpdsave.click();
    }
}