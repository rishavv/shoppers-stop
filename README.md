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

| Purchase Amount  | Discount   |
| ------------- | ------------- |
| 0-5000        | nil           |
| 5001-10000    | 10%           |
| More than 10000    | 20%           |

Discount Rates for Premium Customers 

| Purchase Amount  | Discount   |
| ------------- | ------------- |
| 0-5000        | 10%           |
| 5001-10000    | 20%           |
| More than 10000 | 30%           |

For e.g.

| **Customer Type**		|	**Purchase Amount**	|	**Bill Amount** |
| -------------------|---------------------|-----------------|
| Regular					|	5000				|	5000 |
| Regular					|	10000				|	9500 (5000 + 4500) |
| Regular					|	15000				|	5000 (5000 + 4500 + 4000) |
| Premium					|	5000				|	4500 |
| Premium					|	10000				|	8500 (4500 + 4000) |
| Premium					|	15000				|	12000 (4500 + 4000 + 3500) |


* Structure of your classes and their relationships
* Usage of appropriate data structures (collections) and algorithms
* Usage of reusable design patterns
* Flexible, Extensible, Maintainable and testable code
* For Java, testing of your program can be done using
 * main function (public static void main (String [] args) or via
 * JUnit test cases
