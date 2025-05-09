# Rest-API-3-project
here is the API which is using all java basics and boot annotations with exception


            com/
            └── example/
                └── projectname/
                    ├── model/
                    │   ├── Developer.java
                    │   └── Tester.java
                    ├── repository/
                    │   ├── DeveloperRepository.java
                    │   └── TesterRepository.java
                    ├── service/
                    │   ├── DeveloperService.java
                    │   └── TesterService.java
                    ├── controller/
                    │   ├── DeveloperController.java
                    │   └── TesterController.java
                    ├── exception/
                    │   ├── GlobalExceptionHandler.java
                    │   └── ResourceNotFoundException.java
                    ├── ProjectNameApplication.java
                    └── application.properties

### **STEP 1-**

**1. Set Up the Spring Boot Project**


- Group: com.example

- Artifact: projectname

**2. Dependencies:-**

1. Spring Web
            
2. Spring Data JPA
            
3. MySQL Driver
            
4. Spring Boot DevTools (optional, for auto-reload during development)
            
5. Lombok (for boilerplate code generation like getters, setters, etc.)

### **Step 2-**

- Configure the application.properties for MySQL connection

### **Step 3-**

- Define the Entity Classes

### **Step 4-**

- Create the Repository Interfaces

### **Step 5-**

- Create the Service Layer

### **Step 6-**

- Create the Controller Layer (REST APIs)

### **Step 7-**

Exception Handling For exception handling, we can create a custom ExceptionHandler to handle common exceptions like EntityNotFoundException
also Custom Error Response Class

### **Step 7-**

Run the Application

**POSTMAN UI requests-**

your REST APIs:

POST /api/developers – Create a new Developer

GET /api/developers – Get all Developers

GET /api/developers/{id} – Get a Developer by ID

DELETE /api/developers/{id} – Delete a Developer

Similarly for Testers at /api/testers

- **Entities:** Developer.java, Tester.java are the domain models.
- **Repositories:** Interfaces for data access (DeveloperRepository.java, TesterRepository.java).
- **Services:** Business logic (DeveloperService.java, TesterService.java).
- **Controllers:** REST API endpoints (DeveloperController.java, TesterController.java).
- **Exception Handling:** Global exception handler and custom exception (GlobalExceptionHandler.java, ResourceNotFoundException.java).
