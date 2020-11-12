$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/AboutUSPage.feature");
formatter.feature({
  "name": "Automating About us page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify About us icon is displayed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@AboutUS"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login to TS RTC website using valid username and password",
  "keyword": "Given "
});
formatter.match({
  "location": "VerifyLogin.login_to_TS_RTC_website_using_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to About us page",
  "keyword": "Then "
});
formatter.match({
  "location": "AboutUs.navigate_to_About_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify About us icon is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "AboutUs.verify_About_us_icon_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});