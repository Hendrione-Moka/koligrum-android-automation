package steps;

import io.cucumber.java.en.When;
import pages.SidebarMenu;

public class NavListSteps {

  public SidebarMenu sidebarMenu = new SidebarMenu();

  @When("user go to menu list")
  public void userGoToMenuList() {
    sidebarMenu.clickHamburgerBtn();
    sidebarMenu.clickListMenu();
  }

}
