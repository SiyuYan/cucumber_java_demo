$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:cucumber_demo/bigpay_website.feature");
formatter.feature({
  "name": "BigPay website",
  "description": "  Everybody wants to know BigPay related information",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Find BigPay open positions",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user open bigpay website",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumber_demo.Bigpay_website_spec.user_open_bigpay_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user go to careers tab",
  "keyword": "When "
});
formatter.match({
  "location": "cucumber_demo.Bigpay_website_spec.user_go_to_careers_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "he could find the open positions",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumber_demo.Bigpay_website_spec.he_could_find_the_open_positions()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});