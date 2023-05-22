package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.util.List;


public class UITestingSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to Akakce website")
    public void navigateToAkakceWebsite() {
        GWD.getDriver().get("https://www.akakce.com/");
    }

    @And("Click on the element")
    public void clickOnTheElement(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String b : buttons) {
            WebElement e = dc.getWebElement(b);
            dc.clickFunction(e);
        }
    }


    @When("Sendkeys on the element")
    public void sendkeysOnTheElement(DataTable dt) {
        List<List<String>> items = dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e = dc.getWebElement(items.get(i).get(0));
            dc.sendKeysFunction(e, items.get(i).get(1));
        }
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.waitUntilClickable(dc.hesabimIcon);
        Assert.assertTrue(dc.hesabimIcon.isDisplayed());


    }


    @And("JsClick on the element")
    public void jsclickOnTheElement(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String b : buttons) {
            WebElement e = dc.getWebElement(b);
            dc.jsClickFunction(e);
        }

    }
    String productName="";

    @And("Get the product")
    public void getTheProduct(DataTable dt) {
        List<String> buttons = dt.asList(String.class);
        for (String b : buttons) {
            WebElement e = dc.getWebElement(b);
            dc.clickFunction(e);

        }
        productName=dc.productTitle.getText();
    }
    @Then("User should added successfully on list")
    public void userShouldAddedSuccessfullyOnList() {
        boolean flag=false;
        for(WebElement e:dc.trackingList){
            if (e.getText().contains(productName)){

                flag=true;
            }
        }
        Assert.assertTrue(flag);

    }


}
