package org.namsang.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import org.namsang.FizzBuzz;

public class StepDefs {

    private FizzBuzz fizzBuzz = new FizzBuzz();
    int temp = 0;

    @When("^(\\d+)을\\(를\\) 입력하면$")
    public void inputNumber(int input) throws Throwable {
        temp = input;
    }

    @Then("^(\\d+)이\\(가\\) 출력된다$")
    public void printNumber(int output) throws Throwable {
        Assert.assertEquals(fizzBuzz.of(temp), Integer.toString(output));
    }

    @Then("^Fizz이\\(가\\) 출력된다$")
    public void printFizz() throws Throwable {
        Assert.assertEquals(fizzBuzz.of(temp), "Fizz");
    }

    @Then("^Buzz이\\(가\\) 출력된다$")
    public void printBuzz() throws Throwable {
        Assert.assertEquals(fizzBuzz.of(temp), "Buzz");
    }

    @Then("^FizzBuzz이\\(가\\) 출력된다$")
    public void fizzbuzz이_가_출력된다() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(fizzBuzz.of(temp), "FizzBuzz");
    }
}

