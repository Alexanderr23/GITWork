package steps;

import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import utils.commonMethods;

public class AddEmployeeSteps extends commonMethods {
    @When("user enters firstName , middleName and lastName")
    public void user_enters_first_name_middle_name_and_last_name() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
         Thread.sleep(2000);
        WebElement usernameTextField = driver.findElement(By.id("txtUsername"));
         usernameTextField.sendKeys("admin");
        WebElement passwordTextField = driver.findElement(By.id("txtPassword"));
          passwordTextField.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
          loginButton.click();
          Thread.sleep(2000);
Add.addEmployeeOption.click();
Add.firstName.sendKeys("Alex");
Add.lastName.sendKeys("Rodriguez");





    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
       Add.saveButton.click();
    }

}
