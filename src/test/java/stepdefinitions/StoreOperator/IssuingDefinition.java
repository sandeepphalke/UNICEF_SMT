package stepdefinitions.StoreOperator;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.CommonPage;
import pages.StoreOperator.IssuingPage;
public class IssuingDefinition {
	
	@Steps
	CommonPage cp;

	@Steps
	IssuingPage ip;
	
	@Then("Issuing data is created successfully")
	public void arrival_is_created_sucessfully(){
	    
	    cp.createdMessageDisplayed();
	}
	
	@Then("Issuing data is update successfully")
	public void arrival_is_updated_sucessfully(){
	    
	    cp.updatedMessageDisplayed();
	}
	
	@Then("Issuing data is deleted successfully")
	public void arrival_is_deleted_sucessfully(){
	    
	    cp.deletedMessageDisplayed();
	}
	
	@Then("Issuing line is created successfully")
	public void storage_data_is_created_sucessfully() {

		cp.createdMessageDisplayed();
	}
	
	@Then("Issuing line is updated successfully")
	public void arrival_line_is_updated_sucessfully() {

		cp.updatedMessageDisplayed();
	}
	
	@Then("Issuing line is deleted successfully")
	public void arrival_line_is_deleted_sucessfully() {

		cp.deletedMessageDisplayed();
	}
	
	@Then("Issuing Data is visible in issuing table to user")
	public void issuing_data_is_visible_in_issuing_table_to_user() {

		ip.validateEntryInIssuingTable();
	}

	@Then("Issuing Data is not visible in issuing table to user")
	public void arrivals_data_is_not_visible_in_stock_arrival_table_to_user() {

		ip.validateDeletedEntryInIssuingTable();
	}
	
	@Then("Issuing line Data is visible in issuing line table to user")
	public void issuing_line_data_is_visible_in_issuing_line_table_to_user() {

		ip.validateEntryInIssuingTable();
	}

	@Then("Issuing line Data is not visible in issuing line table to user")
	public void arrivals_line_data_is_not_visible_in_storage_data_table_to_user() {

		ip.validateDeletedLineEntryInIssuingTable();
	}
	
	@And("Validate issuing state is {string}")
	public void validate_arrival_state_is(String state) {

		ip.validateStateOfIssuingEntry(state);
	}
	
	@When("User edit the Issuing data")
	public void user_edit_the_issuing_data() {

		ip.editIssuingData();
	}
	
	@When("User edit the line in issuing")
	public void user_edit_the_line_in_issuing() {

		ip.editIssuingLineData();
	}
	
	@When("User delete the Issuing data")
	public void user_delete_the_arrivals_data() {

		ip.deleteIssuingData();
	}
	
	@When("User delete the line in issuing")
	public void user_delete_the_line_in_arrival() {

		ip.deleteIssuingLineData();
	}
}
