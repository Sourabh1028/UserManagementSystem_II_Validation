# UserManagementSystem_II_Validation
This project is a Url Hit Counter with Validations built using Spring Boot with Java.

## Framework Used
* Spring Boot

---

## Language Used
* Java
---

## Data Flow

```
The user sends a request to the application through the API endpoints.
```
```
The API receives the request and sends it to the appropriate controller method.
```
```
The controller method makes a call to the method in service class.
```
```
The method in service class builds logic and retrieves or modifies data, which is in turn given to controller class
```
```
The controller method returns a response to the API.
```
```
The API sends the response back to the user.
```

---

## Functions used :-

### API Endpoints :-

* GetMapping: /username/{userName}/count
```
This endpoint gives us the data of the user stored in our data baase. It shows how many times the user hits the URL ?
```

---

## Data structure Used
* HashMap
```
We have used Hashmap data structure as a database to implement Operations 
```
---

## Project Summary
The Url-Hit-Counter is a Spring Boot Project written in Java that counts hoe many times the user hits the url. This project is built using the Spring boot framework. The proect uses HashMap as the datastructure to store user & it's count.
