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
  "line": 16,
  "name": "Delete a Tag",
  "description": "",
  "id": "folder-tags;delete-a-tag",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@tags102"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "Click on checkbox which data should be deleted",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "Delete the Tag",
  "keyword": "When "
});
formatter.match({
  "location": "MasterFolderTagsVerify.Click_on_checkbox_which_data_should_be_deleted()"
});
formatter.result({
  "duration": 3405725229,
  "status": "passed"
});
formatter.match({
  "location": "MasterFolderTagsVerify.Delete_the_Tag()"
});
formatter.result({
  "duration": 27095,
  "status": "passed"
});
});