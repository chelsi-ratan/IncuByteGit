Feature: CreateAn Account

Scenario Outline: Create a account and signin
Given I am on the Launch page
When I click on CreateAnAccount
Then I should navigate to Account creation page
When I Enter <FirstName>,<LastName>,<Email>,<Password> and <ConfirmPassword>
And click on create Account
Then user should navigate to home page
Then I logout from the website
Then I click on SignIn
Then I should navigate to Login page
When I enter <Email> and <Password>
And Click on Signin
Then user should navigate to home page
Then I close the browser

Examples:
 | FirstName | LastName |	Email						 |	Password 		 |	ConfirmPassword	|
 | "abc"		 | "def"		| "abcd12179890@gmail.com" |	"P@ssw0rd.1" | "P@ssw0rd.1" 		|

Scenario Outline: Create a account with consumed data
Given I am on the Launch page
When I click on CreateAnAccount
Then I should navigate to Account creation page
When I Enter <FirstName>,<LastName>,<Email>,<Password> and <ConfirmPassword>
And click on create Account
Then the error message should say account exsists
Then I close the browser

Examples:
 | FirstName | LastName |	Email						 |	Password 		 |	ConfirmPassword	|
 | "abc"		 | "def"		| "abcd240@gmail.com" |	"P@ssw0rd.1" | "P@ssw0rd.1" 		|
 
 Scenario Outline: Create a account with invalid password
Given I am on the Launch page
When I click on CreateAnAccount
Then I should navigate to Account creation page
When I Enter <FirstName>,<LastName>,<Email>,<Password> and <ConfirmPassword>
And click on create Account
Then the password error should display
Then I close the browser

Examples:
 | FirstName | LastName |	Email						 |	Password 		 |	ConfirmPassword	|
 | "abc"		 | "def"		| "88we3897@gmail.com" |	"chelsi" | "P@ssw0rd.1" 		|
 
 Scenario Outline: Create a account with invalid confirm password
Given I am on the Launch page
When I click on CreateAnAccount
Then I should navigate to Account creation page
When I Enter <FirstName>,<LastName>,<Email>,<Password> and <ConfirmPassword>
And click on create Account
Then the password error should display
Then I close the browser

Examples:
 | FirstName | LastName |	Email						 |	Password 		 |	ConfirmPassword	|
 | "abc"		 | "def"		| "88we3897@gmail.com" |	"P@ssw0rd.1" | "Chelsi" 		|
 
Scenario Outline: Create a account with Fresh data
Given I am on the Launch page
When I click on CreateAnAccount
Then I should navigate to Account creation page
When I Enter <FirstName>,<LastName>,<Email>,<Password> and <ConfirmPassword>
And click on create Account
Then I close the browser

Examples:
 | FirstName | LastName |	Email						 |	Password 		 |	ConfirmPassword	|
 | "abc"		 | "def"		| "abcd1218590@gmail.com" |	"P@ssw0rd.1" | "P@ssw0rd.1" 		|
