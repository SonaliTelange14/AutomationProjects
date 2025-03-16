package com.StepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01GoogleTitle {
	WebDriver driver;
	String title;

	@Given("Open Google")
	public void open_google() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		System.out.println("Launhing Google");

	}

	@When("Read the title")
	public void read_the_title() {

		System.out.println("Reading the title");
		title = driver.getTitle();

	}

	@Then("Title should be Google")
	public void title_should_be_google() {
		System.out.println("Verifying the title");
		if (title.equals("Google"))
			System.out.println("Test Case Pass");
		else
			System.out.println("Test Case Fail");
	}

}
