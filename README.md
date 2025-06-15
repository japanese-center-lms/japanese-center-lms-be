# LMS Authentication Module

This module provides a secure authentication system for the LMS project using Spring Boot, JWT, UUID, and Bcrypt.  
**Note:** This system handles technical authentication only and does not provide any medical advice or decision support.

## Features

- **User Authentication** via RESTful APIs
- **JWT (JSON Web Token)** for stateless authentication
- **Password Hashing** using Bcrypt
- **UUID** for unique user identification
- **Spring Boot Security** for API endpoint protection
- **Role-based Access Control** (can be extended)
- **Secure coding best practices**

## Technologies Used

- Java 21
- Maven
- Spring Boot
- Spring Security
- JWT (io.jsonwebtoken)
- Bcrypt (Spring Security)
- UUID (Java built-in)


## API Endpoints

| Endpoint              | Method | Description                   | Auth Required |
|-----------------------|--------|-------------------------------|---------------|
| `/api/auth/login`     | POST   | Login and receive JWT         | No            |


## Authentication Flow

1. **Registration:**  
   - User submits username and password.
   - Password is hashed using Bcrypt.
   - User is assigned a UUID.
2. **Login:**  
   - User submits credentials.
   - Credentials are verified.
   - On success, a JWT is issued.
3. **Access Protected Endpoints:**  
   - Client sends JWT in `Authorization: Bearer <token>` header.
   - Backend verifies JWT and grants/denies access.

## Security Best Practices

- Passwords are never stored or transmitted in plaintext.
- JWTs are signed with a secure secret.
- Sensitive data is never logged.
- Follows HIPAA/GDPR/KVKK guidelines (if used for medical/patient data).

## Quick Start

1. **Clone the repository**
2. **Run the PostgreSQL and insert new User.**
4. **Build and Run**
    ```bash
    ./mvnw clean install
    ./mvnw spring-boot:run
    ```
5. **Test endpoints**
    - Use Postman or curl to test the authentication APIs.
    - Or go to http://localhost:8080/swagger-ui/index.html#/authentication-controller/authenticate
