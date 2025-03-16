package com.StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S04PracticeLogin {
	WebDriver driver;

	@Given("Open Practice Login page website")
	public void open_practice_login_page_website() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("Enter valid username as {string}")
	public void enter_valid_username_as(String username1) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username1);

	}

	@When("Enter valid password as {string}")
	public void enter_valid_password_as(String password1) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password1);

	}

	@When("Click on submit button")
	public void click_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

	@Then("Login successful and Homepage display")
	public void login_successful_and_homepage_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("logged-in-successfully"));

	}

	// Invalid data

	@When("Enter invalid username as {string}")
	public void enter_invalid_username_as(String username) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);

	}

	@When("Enter invalid password as {string}")
	public void enter_invalid_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

	}

	@When("Clicked on submit button")
	public void clicked_on_submit_button() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();

	}

	@Then("Error message display")
	public void error_message_display() {
		System.out.println(driver.findElement(By.xpath("//div[@id='error']")).getText());

	}

}
