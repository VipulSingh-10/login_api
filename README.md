Login API with JWT Authentication

This project is a simple yet robust login API built using Spring Boot and JWT (JSON Web Token) authentication. It provides the foundation for implementing a secure authentication mechanism in RESTful APIs, enabling users to log in using their credentials and receive a JWT token for accessing secured endpoints.

Key Features:
JWT Authentication: Uses JWT tokens to securely authenticate users and grant access to protected resources.
Token-based Security: Stateless authentication with token validation to protect API endpoints.
Custom Authentication Token: Custom implementation of UserPrincipalAuthenticationToken to integrate with Spring Security.
Login API: A simple login endpoint where users can provide their credentials and receive a JWT token.
Secured Endpoints: Example of secured API endpoints that are accessible only with a valid token.
Technology Stack:
Spring Boot: For building the RESTful API and managing backend services.
Spring Security: For securing the endpoints and managing authentication.
JWT (JSON Web Tokens): For handling secure authentication and authorization.
HMAC256 Algorithm: For encoding and verifying the JWT tokens.
Java 17+: Language used for development.
Project Structure:
Controllers: Contains RESTful API endpoints for login and secured access.
Security: Includes classes for handling JWT decoding, token generation, and custom authentication tokens.
Model: Contains data models for login requests and responses.
Setup:
Clone the repository:
bash
Copy code
git clone https://github.com/yourusername/login-api-jwt.git
Navigate to the project directory and build the project:
bash
Copy code
cd login-api-jwt
mvn clean install
Run the application:
bash
Copy code
mvn spring-boot:run
Use the login API at POST /auth/login to obtain a JWT token.
Access the secured endpoint at GET /secured using the JWT token in the Authorization header.
