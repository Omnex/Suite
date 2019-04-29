@smoke @Eight
Feature: Add New Entity

@tags81
Scenario Outline: Create a new Entity and Change the status to Inactive and site to Yes then get the error message
Given In Entity name field enter the data "<Entity name field>"
When In Entity Short name field enter the data "<Short Name field>"
And Click on Entity Type dropdown and select the data
And Click on BusinessUnit dropdown and select the data
And Click on SiteFunction dropdown and select the data
And Change the status of entity to InActive
And Change the status of site to Yes
Then save the entity
Then get the error message from entity page

Examples: 
|Entity name field|Short Name field|
|Omnex-US|US|

@tags82
Scenario Outline: Create a new Entity 
Given Enter the data in Entity name field "<Entitynamefield>"
When Enter the data in Entity short name field "<Entityshortname>"
And Select the data from Entity type
And Select the data from Business Unit
And Select the data from Site Unit
And Select the Status in Entity page
And Select Is a site in Entity page
And Enter the address in Entity page
And Enter the contact number in Entity page "<Contact number>"
And Enter the fax "<Faxdata>"
And Select the country state and city
And Enter the branch number in Entity page "<BranchNumber>"
And Select the currency in Entity page
And Select the Route in Entity page
And Add contact person for new Entity creation
And Click contact person 
Then Click on save button in new Entity creation page

Examples:
|Entitynamefield|Entityshortname|Contact number|Faxdata|BranchNumber|
|Omnex-South|south|345643|omnex|45678|

@tags83
Scenario: Verify the created Entity 
Given Click on Created Entity

@tags84
Scenario: Delete the entity
Given Click on Created entity and right Click on it
When Click on Delete 
Then Click on yes on Delete Confirmation 

