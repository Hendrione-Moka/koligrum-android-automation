package pages;

import static drivers.AndroidDriverInit.driver;

import base.BasePageObject;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalculatorPage extends BasePageObject {

  public String getMenuTitle(){
    return getText(MobileBy.xpath("//android.view.ViewGroup[@resource-id='com.isl.simpleapp:id/toolbar']//android.widget.TextView"));
  }

  public boolean checkHamburgerBtnAppear(){
//    By locatorHamburgerBtn = MobileBy.AccessibilityId("Open navigation drawer");
//    AndroidElement btnHamburger = driver.findElement(locatorHamburgerBtn);
//    return btnHamburger.isDisplayed();
    //explicit wait
    By locatorHamburgerBtn = MobileBy.AccessibilityId("Open navigation drawer");
    WebDriverWait wait = new WebDriverWait(driver,10, 1000);
    //interface reference
    AndroidElement btnHamburger = (AndroidElement) wait.until(ExpectedConditions.presenceOfElementLocated(locatorHamburgerBtn));
    return btnHamburger.isDisplayed();
  }

}
