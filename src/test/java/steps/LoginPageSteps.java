package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

  LoginPage loginPage = new LoginPage();

  @Given("user is on login page")
  public void userIsOnLoginPage() {
    //abaikan
  }

  @When("user input username {string}")
  public void userInputUsername(String username) {
    loginPage.inputUsername(username);
  }

  @And("user input password {string}")
  public void userInputPassword(String password) {
    loginPage.inputPassword(password);
  }

  @And("user click login button")
  public void userClickLoginButton() {
    loginPage.clickLoginBtn();
  }
}
