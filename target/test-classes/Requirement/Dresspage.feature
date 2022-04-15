Feature: Automation dress page
Scenario Outline: Verify Product Count

Given User lanuch the application
When User Click on the tab "<tab>"
Then User should see the same number of products count matching with the product header count displayed

Examples:
|tab|
|Dresses|

Scenario Outline: Verify  Add Product To Cart

Given User lanuch the application
When User Click on the tab "<tab>"
And the click on Add to cart button for the product "<product>"
Then verify the product should added to cart page
And close the cart window

Examples:

|tab|products|
|Dresses|Printed Chiffon Dress|


