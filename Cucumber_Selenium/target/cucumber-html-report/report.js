$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario: Free CRM test login scenario"
    },
    {
      "line": 5,
      "value": "#Given User is on already on login page"
    },
    {
      "line": 6,
      "value": "#When title on login page is free crm"
    },
    {
      "line": 7,
      "value": "#Then User1 enters \"priyasaxena1492@gmail.com\""
    },
    {
      "line": 8,
      "value": "#And User enters \"Qait@1234\""
    },
    {
      "line": 9,
      "value": "#Then use clicks on login button"
    },
    {
      "line": 10,
      "value": "#And User is on home page"
    }
  ],
  "line": 13,
  "name": "Free CRM test login scenario",
  "description": "",
  "id": "login-action;free-crm-test-login-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User is on already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title on login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User1 enters \"\u003cusername\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "use clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "login-action;free-crm-test-login-scenario;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 23,
      "id": "login-action;free-crm-test-login-scenario;;1"
    },
    {
      "cells": [
        "priyasaxena1492@gmail.com",
        "Qait@1234"
      ],
      "line": 24,
      "id": "login-action;free-crm-test-login-scenario;;2"
    },
    {
      "cells": [
        "tom",
        "test123"
      ],
      "line": 25,
      "id": "login-action;free-crm-test-login-scenario;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Free CRM test login scenario",
  "description": "",
  "id": "login-action;free-crm-test-login-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User is on already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title on login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User1 enters \"priyasaxena1492@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters \"Qait@1234\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "use clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginstepDefination.User_is_on_already_on_login_page()"
});
formatter.result({
  "duration": 8183227100,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.title_on_login_page_is_free_crm()"
});
formatter.result({
  "duration": 16544100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "priyasaxena1492@gmail.com",
      "offset": 14
    }
  ],
  "location": "LoginstepDefination.user_enters_username(String)"
});
formatter.result({
  "duration": 2897243600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Qait@1234",
      "offset": 13
    }
  ],
  "location": "LoginstepDefination.user_enters_password(String)"
});
formatter.result({
  "duration": 317844801,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.use_clicks_on_login_button()"
});
formatter.result({
  "duration": 159525399,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 9151800,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Free CRM test login scenario",
  "description": "",
  "id": "login-action;free-crm-test-login-scenario;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "User is on already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "title on login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User1 enters \"tom\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "User enters \"test123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "use clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginstepDefination.User_is_on_already_on_login_page()"
});
formatter.result({
  "duration": 5344344199,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.title_on_login_page_is_free_crm()"
});
formatter.result({
  "duration": 106865900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tom",
      "offset": 14
    }
  ],
  "location": "LoginstepDefination.user_enters_username(String)"
});
formatter.result({
  "duration": 2629276800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test123",
      "offset": 13
    }
  ],
  "location": "LoginstepDefination.user_enters_password(String)"
});
formatter.result({
  "duration": 253724800,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.use_clicks_on_login_button()"
});
formatter.result({
  "duration": 159108900,
  "status": "passed"
});
formatter.match({
  "location": "LoginstepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 29613300,
  "status": "passed"
});
});