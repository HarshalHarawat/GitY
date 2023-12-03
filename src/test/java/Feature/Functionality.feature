Feature: Rahul Shetty Website Testing

Background: login
Given Land on the Login of Webpage
Scenario Outline: Login Page

When Enter the <username> and <password>
And click on the checkboxes
And click on the Sign In Button
Then Navigated to Home Page
And click on Logout
Examples:

|	username | password |
|	rahul    | rahulshettyacademy |
| harshal  | rahulshettyacademy |

Scenario: Visit us Page

When click on the visit us page
Then Get the title of Visit us Page

@Smoke
Scenario: For Single Tag Testing
Given
When
Then

@Smoke @Important
Scenario: For Multiple.Combination of Tag Testing
Given
When
Then


