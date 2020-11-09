$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/umair.rizwan/eclipse-workspace/Selenium_BDD/src/main/java/Feature/taging.feature");
formatter.feature({
  "line": 1,
  "name": "This is for testing with tags",
  "description": "",
  "id": "this-is-for-testing-with-tags",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To verify login page",
  "description": "",
  "id": "this-is-for-testing-with-tags;to-verify-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Tags.user_is_on_login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": "To verify task page",
  "description": "",
  "id": "this-is-for-testing-with-tags;to-verify-task-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "User is on task page",
  "keyword": "Given "
});
formatter.match({
  "location": "Tags.user_is_on_task_page()"
});
formatter.result({
  "status": "skipped"
});
});