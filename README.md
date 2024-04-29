# **Setting Up a Spring Boot Application with MongoDB**

**1. Install MongoDB and MongoDB Compass**
 - Install MongoDB on your local machine.
 - Install MongoDB Compass or use the terminal with mongosh for GUI-based interaction.

**2. Connect to MongoDB:**

  Open MongoDB Compass or mongosh and connect to MongoDB running on 127.0.0.1:27017.

**3. Create a Database**
In MongoDB Compass, create a database named "employwise" or use “use employwise” command in mongosh.


![image](https://github.com/SaranE1/EmployeeWise/assets/110584461/a4e2cd7d-e4c9-489c-b08d-009ed21c3c05)


**4. Build and Run Spring Boot Application**
 - Set up a Spring Boot project with Maven.
 - Configure the project to connect to MongoDB on 127.0.0.1:27017.
 - Run the Spring Boot application. Ensure it connects to MongoDB.


![image](https://github.com/SaranE1/EmployeeWise/assets/110584461/0f0216a4-eaf6-41f2-b30a-374ed4861bb8)


**5. API Endpoints**
The Spring Boot application exposes various API endpoints for CRUD operations on employee data.

**Listing API Endpoints**
API Endpoint: Visit localhost:8080 to see all API endpoints in JSON format.


![image](https://github.com/SaranE1/EmployeeWise/assets/110584461/453867be-d056-4a6c-b8c0-fe0e0ed095f8)


**Adding Data**
 - API Endpoint: 
 - POST request to localhost:8080/add.
 - Data is added to the "employwise" database using Postman. 
 - Provide data in the body of the request.
 - Once the data is added, it will return the UUID Employee ID of the particular employee’s data.


![image](https://github.com/SaranE1/EmployeeWise/assets/110584461/680af4f2-e388-477c-ac58-69ec856b5322)


**Deleting Data**

API Endpoint: DELETE request to localhost:8080/delete. Provide the Employee ID to delete the document.

**Updating Data**
API Endpoint: PUT request to localhost:8080/update. Provide values to be updated to update the old data with the new data.

**Showing Data**
API Endpoint: GET request to localhost:8080/show. Displays all employee data from the "employwise" database.


![image](https://github.com/SaranE1/EmployeeWise/assets/110584461/0e249d56-b2bf-406f-8873-7d521f240557)
