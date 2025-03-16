package com.StepDefination;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class S03HRMLogin {
	WebDriver driver;

	@Given("Open HRM web application")
	public void open_hrm_web_application() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

	@When("Enter valid username and password")
	public void enter_valid_username_and_password() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");

	}

	@When("I Click on Login button")
	public void i_click_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Then("Homepage should display")
	public void homepage_should_display() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dash"));
	}

	@When("Enter invalid username and password")
	public void enter_invalid_username_and_password() {
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Archana");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("archana76123");

	}

	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

	}

	@Then("Error message should display")
	public void error_message_should_display() {
	System.out.println(driver.findElement(By.xpath("//p[text()=\"Invalid credentials\"]")).getText());	
	}

}
