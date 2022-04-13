package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 {

	public static WebDriver driver;

	@FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
	private WebElement coockie;

	@FindBy(xpath = "//span[text()=' Book ']")
	private WebElement book;

	@FindBy(xpath = "//span[text()='One-way flight']")
	private WebElement oneway;

	@FindBy(xpath = "(//span[@class='single-airport-picker__label-container'])[1]")
	private WebElement delhi;

	@FindBy(xpath = "(//span[@class='single-airport-picker__label-container'])[2]")
	private WebElement arrival;

	@FindBy(xpath = "(//span[@class='booker-form-field__value-label'])[2]")
	private WebElement departure;

	@FindBy(xpath = "(//span[@class='booker-form-field__label-container'])[3]")
	private WebElement cabinClass;

	@FindBy(xpath = "//button[text()=' Search ']")
	private WebElement search;

	public WebElement getBook() {
		return book;
	}

	public WebElement getOneway() {
		return oneway;
	}

	public WebElement getDelhi() {
		return delhi;
	}

	public WebElement getArrival() {
		return arrival;
	}

	public WebElement getDeparture() {
		return departure;
	}

	public WebElement getCabinClass() {
		return cabinClass;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getCoockie() {
		return coockie;
	}

	public Page1(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

}
