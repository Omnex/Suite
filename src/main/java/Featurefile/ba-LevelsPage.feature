@smoke @Nine
Feature: Create the levels

@tags91
Scenario Outline: Get the Default value from Level number and change the level number
Given Get the Default value and change the LevelNumber "<LevelNum>"
When Enter the data in levelname "<LevelName>"
When Enter prefix name "<Prefix>"
When Set the Documents reviewed After "<Days>"
And click on check box Allow Site Modification 
And Click on check box Allow Site Sub-levels Creation
Then save the Level

Examples:

	|LevelNum|LevelName|Prefix|Days|
	|104|test with change level|TC 3|1|
	
@tags92
Scenario Outline: Create a new Level using Default Level Number
Given Get the Default value
When Enter the datas in level name "<Level>"
When Enter the data in Prefix "<Prefix name>"
When Set the days for documents "<Document days>"
And Enable the checkbox for Allow site Modification
And Enable the checkbox for Allow Site Sub-levels Creation
Then save

Examples: 

	|Level|Prefix name|Document days|
	|test level|TL|1|

@tags93
Scenario Outline: Create a New Sub Level for Existing Level
Given Right Click on Created Level	
When Click on New Level
When Get parent Level name
When Get the Value of Level Number
And Enter Level name "<Level Name field>"
And Enter Prefix "<Prefix name field>"
And Set days to review the document "<Days for Document>"
Then save the sub Level

Examples:

	|Level Name field|Prefix name field|Days for Document|
	|test logo|TG|1|
	

@tags94
Scenario Outline: Edit the Existing level	
Given Right click on Existing level and click on edit
When Change Level number and get Default value "<Number>"
When Edit the Level name "<Edit level name>"
When Edit Prefix name "<Edit prefix>"
And Edit the Document Reviewed After "<Document Reviewed>"
And Click on save

Examples:

	|Number|Edit level name|Edit prefix|Document Reviewed|
	|301|test change|TC|0|
	
	
@tags95
Scenario Outline: Edit the Existing level with Default Level Number
Given Right Click on level and edit
When Get Default Value from level number 
When Edit the level name data "<name1>"
When Edit the Prefix data "<prefix1>"
And Edit the Document Reviewed "<Edit Doc>"
Then save the Edited level

Examples: 

	|name1|prefix1|Edit Doc|
	|Test level|TL|1|
	
@tags96
Scenario: Delete the level
Given Right click on the level and Click on delete
Then delete the level

