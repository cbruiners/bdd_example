package stepDefinition;

import classes.card;
import classes.dispenser;
import classes.account;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class withdraw_ATM {
	@Given("^the account is in credit$")
	public void the_account_is_in_credit() throws Throwable {
		assertTrue(account.accountInCredit(123456));
	}

	@Given("^the card is valid$")
	public void the_card_is_valid() throws Throwable {	   
	   assertTrue(card.luhnCheck("4388576018410707"));   
	}

	@Given("^the dispenser contains cash$")
	public void the_dispenser_contains_cash() throws Throwable {
	    assertTrue(dispenser.cashAvailable(100));
	}

	@When("^the customer requests cash$")
	public void the_customer_requests_cash() throws Throwable {
		assertTrue(account.customerRequestType("Cash"));
	}

	@Then("^ensure the account is debited$")
	public void ensure_the_account_is_debited() throws Throwable {
		assertTrue(account.customerDebitAccount(200));
	}

	@Then("^ensure cash is dispensed$")
	public void ensure_cash_is_dispensed() throws Throwable {
		assertTrue(dispenser.cashDispensed(1));
	}

	@Then("^ensure the card is returned$")
	public void ensure_the_card_is_returned() throws Throwable {
		assertTrue(card.cardIsReturned(1));
	}

}
