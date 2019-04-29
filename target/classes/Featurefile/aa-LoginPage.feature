@First
Feature: Login into EWQIMS

@smoke @tags1
Scenario: Get the Page Links

Given Get the ActiveLinks Inside the page


@smoke @tags2
Scenario Outline: Login with Mulitple user

Given Enter the "<username>" and "<password>" and get the error message

Examples:
	|username|password|
	|administrator|a1|
	|administrator|admin|

@smoke @tags3
Scenario: Login with Valid user

Given Enter the username and password
