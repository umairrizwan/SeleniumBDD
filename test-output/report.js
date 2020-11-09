$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/umair.rizwan/eclipse-workspace/Selenium_BDD/src/main/java/Feature/dealsmap.feature");
formatter.feature({
  "line": 2,
  "name": "Deals page testing",
  "description": "",
  "id": "deals-page-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Free CRM Login Scenario",
  "description": "",
  "id": "deals-page-testing;free-crm-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "title of login page is CRM",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "umairxerox@hotmail.com",
        "Pa123456"
      ],
      "line": 11
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicked on deals link",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user lands on deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user enter deals values",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "comission"
      ],
      "line": 17
    },
    {
      "cells": [
        "test deal 1",
        "25000",
        "12000"
      ],
      "line": 18
    },
    {
      "cells": [
        "test deal 2",
        "45000",
        "11000"
      ],
      "line": 19
    },
    {
      "cells": [
        "test deal 3",
        "35000",
        "10000"
      ],
      "line": 20
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DealsMap.useralreadyonloginPage()"
});
formatter.result({
  "duration": 22831803000,
  "status": "passed"
});
formatter.match({
  "location": "DealsMap.loginPageTitle()"
});
formatter.result({
  "duration": 70719100,
  "status": "passed"
});
formatter.match({
  "location": "DealsMap.logincredentials(DataTable)"
});
formatter.result({
  "duration": 707419100,
  "status": "passed"
});
formatter.match({
  "location": "DealsMap.userclicksonLogin()"
});
formatter.result({
  "duration": 252136800,
  "status": "passed"
});
formatter.match({
  "location": "DealsMap.userclicksonDeals()"
});
formatter.result({
  "duration": 2468349900,
  "status": "passed"
});
formatter.match({
  "location": "DealsMap.getdealstitle()"
});
formatter.result({
  "duration": 3390660600,
  "error_message": "org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //button[@class\u003d\u0027ui linkedin button\u0027][contains(.,\u0027New\u0027)] (tried for 3 second(s) with 500 milliseconds interval)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027UMAIRR-A555\u0027, ip: \u0027192.168.1.197\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.8\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.75, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\UMAIR~1.RIZ\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:53275}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 0036d83134551129f56e52c0c9db61eb\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat stepDefinition.DealsMap.getdealstitle(DealsMap.java:78)\r\n\tat ✽.Then user lands on deals page(C:/Users/umair.rizwan/eclipse-workspace/Selenium_BDD/src/main/java/Feature/dealsmap.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "DealsMap.enterDeals(DataTable)"
});
formatter.result({
  "status": "skipped"
});
});