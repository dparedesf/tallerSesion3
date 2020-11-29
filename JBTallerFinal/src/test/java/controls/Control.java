package controls;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class Control {

    protected WebElement control;
    protected By locator;
    protected String myName;

    public Control(By locator, String myName){
        this.locator=locator;
        this.myName=myName;
    }

    public void findControl(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }

    @Step("{0}")
    public void stepLogger(String action){}

    public void click(){
        this.stepLogger("Click on "+myName);
        this.findControl();
        this.control.click();
    }

    public void type(String value){
        this.stepLogger("Set the value :["+value+"] on "+myName);
        this.findControl();
        this.control.sendKeys(value);
    }

}
