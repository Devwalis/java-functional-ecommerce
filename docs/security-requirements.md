# Security Requirements

## Overview

This project follows basic defensive security practices to promote secure software development and proper Linux system administration habits.

The goal is to understand security principles commonly used in professional environments such as ecommerce platforms, cloud applications, backend services, and enterprise systems.

---

## Principle of Least Privilege

The application follows the Principle of Least Privilege (PoLP).

Users, processes, files, and directories should receive only the permissions necessary to perform their tasks.

Benefits:

* Reduces attack surface
* Prevents accidental modifications
* Protects sensitive information
* Improves system security

Avoid:

```bash
chmod 777 file.sh
```

Recommended:

```bash
chmod 755 file.sh
```

or

```bash
chmod 600 sensitive-file
```

depending on the file purpose.

---

## File Permissions

The project adopts the following Linux permission standards.

### Source Code Files

Examples:

* Main.java
* Product.java
* ProductService.java

Permission:

```text
644
```

Representation:

```text
-rw-r--r--
```

Purpose:

* Owner can read and write
* Others can only read

---

### Directories

Examples:

* src/
* docs/
* data/

Permission:

```text
755
```

Representation:

```text
drwxr-xr-x
```

Purpose:

* Owner can manage files
* Others can access directory contents

---

### Executable Scripts

Examples:

* compile.sh
* run.sh
* backup.sh

Permission:

```text
755
```

Representation:

```text
-rwxr-xr-x
```

Purpose:

* Script execution allowed
* Controlled write access

---

### Sensitive Files

Examples:

* .env
* private.key
* jwt-private.key
* id_rsa
* credentials.txt

Permission:

```text
600
```

Representation:

```text
-rw-------
```

Purpose:

* Accessible only by the owner
* Prevent unauthorized access

---

## Input Validation

All user input must be validated before processing.

The application should verify:

* Empty values
* Invalid numbers
* Negative prices
* Negative stock quantities
* Invalid menu options

Examples:

Valid:

```text
Price: 99.90
Stock: 10
```

Invalid:

```text
Price: -99.90
Stock: -5
```

Benefits:

* Prevents unexpected behavior
* Improves data quality
* Reduces application errors

---

## Git Ignore Rules

Sensitive files must never be committed to version control.

Examples:

* Environment variables
* Secret keys
* Private certificates
* Temporary files

Recommended .gitignore entries:

```gitignore
.env
*.key
*.pem
*.secret
*.log
bin/
```

Benefits:

* Prevents credential leakage
* Protects cloud resources
* Reduces repository risks

---

## Defensive Security Concepts

The project introduces fundamental defensive security concepts.

### Authentication

Verifying user identity.

Examples:

* Username and password
* API keys
* Access tokens

---

### Authorization

Determining what a user is allowed to do.

Examples:

* Administrator permissions
* Read-only users
* Restricted operations

---

### Confidentiality

Protecting sensitive information from unauthorized access.

Examples:

* Passwords
* Customer information
* Payment data

---

### Integrity

Ensuring data remains accurate and unmodified.

Examples:

* Product prices
* Inventory quantities
* Purchase records

---

### Availability

Keeping systems accessible and operational.

Examples:

* Backup strategies
* Monitoring
* Error handling

---

## Future Security Improvements

Planned security enhancements:

* User authentication
* Password hashing
* Secure configuration management
* Logging and auditing
* Docker security practices
* Environment variable management
* Role-based access control
* Cloud security practices
* Secure deployment procedures

These practices will be gradually incorporated as the project evolves.
