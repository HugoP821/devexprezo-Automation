package pages;

import net.bytebuddy.utility.RandomString;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class basepage {
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    private static Actions actions;
    static {
        System.setProperty("webdriver.gecko.driver","./src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public basepage(WebDriver driver, WebDriverWait wait){
        basepage.driver = driver;
        basepage.wait = new WebDriverWait(driver,Duration.ofSeconds(18));
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void navigateTo(String url){
        driver.manage().window().maximize();
        driver.get(url);
        System.out.print("\033[H\033[2J");
        System.err.println("Error al buscar el metodo seleccionado.");
        System.out.flush();
    }
    public static void closeBrowser(){
        driver.quit();
    }
    public static int generaNumeroRandom(int min, int max){
        return (int) (Math.random()*(max-min)) + min;
    }
    public static void listSelectRandom(WebElement locator){
        Select select = new Select(locator);
        List<WebElement> options = select.getOptions();
        Random random = new Random();
        int indiceAleatorio;
        do {
            indiceAleatorio=random.nextInt(options.size());
        }while (indiceAleatorio == 0);
        select.selectByIndex(indiceAleatorio);
    }
    public void waitForPageLoad(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }
    public void scrollDown(int pixels) {
        long viewportHeight = (Long) ((JavascriptExecutor) driver).executeScript("return window.innerHeight");
        if (pixels > viewportHeight) {
            pixels = (int) viewportHeight;
        }
        Actions actions = new Actions(driver);
        actions.moveByOffset(0, pixels).build().perform();
    }
    public void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}