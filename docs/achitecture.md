# System Architecture

## Overview

Java Functional Ecommerce is a console-based application designed to practice Java fundamentals, functional programming concepts, software organization, and algorithm development.

The application follows a simple layered architecture to separate responsibilities and improve maintainability.

---

## Project Structure

```text
java-functional-ecommerce/

├── src/
│   ├── app/
│   ├── menu/
│   ├── model/
│   ├── service/
│   └── util/
│
├── docs/
├── data/
├── scripts/
├── bin/
│
├── README.md
└── .gitignore
```

---

## Package Responsibilities

### app

Contains the application entry point.

Files:

* Main.java

Responsibilities:

* Start the application
* Initialize the menu system
* Control application lifecycle

---

### menu

Handles user interaction.

Files:

* Menu.java

Responsibilities:

* Display options
* Read user choices
* Redirect execution to services

---

### model

Contains business entities.

Files:

* Product.java

Responsibilities:

* Represent application data
* Store product information

Example attributes:

* id
* name
* price
* stock

---

### service

Contains business logic.

Files:

* ProductService.java
* CartService.java
* ReportService.java

Responsibilities:

* Product management
* Shopping cart operations
* Checkout process
* Report generation

---

### util

Contains utility classes.

Possible files:

* InputUtil.java
* FileUtil.java

Responsibilities:

* Input handling
* File operations
* Common helper methods

---

## Data Flow

```text
User
  |
  v
Menu
  |
  v
Service Layer
  |
  v
Model Layer
  |
  v
Output
```

Example:

```text
User selects:
Create Product

Menu
  |
  v
ProductService
  |
  v
Product
  |
  v
Stored in List<Product>
```

---

## Storage Strategy

### Initial Version

Data will be stored in memory using:

```java
List<Product>
```

Advantages:

* Simplicity
* Faster development
* Focus on Java fundamentals

---

### Future Version

Data persistence will be implemented using files:

```text
data/products.txt
data/orders.txt
```

Future improvements may include:

* CSV files
* JSON files
* Relational databases

---

## Functional Programming Usage

The project will use Java Streams and Lambda Expressions whenever appropriate.

Examples:

### Search

```java
products.stream()
        .filter(...)
        .findFirst();
```

### Reports

```java
products.stream()
        .mapToDouble(...)
        .sum();
```

### Statistics

```java
products.stream()
        .max(...);
```

Concepts to practice:

* Stream API
* Lambda Expressions
* Method References
* Optional
* Functional Operations

---

## Security Principles

The project follows basic defensive security concepts.

### Principle of Least Privilege

Recommended permissions:

Source Files:

```text
644
```

Directories:

```text
755
```

Executable Scripts:

```text
755
```

Sensitive Files:

```text
600
```

Examples of sensitive files:

* .env
* private.key
* jwt-private.key
* ssh private keys

---

## Future Architecture Evolution

Planned improvements:

1. File Persistence
2. User Authentication
3. Unit Testing
4. Docker Support
5. REST API
6. Database Integration
7. Cloud Deployment
8. CI/CD Pipeline
9. Monitoring and Logging

These improvements will be implemented gradually as the project evolves.
# Shopping Cart Architecture

## Overview

The Shopping Cart module is responsible for managing products selected by the customer before checkout.

The cart acts as an intermediary between Product Management and Checkout.

---

## Current Architecture

```text
Main Menu
    │
    ▼
Product Service
    │
    ▼
Product List
```

---

## Next Architecture

```text
Main Menu
    │
    ├── Product Management
    │
    ├── Shopping Cart
    │
    ├── Checkout
    │
    └── Reports
```

---

## Shopping Flow

```text
Product
    │
    ▼
Cart
    │
    ▼
Checkout
    │
    ▼
Reports
```

---

## Product Entity

```text
Product
│
├── id
├── name
├── price
└── stock
```

Represents a product available for sale.

---

## Cart Entity

```text
Cart
│
└── List<Product>
```

Stores products selected by the customer.

Initially, the project will use a simple implementation where products are directly added to the cart.

---

## Future Cart Structure

```text
Cart
│
└── List<CartItem>
```

```text
CartItem
│
├── Product
└── Quantity
```

This structure is more realistic and allows multiple units of the same product.

---

## Cart Operations

### Add Product

```text
User selects product ID

        │

        ▼

Find Product

        │

        ▼

Add Product To Cart
```

---

### List Cart

```text
Cart

    │

    ▼

Display Products

    │

    ▼

Display Total Value
```

---

### Remove Product

```text
User informs product ID

        │

        ▼

Find Product In Cart

        │

        ▼

Remove Product
```

---

## Checkout Flow

```text
Cart

    │

    ▼

Validate Stock

    │

    ▼

Update Inventory

    │

    ▼

Generate Order

    │

    ▼

Clear Cart
```

---

## Service Layer

```text
ProductService

    ├── createProduct()
    ├── listProducts()
    ├── findProductById()
    ├── updateProduct()
    └── deleteProduct()
```

```text
CartService

    ├── addProductToCart()
    ├── listCart()
    └── removeProductFromCart()
```

```text
CheckoutService

    └── checkout()
```

---

## Learning Goals

This module was designed to practice:

* Lists and Collections
* Object References
* Service Layer Design
* Separation of Responsibilities
* Java Methods
* CRUD Reuse
* Console-Based User Interaction
* Software Architecture Fundamentals

```
```
