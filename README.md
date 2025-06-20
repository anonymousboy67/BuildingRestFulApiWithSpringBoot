# RESTful API with Spring Boot - Complete Beginner Guide 🚀

> **Your First Step into RESTful API Development**  
> This guide takes you from zero to building a complete User Management API using Spring Boot, designed specifically for beginners.

## 📋 Table of Contents
- [What You'll Learn](#-what-youll-learn)
- [What You'll Build](#-what-youll-build)
- [Prerequisites](#-prerequisites)
- [Quick Start](#-quick-start)
- [Project Structure](#-project-structure)
- [API Endpoints](#-api-endpoints)
- [Step-by-Step Tutorial](#-step-by-step-tutorial)
- [Testing Guide](#-testing-guide)
- [Common Issues](#-common-issues)
- [Next Steps](#-next-steps)
- [Resources](#-resources)

## 🎯 What You'll Learn

By the end of this guide, you'll understand:

### Core Concepts
- ✅ **RESTful API principles** and best practices
- ✅ **HTTP methods** (GET, POST, PUT, DELETE) and when to use them
- ✅ **HTTP status codes** (200, 201, 404, 500) and their meanings
- ✅ **JSON** data format for API communication

### Spring Boot Skills
- ✅ **Controllers** and request mapping
- ✅ **Path variables** for dynamic routes (`/users/{id}`)
- ✅ **Query parameters** for filtering (`?age=25&city=london`)
- ✅ **Request headers** extraction and usage
- ✅ **DTOs** (Data Transfer Objects) for clean data handling

### Practical Skills
- ✅ **CRUD operations** (Create, Read, Update, Delete)
- ✅ **Postman** for professional API testing
- ✅ **Error handling** and proper response codes
- ✅ **API documentation** and best practices

## 🏗️ What You'll Build

### User Management API
A complete RESTful API that manages users with the following features:

**Core Features:**
- Create new users
- Retrieve all users or specific users
- Update existing user information
- Delete users from the system
- Search users by name
- Filter users by city or age
- Pagination support

**Technical Features:**
- Proper HTTP status codes
- Clean JSON responses
- Error handling
- Request validation
- Professional API structure

## 📋 Prerequisites

### Required Knowledge
- **Basic Java** (classes, methods, objects)
- **Basic understanding** of web concepts (HTTP, JSON)
- **No prior Spring Boot experience** needed!

### Required Software
- **Java 17 or higher** - [Download here](https://www.oracle.com/java/technologies/downloads/)
- **IntelliJ IDEA** (Community Edition is free) - [Download here](https://www.jetbrains.com/idea/)
- **Postman** - [Download here](https://www.postman.com/)
- **Maven** (usually included with IDE)

### Verify Your Setup
```bash
# Check Java version
java --version

# Check Maven version (if installed separately)
mvn --version
```

## ⚡ Quick Start

### 1. Create Project
1. Go to [start.spring.io](https://start.spring.io/)
2. Configure:
   - **Project**: Maven Project
   - **Language**: Java
   - **Spring Boot**: 3.2.0
   - **Group**: `com.example`
   - **Artifact**: `user-api`
   - **Dependencies**: Spring Web, Spring Boot DevTools

3. **Generate** and download
4. Extract and open in IntelliJ IDEA

### 2. Run Your First API
```java
// src/main/java/com/example/userapi/controller/HelloController.java
@RestController
public class HelloController {
    
    @GetMapping("/hello")
    public String hello() {
        return "Hello! Your API is working! 🎉";
    }
}
```

### 3. Test It
1. **Run the application** (click the green play button)
2. **Open browser**: `http://localhost:8080/hello`
3. **See the message**: "Hello! Your API is working! 🎉"

**🎉 Congratulations! You just created your first API!**

## 📁 Project Structure

```
user-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/userapi/
│   │   │   ├── controller/          # API endpoints
│   │   │   │   ├── HelloController.java
│   │   │   │   └── UserController.java
│   │   │   ├── model/               # Data models
│   │   │   │   └── User.java
│   │   │   ├── dto/                 # Data Transfer Objects
│   │   │   │   ├── UserDTO.java
│   │   │   │   └── CreateUserRequest.java
│   │   │   └── UserApiApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/                        # Test files
├── target/                          # Compiled files
├── pom.xml                          # Maven configuration
└── README.md                        # This file
```

### Key Files Explained

| File | Purpose | What's Inside |
|------|---------|---------------|
| `UserController.java` | Handles HTTP requests | API endpoints like GET, POST, PUT, DELETE |
| `User.java` | Data model | User properties (id, name, email, age, city) |
| `UserDTO.java` | API response format | Clean data structure for responses |
| `CreateUserRequest.java` | API request format | Structure for creating new users |
| `application.properties` | Configuration | Server port, database settings, etc. |

## 🌐 API Endpoints

### Base URL
```
http://localhost:8080/api/users
```

### Endpoints Overview

| Method | Endpoint | Purpose | Status Code |
|--------|----------|---------|-------------|
| `GET` | `/api/users` | Get all users | 200 OK |
| `GET` | `/api/users/{id}` | Get user by ID | 200 OK / 404 Not Found |
| `POST` | `/api/users` | Create new user | 201 Created |
| `PUT` | `/api/users/{id}` | Update user | 200 OK / 404 Not Found |
| `DELETE` | `/api/users/{id}` | Delete user | 204 No Content / 404 Not Found |

### Advanced Endpoints

| Method | Endpoint | Purpose | Example |
|--------|----------|---------|---------|
| `GET` | `/api/users/search/{name}` | Search by name | `/api/users/search/john` |
| `GET` | `/api/users/city/{city}` | Filter by city | `/api/users/city/london` |
| `GET` | `/api/users/filter?age=25` | Filter with query params | `/api/users/filter?age=25&city=paris` |

## 📖 Step-by-Step Tutorial

### Phase 1: Foundation (Steps 1-4)
1. **Project Setup** - Create Spring Boot project
2. **First API** - Build "Hello World" endpoint
3. **Postman Setup** - Professional testing tools
4. **Data Models** - Create User class

### Phase 2: Basic CRUD (Steps 5-8)
5. **Read Operations** - GET endpoints
6. **Create Operations** - POST endpoints
7. **Update Operations** - PUT endpoints
8. **Delete Operations** - DELETE endpoints

### Phase 3: Advanced Features (Steps 9-12)
9. **Dynamic Routes** - Path variables
10. **Status Codes** - Proper HTTP responses
11. **DTOs** - Clean data structures
12. **Query Parameters** - Filtering and pagination

### Phase 4: Professional Features (Steps 13-15)
13. **Request Headers** - Extract header information
14. **Error Handling** - Proper error responses
15. **Complete Testing** - Comprehensive Postman tests

### Start Here: Follow the Complete Tutorial
👉 **[Complete Step-by-Step Guide](your-tutorial-link)**

## 🧪 Testing Guide

### Setting Up Postman

1. **Download Postman** from [postman.com](https://www.postman.com/)
2. **Create New Collection**: "User Management API"
3. **Import Environment** (optional): Set base URL as variable

### Essential Tests

#### 1. Create User (POST)
```http
POST http://localhost:8080/api/users
Content-Type: application/json

{
    "name": "John Doe",
    "email": "john@example.com",
    "age": 25,
    "city": "New York"
}
```

**Expected Response (201 Created):**
```json
{
    "id": 1,
    "name": "John Doe",
    "email": "john@example.com",
    "age": 25,
    "city": "New York"
}
```

#### 2. Get All Users (GET)
```http
GET http://localhost:8080/api/users
```

**Expected Response (200 OK):**
```json
[
    {
        "id": 1,
        "name": "John Doe",
        "email": "john@example.com",
        "age": 25,
        "city": "New York"
    }
]
```

#### 3. Get User by ID (GET)
```http
GET http://localhost:8080/api/users/1
```

#### 4. Update User (PUT)
```http
PUT http://localhost:8080/api/users/1
Content-Type: application/json

{
    "name": "John Smith",
    "email": "johnsmith@example.com",
    "age": 26,
    "city": "Los Angeles"
}
```

#### 5. Delete User (DELETE)
```http
DELETE http://localhost:8080/api/users/1
```

**Expected Response:** 204 No Content (empty body)

### Query Parameter Tests

```http
# Filter by age
GET http://localhost:8080/api/users/filter?age=25

# Filter by city
GET http://localhost:8080/api/users/filter?city=london

# Multiple filters
GET http://localhost:8080/api/users/filter?age=25&city=paris

# Pagination
GET http://localhost:8080/api/users/paginated?page=0&size=5
```

### Testing Error Scenarios

```http
# Test 404 Not Found
GET http://localhost:8080/api/users/999

# Test 400 Bad Request (invalid JSON)
POST http://localhost:8080/api/users
Content-Type: application/json

{
    "name": "John"
    // Missing comma - invalid JSON
    "email": "john@example.com"
}
```

## 🔧 Common Issues & Solutions

### Issue 1: Port Already in Use
**Error:** `Port 8080 was already in use`

**Solution:**
```properties
# Add to application.properties
server.port=8081
```

### Issue 2: JSON Parsing Errors
**Error:** `JSON parse error`

**Solutions:**
- Check JSON syntax (commas, quotes, brackets)
- Verify Content-Type header: `application/json`
- Use JSON formatter to validate syntax

### Issue 3: 404 Not Found on Valid Endpoints
**Possible Causes:**
- Application not running
- Wrong URL (check `http://localhost:8080`)
- Typo in endpoint path
- Controller not in correct package

**Solution:**
```java
// Ensure controller is in correct package
package com.example.userapi.controller;

@RestController
@RequestMapping("/api/users")
public class UserController {
    // Your methods here
}
```

### Issue 4: Empty Response Body
**Cause:** Missing getters/setters in model classes

**Solution:**
```java
public class User {
    private String name;
    
    // Must have getter for JSON serialization
    public String getName() { return name; }
    
    // Must have setter for JSON deserialization
    public void setName(String name) { this.name = name; }
}
```

### Issue 5: CORS Errors (when testing from browser)
**Solution:**
```java
@RestController
@CrossOrigin(origins = "*") // For development only
@RequestMapping("/api/users")
public class UserController {
    // Your methods
}
```

## 🚀 Next Steps

### Immediate Improvements
1. **Add Validation** - Validate user input
   ```java
   @NotBlank(message = "Name is required")
   private String name;
   ```

2. **Exception Handling** - Create proper error responses
   ```java
   @ControllerAdvice
   public class GlobalExceptionHandler {
       // Handle exceptions globally
   }
   ```

3. **Database Integration** - Replace in-memory storage
   - Add Spring Data JPA
   - Use H2 for testing, MySQL/PostgreSQL for production

### Advanced Topics
4. **Security** - Add authentication and authorization
   - Spring Security
   - JWT tokens
   - Role-based access

5. **API Documentation** - Auto-generate docs
   - Swagger/OpenAPI
   - Interactive API explorer

6. **Testing** - Write automated tests
   - Unit tests with JUnit
   - Integration tests with MockMvc

7. **Production Features**
   - Logging and monitoring
   - Caching with Redis
   - Rate limiting
   - Health checks with Actuator

### Learning Path
1. **Master the Basics** (Current guide)
2. **Database Integration** - Spring Data JPA tutorial
3. **Security Implementation** - Spring Security guide
4. **Microservices Architecture** - Advanced Spring Boot
5. **Cloud Deployment** - Deploy to AWS/Azure/GCP

## 📚 Resources

### Documentation
- **Spring Boot Official Docs**: [spring.io/projects/spring-boot](https://spring.io/projects/spring-boot)
- **Spring Web Reference**: [docs.spring.io/spring-framework/docs/current/reference/html/web.html](https://docs.spring.io/spring-framework/docs/current/reference/html/web.html)
- **Postman Learning Center**: [learning.postman.com](https://learning.postman.com/)

### Tutorials
- **Spring Guides**: [spring.io/guides](https://spring.io/guides)
- **Baeldung Spring Boot**: [baeldung.com/spring-boot](https://www.baeldung.com/spring-boot)
- **REST API Best Practices**: [restfulapi.net](https://restfulapi.net/)

### Tools
- **JSON Formatter**: [jsonformatter.org](https://jsonformatter.org/)
- **HTTP Status Codes**: [httpstatuses.com](https://httpstatuses.com/)
- **Maven Repository**: [mvnrepository.com](https://mvnrepository.com/)

### Communities
- **Stack Overflow**: [stackoverflow.com/questions/tagged/spring-boot](https://stackoverflow.com/questions/tagged/spring-boot)
- **Spring Community**: [spring.io/community](https://spring.io/community)
- **Reddit r/SpringBoot**: [reddit.com/r/SpringBoot](https://reddit.com/r/SpringBoot)

## 🤝 Contributing

Found an issue or want to improve this guide?

1. **Report Issues**: Create an issue with detailed description
2. **Suggest Improvements**: Share your ideas for better explanations
3. **Add Examples**: Contribute additional use cases or examples

## 📄 License

This guide is open source and available under the [MIT License](LICENSE).

---

## 🎉 You're Ready to Build!

This README provides everything you need to start building RESTful APIs with Spring Boot. Remember:

- **Start small** - Begin with simple endpoints
- **Test frequently** - Use Postman after each step
- **Practice regularly** - Build different types of APIs
- **Ask questions** - Use the community resources when stuck

**Happy coding! 🚀**

---

*Last updated: December 2024*
*Guide version: 1.0*
*Compatible with: Spring Boot 3.2.0+, Java 17+*
