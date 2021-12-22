package steps;

import io.cucumber.java.en.When;
import pages.ListPage;

public class ListPageSteps {

  ListPage listPage = new ListPage();

  @When("user do swipe")
  public void userDoSwipe() {
    listPage.swipe();
  }

}
