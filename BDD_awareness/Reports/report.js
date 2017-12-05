$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("withdraw_ATM.feature");
formatter.feature({
  "line": 1,
  "name": "Withdraw cash from ATM",
  "description": "As a customer,\nI want to withdraw cash from an ATM,\nso that I don’t have to wait in line at the bank.",
  "id": "withdraw-cash-from-atm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Account is in credit",
  "description": "",
  "id": "withdraw-cash-from-atm;account-is-in-credit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "the account is in credit",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "the card is valid",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the dispenser contains cash",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the customer requests cash",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "ensure the account is debited",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "ensure cash is dispensed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "ensure the card is returned",
  "keyword": "And "
});
formatter.match({
  "location": "withdraw_ATM.the_account_is_in_credit()"
});
formatter.result({
  "duration": 90008784,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.the_card_is_valid()"
});
formatter.result({
  "duration": 347338,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.the_dispenser_contains_cash()"
});
formatter.result({
  "duration": 191921,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.the_customer_requests_cash()"
});
formatter.result({
  "duration": 29782,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.ensure_the_account_is_debited()"
});
formatter.result({
  "duration": 23224,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.ensure_cash_is_dispensed()"
});
formatter.result({
  "duration": 19267,
  "status": "passed"
});
formatter.match({
  "location": "withdraw_ATM.ensure_the_card_is_returned()"
});
formatter.result({
  "duration": 28875,
  "status": "passed"
});
});