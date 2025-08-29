# E2E Magento Automation Project

This project is an end-to-end test automation framework built with Selenium (Java) to automate a checkout flow on the [Magento Demo Website](https://magento.softwaretestingboard.com/).

---

## Automated Test Scenario

The automated test covers the following checkout flow:
1. Navigate to Home Page (Precondition)
2. Search for “Shirt” product.
3. From the displayed items, click on a random product.
4. From the Displayed Product Page, select the product options like size and color (If any
options are there)
5. Click Add to Cart button.
6. From the header, click on the shopping cart icon.
7. From the displayed shopping cart modal, click on Proceed to Checkout button.
8. From the checkout page, fill in all the required fields. (The email value needs to be filled
into a random way, every time new email being filled)
9. Complete the Checkout flow.
10. From the displayed order confirmation page, print the order number displayed at the
page to your IDE console.
11. Close the browser (Post Condition)

---

## Reporting

* Extent Reports generate detailed test execution reports.
+ Screenshots are automatically captured for failing tests.
- Log4j logs provide execution details in the console and report.
