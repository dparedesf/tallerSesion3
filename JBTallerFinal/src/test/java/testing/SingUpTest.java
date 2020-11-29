package testing;

import io.qameta.allure.*;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;
import pages.SingupModalPage;
import session.Session;

public class SingUpTest {

    MainPage mainPage= new MainPage();
    SingupModalPage singupModalPage = new SingupModalPage();

    @Before
    public void setup(){
        // ir a la pagina todoist.com
        Session.getInstance().getDriver().get("https://todoist.com/es");
    }

    @Test
    @DisplayName("Verify Signup user with new account")
    @Description("This test case is to verify that i can create an user and do the login in the same time")
    @Epic("Login")
    @Feature("Security Authetication")
    @Link("www.jira.com/SFSF3333")
    @Severity(SeverityLevel.BLOCKER)
    @Issue("SFTT888")
    public void createUserToSingup(){
        //  buenas practicas.
        //  Action **** Sobre que CONTROL **** Donde esta el Control
        //  Click on [Login] button in Login Page

        mainPage.singUpFreeLabel.click();
        singupModalPage.emailTxtBox.type("jbtallerfinal@gmail.com");
    }

    @After
    public void cleanUp(){
        Session.getInstance().closeSession();
    }
}

