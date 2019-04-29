@smoke @Tenth
Feature: Folder Tags

@tags101
Scenario Outline: Add a Tag
Given Click on Add button in Folder tags
When Send data in Folder Tag grid "<Grid>" and save

Examples:
	|Grid|
	|Tag A|
	|Tag B|
	|Tag C|

@tags102
Scenario: Delete a Tag
Given Click on checkbox which data should be deleted
When Delete the Tag
