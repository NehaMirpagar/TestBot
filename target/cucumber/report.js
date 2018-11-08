$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login valid",
  "description": "",
  "id": "login;login-valid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "he provides valid credentials",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "vaibhav.bhosale@rewiseglobal.com",
        "vaibhav123"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "he should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 31917982688,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_provides_valid_credentials(DataTable)"
});
formatter.result({
  "duration": 42257487249,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 58882908,
  "status": "passed"
});
});