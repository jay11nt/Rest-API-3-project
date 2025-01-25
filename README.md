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


- **Entities:** Developer.java, Tester.java are the domain models.
- **Repositories:** Interfaces for data access (DeveloperRepository.java, TesterRepository.java).
- **Services:** Business logic (DeveloperService.java, TesterService.java).
- **Controllers:** REST API endpoints (DeveloperController.java, TesterController.java).
- **Exception Handling:** Global exception handler and custom exception (GlobalExceptionHandler.java, ResourceNotFoundException.java).
