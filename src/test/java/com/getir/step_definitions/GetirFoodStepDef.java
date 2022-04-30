package com.getir.step_definitions;

import com.getir.pages.GetirFoodPage;
import com.getir.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetirFoodStepDef {

    GetirFoodPage getirFoodPage = new GetirFoodPage();
    WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
    JavascriptExecutor jse = (JavascriptExecutor) Driver.get();

    @When("the user clicks on the Getir Food button")
    public void the_user_clicks_on_the_Getir_Food_button() {
        getirFoodPage.getirFoodButton.click();
        wait.until(ExpectedConditions.titleContains("Restaurants"));
    }

    @Then("the user should be on the Getir Food page")
    public void theUserShouldBeOnTheGetirFoodPage() {
        String expectedTitle = "Restaurants | GetirFood";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @When("the user clicks on the Promotions button")
    public void theUserClicksOnThePromotionsButton() {
        getirFoodPage.promotionsButton.click();
        wait.until(ExpectedConditions.titleContains("Promotions"));
    }

    @Then("the user should be on the Getir Food Promotions page")
    public void theUserShouldBeOnTheGetirFoodPromotionsPage() {
        String expectedTitle = "Promotions | GetirFood";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }


    @When("the user clicks show more button to end")
    public void theUserClicksShowMoreButtonToEnd() {

        try {
            while (getirFoodPage.showMoreButton.isDisplayed()) {
                jse.executeScript("arguments[0].scrollIntoView(true);", getirFoodPage.showMoreButton);
                getirFoodPage.showMoreButton.click();
            }
        } catch (NoSuchElementException e) {
            System.out.println("No more restaurants to show");
        }

    }

    @Then("the user sees the given number of restaurants")
    public void theUserSeesTheGivenNumberOfRestaurants() {
        int expectedRestaurantCount = Integer.parseInt(getirFoodPage.numberOfDisplayedRestaurants.getText());
        int actualRestaurantCount = getirFoodPage.numberOfRestaurants.size()-1;
        Assert.assertEquals("Number of displayed restaurants is not as expected",expectedRestaurantCount, actualRestaurantCount);
    }


    @When("the user selects {string} promotion")
    public void theUserSelectsPromotion(String promotion) {
        Driver.get().findElement(By.xpath("//h1[.='"+promotion+"']")).click();
        getirFoodPage.goToRestaurantsButton.click();
        wait.until(ExpectedConditions.titleContains("Restaurants"));
    }

    @Then("the user should see the restaurants with the promotion")
    public void theUserShouldSeeTheRestaurantsWithThePromotion() {
        String expectedTitle = "Restaurants | GetirFood";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
}
