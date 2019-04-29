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
  "line": 11,
  "name": "Add a Tag",
  "description": "",
  "id": "folder-tags;add-a-tag;;2",
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
      "line": 4,
      "name": "@tags101"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click on Add button in Folder tags",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Send data in Folder Tag grid \"Tag A\" and save",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MasterFolderTagsVerify.Click_on_Add_button_in_Folder_tags()"
});
formatter.result({
  "duration": 8635409974,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tag A",
      "offset": 30
    }
  ],
  "location": "MasterFolderTagsVerify.Send_data_in_Folder_Tag_grid_and_save(String)"
});
formatter.result({
  "duration": 12343706343,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Add a Tag",
  "description": "",
  "id": "folder-tags;add-a-tag;;3",
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
      "line": 4,
      "name": "@tags101"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click on Add button in Folder tags",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Send data in Folder Tag grid \"Tag B\" and save",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MasterFolderTagsVerify.Click_on_Add_button_in_Folder_tags()"
});
formatter.result({
  "duration": 8558309074,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tag B",
      "offset": 30
    }
  ],
  "location": "MasterFolderTagsVerify.Send_data_in_Folder_Tag_grid_and_save(String)"
});
formatter.result({
  "duration": 11750824859,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Add a Tag",
  "description": "",
  "id": "folder-tags;add-a-tag;;4",
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
      "line": 4,
      "name": "@tags101"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "Click on Add button in Folder tags",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Send data in Folder Tag grid \"Tag C\" and save",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.match({
  "location": "MasterFolderTagsVerify.Click_on_Add_button_in_Folder_tags()"
});
formatter.result({
  "duration": 8395238997,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Tag C",
      "offset": 30
    }
  ],
  "location": "MasterFolderTagsVerify.Send_data_in_Folder_Tag_grid_and_save(String)"
});
formatter.result({
  "duration": 11800581557,
  "status": "passed"
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
  "duration": 3330506147,
  "status": "passed"
});
formatter.match({
  "location": "MasterFolderTagsVerify.Delete_the_Tag()"
});
formatter.result({
  "duration": 47211,
  "status": "passed"
});
});