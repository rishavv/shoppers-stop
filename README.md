# Shoppers Stop Billing Discount App

This repo is a solution to the below problem.

It has purposefully been made independent of any external library.

Run BillingClient.java to execute tests.


**Question**

Shoppers Stop is a big retail brand and on the eve of Christmas they want to give discounts to their customers.

There are two types of Customers:
1. Regular Customers
2. Premium Customers

They have defined different discount slabs for the purchase amount

**Problem**: For a given purchase amount, you have to calculate the bill amount.

Discount Rates for Regular Customers 

**Purchase Amount** &nbsp;|&nbsp;**Discount**

0-5000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;nil

5001-10000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;10%
 
More than 10000&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;20%

Discount Rates for Premium Customers 

**Purchase Amount** &nbsp;|&nbsp;**Discount**

0-5000&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;10%

5001-10000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;20%
 
More than 10000&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;30%

For e.g.

**Customer Type**&nbsp;&nbsp;|&nbsp;**Purchase Amount**&nbsp;|&nbsp;**Bill Amount**

Regular&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;5000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;5000

Regular&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;10000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;9500 (5000 + 4500)

Regular&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;15000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;5000 (5000 + 4500 + 4000)


Premium&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;5000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;4500

Premium&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;10000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;8500 (4500 + 4000)

Premium&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;15000&nbsp;&nbsp;&nbsp;&nbsp;|&nbsp;12000 (4500 + 4000 + 3500)


* Structure of your classes and their relationships
* Usage of appropriate data structures (collections) and algorithms
* Usage of reusable design patterns
* Flexible, Extensible, Maintainable and testable code
* For Java, testing of your program can be done using
 * main function (public static void main (String [] args) or via
 * JUnit test cases
  