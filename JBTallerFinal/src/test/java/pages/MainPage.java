package pages;

import controls.Label;
import org.openqa.selenium.By;

public class MainPage {

    public Label singUpFreeLabel = new Label(By.xpath("//a[@href='/users/showregister']")," [SignUp] Label in Main Page");

    public MainPage(){}

}


