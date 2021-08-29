$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Features/dealsmaps.feature");
formatter.feature({
  "line": 1,
  "name": "Deals data creation",
  "description": "",
  "id": "deals-data-creation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Free CRM test login scenario",
  "description": "",
  "id": "deals-data-creation;free-crm-test-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "title on login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 7
    },
    {
      "cells": [
        "achieve.ps.1014@gmail.com",
        "Qait@1234"
      ],
      "line": 8
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "use clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on home page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Click on deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "create deal with title and description and identifier",
  "rows": [
    {
      "cells": [
        "title",
        "description",
        "identifier"
      ],
      "line": 14
    },
    {
      "cells": [
        "test",
        "hi its new",
        "test45"
      ],
      "line": 15
    },
    {
      "cells": [
        "test2",
        "hi new3",
        "test900"
      ],
      "line": 16
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsMapStepDefination.User_is_on_already_on_login_page()"
});
formatter.result({
  "duration": 20834325400,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.title_on_login_page_is_free_crm()"
});
formatter.result({
  "duration": 984813100,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.User_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 10825219300,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.use_clicks_on_login_button()"
});
formatter.result({
  "duration": 73882800,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.user_is_on_home_page()"
});
formatter.result({
  "duration": 7001300,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.click_on_deals_page()"
});
formatter.result({
  "duration": 3469253700,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.create_deal_with_title_and_description_and_identifier(DataTable)"
});
formatter.result({
  "duration": 7380617200,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefination.close_the_browser()"
});
formatter.result({
  "duration": 984909500,
  "status": "passed"
});
});