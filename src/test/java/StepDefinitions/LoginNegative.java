package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LoginNegative {
    DialogContent dc=new DialogContent();
    @Then("Verify failure login")
    public void verifyFailureLogin() {
        dc.waitUntilVisible(dc.verify);
        Assert.assertTrue(dc.verify.isDisplayed(),"Hata mesajı görülmedi");
    }
}
