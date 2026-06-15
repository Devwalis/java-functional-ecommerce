# Java Functional Ecommerce

## Overview

Java Functional Ecommerce is a console-based ecommerce application developed for educational purposes.

The main goal of this project is to improve skills in:

* Java Fundamentals
* Object-Oriented Programming (OOP)
* Functional Programming Concepts
* Algorithms and Problem Solving
* Linux Command Line
* File Permissions and Security
* Git and GitHub
* Software Organization
* Clean Code Practices

This project intentionally avoids frameworks such as Spring Boot during the initial stages to provide a deeper understanding of core Java concepts.

---

## Learning Objectives

By developing this project, the developer will practice:

### Java

* Classes
* Objects
* Constructors
* Getters and Setters
* Encapsulation
* Collections API
* ArrayList
* Streams API
* Lambda Expressions
* CRUD Operations
* File Manipulation
* Exception Handling

### Linux

* File System Navigation
* File Permissions
* Directory Management
* Process Execution
* Java Compilation and Execution

### Software Development

* Project Organization
* Documentation
* Version Control
* Security Principles
* Modular Design

---

## Project Structure

```text
java-functional-ecommerce/

├── src/
│   ├── app/
│   ├── menu/
│   ├── model/
│   └── service/
│
├── docs/
│   ├── requirements.md
│   ├── architecture.md
│   └── security-requirements.md
│
├── data/
├── scripts/
├── bin/
│
├── README.md
└── .gitignore
```

---

## Main Features

### Product Management

* Create Product
* List Products
* Update Product
* Delete Product

### Cart

* Add Product
* Remove Product
* View Cart

### Checkout

* Purchase Validation
* Inventory Update

### Reports

* Inventory Statistics
* Product Analysis
* Sales Reports

---

## Linux Commands Used During Development

### Navigation

```bash
pwd
```

Show current directory.

```bash
ls
```

List files and directories.

```bash
ls -la
```

List files with permissions.

```bash
cd folder-name
```

Enter a directory.

```bash
cd ..
```

Return to the previous directory.

---

### Creating Directories

```bash
mkdir src
```

```bash
mkdir -p src/app
```

```bash
mkdir -p src/menu
```

```bash
mkdir -p src/model
```

```bash
mkdir -p src/service
```

---

### Creating Files

```bash
touch README.md
```

```bash
touch src/app/Main.java
```

```bash
touch src/model/Product.java
```

---

## Compiling the Project

From the project root directory:

```bash
javac -d bin $(find src -name "*.java")
```

Explanation:

* javac → Java Compiler
* -d bin → Output directory
* find src -name "*.java" → Find all Java files

---

## Running the Project

After compilation:

```bash
java -cp bin app.Main
```

Explanation:

* java → JVM execution
* -cp bin → Classpath
* app.Main → Entry point

---

## Linux File Permissions

This project follows the Principle of Least Privilege.

### Java Source Files

Permission:

```text
644
```

Example:

```bash
chmod 644 src/**/*.java
```

Representation:

```text
-rw-r--r--
```

---

### Directories

Permission:

```text
755
```

Example:

```bash
chmod 755 src
```

Representation:

```text
drwxr-xr-x
```

---

### Executable Scripts

Permission:

```text
755
```

Example:

```bash
chmod 755 scripts/run.sh
```

Representation:

```text
-rwxr-xr-x
```

---

### Sensitive Files

Permission:

```text
600
```

Examples:

```text
.env
private.key
jwt-private.key
id_rsa
```

Example:

```bash
chmod 600 .env
```

Representation:

```text
-rw-------
```

Only the file owner can read and modify these files.

---

## Security Concepts

This project introduces basic defensive security practices.

Topics studied:

* Principle of Least Privilege
* File Permissions
* Input Validation
* Secure Configuration Management
* Version Control Security
* Sensitive File Protection

---

## Git Workflow

Check status:

```bash
git status
```

Stage files:

```bash
git add .
```

Create commit:

```bash
git commit -m "feat: add product creation"
```

Push changes:

```bash
git push
```

---

## Current Development Stage
- [x] Project Structure
- [x] Documentation
- [x] Main Menu
- [x] Product Model
- [x] Product Creation
- [x] Product Listing
- [x] Product Search By Id
- [x] Product Update
- [x] Product Deletion

* [ ] Shopping Cart
* [ ] Checkout
* [ ] Reports
* [ ] File Persistence

---

## Educational Disclaimer

This project is intended for learning purposes.

The focus is understanding:

* Java Syntax
* Linux Fundamentals
* Software Design
* Security Concepts
* Functional and Object-Oriented Programming

before introducing enterprise frameworks and advanced architectures.

