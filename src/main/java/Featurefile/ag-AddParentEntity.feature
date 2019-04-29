@smoke @Seventh
Feature: Add the Parent Entity

@tags71
Scenario Outline: Enter data in entity path
Given Enter the data in entity field "<Entity>"
When Enter the data in Entity Short Name(Opt) "<Entity Short Name>"
And Select the data in Entity Type(Opt)
And Select the data in Business Unit(Opt)
And Select the data in Site function(Opt)
And Select the Status
And Select Is a Site	
And Enter the Address
And Enter the Contact number
And Enter the Fax (Opt) "<Fax>"
And Select the Country
And Enter the Branch Number(Opt) "<Branch>"
And Select the currency
And Select route
And Add Contact Person
And Click Primary Contact person
Then Click on save button 

Examples:
|Entity|Entity Short Name|Fax|Branch|
|Ind-Omnex| Omn|Entity|12345|

@tags72
Scenario Outline: Change the status to Inactive and Site to Yes and get the error message
Given Enter the data in Entity name "<Entity data>"
When Enter the data in Entity shortname "<Entity short>"
And Select Entity type data
And Select business Unit data
And Select site function data
And Change the status to Inactive
And Change the site to Yes 
Then click on save
Then Validate the error messsage in Entity 

Examples:
|Entity data|Entity short|
|Omnex-china|chn|