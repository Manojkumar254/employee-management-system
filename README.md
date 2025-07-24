# Employee Management System

## Description
This is a Spring Boot application for managing employee records, including features for adding, updating, deleting, and retrieving employee information.

### Project Structure

'''
employeemanagement/
│
├── pom.xml
├── README.md (optional but recommended)
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── employeemanagement/
│   │   │           └── employeemanagement/
│   │   │               ├── EmployeemanagementApplication.java
│   │   │               ├── controller/
│   │   │               │   └── EmployeeController.java
│   │   │               ├── entity/
│   │   │               │   └── Employee.java
│   │   │               ├── exception/
│   │   │               │   └── GlobalExceptionHandler.java
│   │   │               ├── repository/
│   │   │               │   └── EmployeeRepository.java
│   │   │               └── service/
│   │   │                   └── EmployeeService.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── static/
│   │       └── templates/
│   └── test/
│       └── java/
│           └── com/
│               └── employeemanagement/
│                   └── employeemanagement/
│                       ├── EmployeemanagementApplicationTests.java
│                       ├── controller/
│                       │   └── EmployeeControllerTest.java
│                       └── service/
│                           └── EmployeeServiceTest.java

'''

## Prerequisites
- Java 17
- Spring Boot 3.2.5
- MySQL Database

## Setup Instructions
### Step 1: Clone the repository: 
   git clone https://github.com/Manojkumar254/employee-management-system.git

   To set up and run your Spring Boot project (Employee Management System) in Spring Tool Suite (STS), follow these detailed steps:

### Step 1: Install Spring Tool Suite (STS)

1. **Download STS**:
   - Go to the [Spring Tool Suite website](https://spring.io/tools) and download the appropriate version for your operating system.

2. **Install STS**:
   - Follow the installation instructions for your operating system to install STS.

### Step 2: Import Your Project into STS

1. **Open STS**:
   - Launch the Spring Tool Suite application.

2. **Import the Project**:
   - Go to `File` > `Import...`.
   - Select `Maven` > `Existing Maven Projects` and click `Next`.
   - Click `Finish` to import the project.

### Step 3: Configure the Project

1. **Update Maven Dependencies**:
   - Right-click on your project in the Project Explorer.
   - Select `Maven` > `Update Project...`.

2. **Configure Database Connection**:
   - Open the `src/main/resources/application.properties` file.
   - Update the database connection settings with your MySQL credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/assignmentdb
     spring.datasource.username=root
     spring.datasource.password=Manoj@123
     spring.jpa.hibernate.ddl-auto=update
     ```

### Step 4: Run the Application

1. **Run the Application**:
   - Right-click on your project in the Project Explorer.
   - Select `Run As` > `Spring Boot App`.
2. **Check Console Output**:
   - Monitor the console output for any errors or messages indicating that the application has started successfully. You should see a message indicating that the application is running on a specific port (default is `8080`).

### Step 5: Access the Application

1. **Access Swagger UI**:
   - Open a web browser and navigate to:
     ```
     http://localhost:8080/swagger-ui.html
     ```
   - This will display the Swagger UI where you can see the API documentation.

2. **Access API Documentation**:
   - You can also access the OpenAPI documentation at:
     ```
     http://localhost:8080/v3/api-docs
     ```

### Step 6: Testing the Application

1. **Test API Endpoints**:
   - Use tools like Postman or curl to test the API endpoints defined in your application.
   - For example, you can test the endpoint to add a new employee or retrieve employee details.

### Conclusion

By following these steps, you should be able to set up and run your Employee Management System project in Spring Tool Suite (STS) successfully. If you encounter any issues or have further questions, feel free to ask!



