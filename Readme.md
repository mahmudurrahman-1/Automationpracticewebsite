# Automation-Practice

(automationpractice.com) website automation project with selenium java

## This project covers the following scenario:

1. http://automationpractice.com/index.php
2. Create two new accounts
3. Login with the any of the new account
4. Go to the Casual Dresses section and add a dress into the cart
5. Go to the T-shirt section > Filter the list with blue color > Add a shirt from the filter list
6. Now checkout and select the payment process ‘Payment by check’
7. Sign out from the account

**Run the above cycle for another user.**

## This project covers the following topics:

1. Java
2. Maven
3. Selenium
4. TestNG
5. Page Object Model
6. Data-Driven
7. Page Factory
8. Allure Report

## Command for run allure report

### Method 1</br>

alllure serve [abs path of allure-results]

### Method 2</br>

**Gnerating report:**</br>
allure generate ./allure-results --clean

**Display report using server:**</br>
allure open ./allure-report
