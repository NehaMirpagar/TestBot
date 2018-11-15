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
        "user@gmail.com",
        "test"
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
  "duration": 23169749622,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_provides_valid_credentials(DataTable)"
});
formatter.result({
  "duration": 5338868028,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 25561206,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ebot.com/TMSStaging/[?ErrorMessage\u003dIncorrect%20Username%20or%20Passwo]rd\u003e but was:\u003c...ebot.com/TMSStaging/[Home/DashBoa]rd\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat TestRunner.MyStepdefs.he_should_be_able_to_login_successfully(MyStepdefs.java:57)\r\n\tat ✽.Then he should be able to login successfully(Login.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 3474049544,
  "status": "passed"
});
});