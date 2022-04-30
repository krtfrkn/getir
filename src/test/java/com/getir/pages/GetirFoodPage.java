package com.getir.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class GetirFoodPage extends BasePage {

    @FindBy(xpath = "//img[@alt='GetirFood']")
    public WebElement getirFoodButton;

    @FindBy(xpath = "//a[@href='/en/food/promotions/']")
    public WebElement promotionsButton;

    @FindBy(xpath = "//span[@title='restaurants']")
    public WebElement numberOfDisplayedRestaurants;

    @FindBy(xpath = "//p[@class='style__ParagraphText-sc-__sc-1nwjacj-9 kacDxj']")
    public List<WebElement> numberOfRestaurants;

    @FindBy(xpath = "//button[.='Show more restaurants']")
    public WebElement showMoreButton;

    @FindBy(xpath = "//button[.='Go To Restaurants']")
    public WebElement goToRestaurantsButton;






}
