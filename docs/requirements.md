# Project Requirements

## Project Overview

Java Functional Ecommerce is a console-based application developed to practice Java programming fundamentals, functional programming concepts, algorithm design, file manipulation, and software organization.

The application simulates a small ecommerce system where users can manage products, add items to a shopping cart, complete purchases, and generate reports.

---

## Functional Requirements

### Product Management

The system must allow users to:

* Create a new product
* List all products
* Search for a product by ID
* Update product information
* Delete a product

Each product must contain:

* ID
* Name
* Price
* Stock Quantity

---

### Shopping Cart

The system must allow users to:

* Add products to the cart
* Remove products from the cart
* View cart contents
* Calculate the total purchase value

The cart must validate product availability before adding items.

---

### Checkout

The system must allow users to:

* Review cart contents before purchase
* Confirm the purchase
* Update product stock after checkout
* Clear the cart after a successful purchase

---

### Reports

The system must provide reports such as:

* Total number of products
* Total inventory value
* Product with the highest price
* Product with the lowest price
* Available stock summary

Reports should be generated using Java Streams whenever possible.

---

## Non-Functional Requirements

### Programming Language

* Java 17

### Application Type

* Console Application

### Data Storage

* In-memory collections during initial development
* File-based persistence in future versions

### Version Control

* Git
* GitHub

### Coding Standards

* English naming conventions
* Meaningful method names
* Modular code organization
* Functional programming practices when appropriate

---

## Future Enhancements

The following features may be implemented in future versions:

* User authentication
* Order history
* Discount coupons
* File persistence
* Docker support
* Unit tests
* Database integration
* REST API
* Cloud deployment
