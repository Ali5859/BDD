package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Before;

public class MyStepdefsTest {
    private Calculator calculator;
    private String operation;
    private int x;
    private int y;
    private double res;
    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Given("^inputs (\\d+) (\\d+) \"([^\"]*)\"$")
    public void inputsFirstSecond(int arg1, int arg2, String arg3) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        x = arg1;
        y = arg2;
        operation = arg3;
        throw new PendingException();
    }
    @When("^I do operation$")
    public void iDoOperation() {
        if (operation.equals("/")) {
            res = calculator.division(x, y);
        }
        if (operation.equals("^")) {
            res = calculator.power(x, y);
        }
    }

    @Then("^the output is (.+)$")
    public void theOutputIsResult(double arg) {
        Assert.assertEquals(arg, res, 0.001);
    }

}
