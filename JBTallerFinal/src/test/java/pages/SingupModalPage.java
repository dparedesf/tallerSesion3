package pages;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class SingupModalPage {

    public TextBox emailTxtBox= new TextBox(By.id("email"),"[Email] TextBox in Sign Up Modal Page");
    public Button registrarseButton= new Button(By.id("step_one_submit"),"[Sign Up] Button in Sign Up Modal Page");

    public  SingupModalPage(){}
}


