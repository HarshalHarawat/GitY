$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Feature/Functionality.feature");
formatter.feature({
  "name": "Rahul Shetty Website Testing",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "login",
  "description": "",
  "keyword": "Background"
});
});