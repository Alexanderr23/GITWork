package steps;

import pages.AddEmployeePage;
import pages.LoginPage;

public class PageINIT {
    public static LoginPage login;
public static AddEmployeePage Add;

    public static void initPageObjects(){
        login=new LoginPage();
}
}
