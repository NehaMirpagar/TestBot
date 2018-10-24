$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Attachment.feature");
formatter.feature({
  "line": 1,
  "name": "Attachment Page",
  "description": "",
  "id": "attachment-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Add an attachment",
  "description": "",
  "id": "attachment-page;add-an-attachment",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "clicks on add attachment",
  "rows": [
    {
      "cells": [
        "Client Name",
        "Work Category",
        "Subwork Category",
        "Document Name"
      ],
      "line": 7
    },
    {
      "cells": [
        "Rewise",
        "Accounting",
        "Tax Accounting",
        "XYZ"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the new attachment should be successfully added",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_home_page()"
});
formatter.result({
  "duration": 1397330208,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("Login.feature");
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
  "duration": 30891243837,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_provides_valid_credentials(DataTable)"
});
formatter.result({
  "duration": 15640777865,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.he_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 37606691,
  "status": "passed"
});
formatter.uri("Task.feature");
formatter.feature({
  "line": 1,
  "name": "Create New Task ans assign it to team member",
  "description": "",
  "id": "create-new-task-ans-assign-it-to-team-member",
  "keyword": "Feature"
});
formatter.uri("UserPage.feature");
formatter.feature({
  "line": 1,
  "name": "CreateUser",
  "description": "",
  "id": "createuser",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Create new user",
  "description": "",
  "id": "createuser;create-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Underscore"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "creates new user",
  "rows": [
    {
      "cells": [
        "firstName",
        "middleName",
        "lastName",
        "role",
        "emailId",
        "contact",
        "dateOfBirth",
        "country",
        "state",
        "suburb",
        "dateOfJoining",
        "zipCode"
      ],
      "line": 7
    },
    {
      "cells": [
        "Calvina",
        "N",
        "M",
        "Executor",
        "cal123@gmail.com",
        "7894561245",
        "10/10/1988",
        "India",
        "Maharashtra",
        "Pune",
        "1/1/2020",
        "74185"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "new user should ne listed in the user list",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.user_is_on_home_page()"
});
formatter.result({
  "duration": 2033238,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.createsNewUser(DataTable)"
});
formatter.result({
  "duration": 20411404812,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.newUserShouldNeListedInTheUserList()"
});
formatter.result({
  "duration": 236443712,
  "status": "passed"
});
});