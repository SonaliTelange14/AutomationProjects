package com.StepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.*;

public class S07RegistrationProcess {
	@Given("Launch rediff website")
	public void launch_rediff_website() {

	}

//using List
	@When("I pass the data as follows")
	public void i_pass_the_data_as_follows(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> myData = dataTable.asLists();
		for (List<String> data : myData) {
			System.out.println(data);
		}
	}

	@Then("registration process should success")
	public void registration_process_should_success() {
		System.out.println("Registration1 success");
	}

	// using Maps
	@When("I pass the following data")
	public void i_pass_the_following_data(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> myData1 = dataTable.asMaps();
		for(Map<String, String> data1:myData1)
		{
		System.out.println(data1);	
		}

	}

	@Then("Registration success")
	public void registration_success() {
		   System.out.println("Registration2 successful");
		
	}

}
