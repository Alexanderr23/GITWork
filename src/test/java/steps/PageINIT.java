package steps;

import pages.LoginPage;

public class PageINIT {
    public static LoginPage login;


    public static void initPageObjects(){
        login=new LoginPage();
}
}
