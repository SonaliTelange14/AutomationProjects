package com.StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02GoogleSearch {
	WebDriver driver;

	@Given("Open Google WebSite")
	public void open_google_web_site() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.println("Google is launch");

	}

	@When("Enter valid text in searchbox")
	public void enter_valid_text_in_searchbox() {
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("Indian Cricket Team");
		System.out.println("Step1");

	}

	@When("Press Enter key")
	public void press_enter_key() {
		driver.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys(Keys.RETURN);
		System.out.println("Step2");
	}

	@Then("A valid search result should display")
	public void a_valid_search_result_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Cricket"));
		System.out.println("Search is display");
	}

}
