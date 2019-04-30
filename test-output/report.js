$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("G:\\Selenium tools\\EWQIMSProductBDD\\src\\main\\java\\Featurefile\\ca-MasterFolderTags.feature");
formatter.feature({
  "line": 2,
  "name": "Folder Tags",
  "description": "",
  "id": "folder-tags",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@Tenth"
    }
  ]
});
formatter.scenario({
  "line": 28,
  "name": "Edit the Tag",
  "description": "",
  "id": "folder-tags;edit-the-tag;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@Tenth"
    },
    {
      "line": 20,
      "name": "@tags103"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "Click on Checkbox",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "Click on Edit button in Master Folder Tags",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Edit the text \"Tag B\"  and save it",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MasterFolderTagsVerify.Click_on_Checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});