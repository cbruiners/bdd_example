Feature: Withdraw cash from ATM
	As a customer,
	I want to withdraw cash from an ATM,
	so that I don’t have to wait in line at the bank.
 
Scenario: Account is in credit
	Given the account is in credit
	And the card is valid
	And the dispenser contains cash
	When the customer requests cash
	Then ensure the account is debited
	And ensure cash is dispensed
	And ensure the card is returned