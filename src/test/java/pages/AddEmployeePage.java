package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.commonMethods;

public class AddEmployeePage extends commonMethods {

    @FindBy(id="firstName")
    public WebElement firstName;

    @FindBy(id="lastName")
    public WebElement lastName;
    @FindBy(id="btnSave")
    public WebElement saveButton;
    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployeeOption;

    @FindBy(id="empsearch_employee_name_empName")
    public WebElement nameEmployeeSearch;



    public AddEmployeePage(){
        PageFactory.initElements(driver, this);

    }

}
