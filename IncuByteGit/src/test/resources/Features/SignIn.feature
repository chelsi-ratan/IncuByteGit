Feature: SignIn
  
  Scenario: Verify Valid credentials
    Given I am on the Launch page 
   	When I click on SignIn
   	Then I should navigate to Login page
   	When I enter 'test2409@gmail.com' and 'P@ssw0rd.1'
   	And Click on Signin
   	Then user should navigate to home page
   	And I close the browser


 Scenario Outline: Verify InValid Credentials
    Given I am on the Launch page 
   	When I click on SignIn
   	Then I should navigate to Login page
   	When I enter <email> and <password>
   	And Click on Signin
   	Then the error message should be displayed
   	And I close the browser

    Examples: 
 		  | email 							  | password 		   |
			| "ahdis@gmail.com" 		| "P@ssw0rd.1" 	 |
     	| "test2409@gmail.com"	| "abcjshdhgeu"  |
      | "ahdis@gmail.com" 		|	"abcjshdhgeu"  |
