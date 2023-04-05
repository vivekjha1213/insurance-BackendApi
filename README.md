# insurance-BackendApi
Insurance-BackendApi is a backend RESTful API application built with the Spring Boot framework. The application provides endpoints for managing insurance claims, policies, and customers. The API allows users to create, read, update, and delete insurance claims, policies, and customers.

The application uses a MySQL database for persistent storage and Hibernate as the ORM tool. It also includes Swagger UI for API documentation and testing.

The project follows the MVC (Model-View-Controller) design pattern, with the following packages:

Model: Contains the POJO classes for Claim, Customer, and Policy entities.
Repository: Contains the interfaces extending the Spring Data JPA repository to perform CRUD operations.
Service: Contains the business logic of the application.
Controller: Contains the RESTful API endpoints for handling HTTP requests.
Exception: Contains custom exception classes for handling specific error scenarios.
Overall, the Insurance-BackendApi provides a reliable and scalable solution for managing insurance claims and policies with the use of modern technologies and best practices.

=========================================================================================================================================================
Create a new client:
* URL: POST /api/clients. ->> {
*   "firstName": “vivek”,
*   "lastName": “jha”,
*   "email": “example@example.com"
* }
* URL: GET /api/clients/{id}
* URL: GET /api/clients
* URL: GET /api/clients/{id}
* URL: DELETE /api/clients/{id}

=========================================================================================================================================================



 URL: GET /api/claims
 Fetch a specific claim by ID:
 URL: GET /api/claims/{id}
 GET /api/claims/1234
6. Create a new claim:
7. URL: POST /api/claims
 Request Body:
 json : { "claimId": "1234", "policyNumber": "POL-1234", "claimAmount": 5000.0, "claimDescription": "Testing...", "claimStatus": "Pending" }

Update a claim:
 URL: PUT /api/claims/{id}
 Request Body:
json
{ "claimId": "1234", "policyNumber": "POL-1234", "claimAmount": 6000.0, "claimDescription": "Testing", "claimStatus": "Approved" }
 Delete a claim:
 URL: DELETE /api/claims/{id}
 Example: DELETE /api/claims/1234
 
 ===========================================================================================================================================================
 
 Policy Controller ->>>> insurance..



 Create Insurance Policy:
URL: POST /api/policies
Request Body:
json

{ "policyNumber": "POL001", "policyHolderName": "vivek jha", "policyType": "Auto", "policyStatus": "Active", "coverageAmount": 500000.0 }

Update Insurance Policy:
URL: PUT /api/policies/{id} (Replace {id} with the ID of the policy you want to update)
 Request Body:
json

{ "policyNumber": "POL001", "policyHolderName": " vivek ", "policyType": "Auto", "policyStatus": "Active", "coverageAmount": 750000.0 }
3. Delete Insurance Policy:

URL: DELETE /api/policies/{id} (Replace {id} with the ID of the policy you want to delete)
 Get All Insurance Policies:

 URL: GET /api/policies
 Get Insurance Policy by ID:
 URL: GET /api/policies/{id} (Replace {id} with the ID of the policy you want to retrieve)


 
 Testing ScreenShot..
 
 
 


![Uploading Screenshot 2023-04-05![Screenshot 2023-04-05 at 12 37 50 PM](https://user-images.githubusercontent.com/67068290/230007021-0400f39a-c5a9-4c6a-ad2a-525ce675ec5f.png)
![Screenshot 2023-04-05 at 12 37 33 PM](https://user-images.githubusercontent.com/67068290/230007029-f9402db7-1777-4595-bb3c-e969ba761011.png)
 at 12.37.57 PM.png…]()
![Screenshot 2023-04-05 at 12 39 35 PM](https://user-images.githubusercontent.com/67068290/230007073-8c11980c-76e7-4f4b-91c0-60e3e6095a7f.png)

Db Schema: 
 
 ![Uploading Screenshot 2023-04-05 at 12.39.35 PM.png…]()

 
 

