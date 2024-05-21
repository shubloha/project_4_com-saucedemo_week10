/**
 * Project-4 - ProjectName : com-saucedemo
 * BaseUrl = https://www.saucedemo.com/
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Navigate to baseUrl
 * 11. Refresh the page.
 * 12. Close the browser.
 */
package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();          //Webdriver is interface  and chromedriver is Object

        //Open the URL into Browser
        driver.get(baseUrl);

        //Maximise the Browser window
        driver.manage().window().maximize();


        //We give Implicit Wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Print the title of the page.
        String title = driver.getTitle();
        System.out.println(title);

        //Print the current url.
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);

        //Print the page source.
        String pageSource =driver.getPageSource();
        System.out.println(pageSource);

        //Enter the email to email field.
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

       // 7. Enter the password to password field.
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

                //Click on Login Button.
        driver.findElement(By.id("login-button")).click();

        //Print the current url.
        System.out.println(driver.getCurrentUrl());

        //Navigate to baseUrl
        driver.get(baseUrl);
        //Refresh the page.
        driver.navigate().refresh();

        //Close the browser.
        driver.quit();


    }
}
