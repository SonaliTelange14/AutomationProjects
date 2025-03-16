package com.StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;

public class S08DataDrivenTesting {
	WebDriver driver;
	JavascriptExecutor js;

	@Given("Launch ExpandTesting web page")
	public void launch_expand_testing_web_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://practice.expandtesting.com/login");
		js = (JavascriptExecutor) driver;

	}

	@When("Enter {string} and {string}")
	public void enter_and(String un, String ps) {
		js.executeScript("window.scrollBy(0, 400)", "");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);

	}

	@When("Click on submit button for Login")
	public void click_on_submit_button_for_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("Login page should be open")
	public void login_page_should_be_open() {
		System.out.println("Login successful");

		driver.close();

	}

}
