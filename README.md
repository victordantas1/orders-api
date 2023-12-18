<<<<<<< HEAD
<div> 
  <h1>Orders Service API</h1>
  <div display="ïnline_block"> <h2>About 📕</h2>
    <img height="100" width="100" src= "./assets\20943863.jpg">
    <p>This project is an ordering service API, it can be used for food delivery and online product sales.</p>
  </div>
</div>
 
=======
# Orders Service API RESTful📦
## About 📕
  <p>This project is an ordering service API, it can be used for food delivery and online product sales. This project was developed with instructions from Nelio Alves' Java and Spring Boot course, in order to exercise and improve the skills acquired during the course.</p>

## Features 🛠️
  -  Find, delete, post and update service users
  -  Find orders users
  -  Find products orders
  -  Find products categories
  
## Techs 💻
  <ul>
    <li><a href="https://www.java.com">Java</a>: language used during api development.</li>
    <li><a href="https://spring.io">Spring</a>: framework used for developing the web api using Spring Web and Spring Data JPA.</li>
    <li><a href="https://www.h2database.com">H2 Database</a>: test database used during application development</li>
  </ul>
  
## Requiriments 📝
  <ul>
    <li>Have <a target="_blank" href="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java</a> version 17 installed</li>
    <li>Have <a target="_blank" href="https://www.postman.com/downloads/">Postman</a> installed(but the application can be used in browser)</li>
  </ul>
  
## initialization 🔌
- Use <a target="_blank" href="https://www.postman.com/downloads/">Postman</a> to make better use of the API's features.
``` bash 
  # Clone project
  $ git clone git@github.com:victordantas1/orders-api.git
````

 ``` bash 
   # Install dependencies
   $ mvn install
  ````

 ``` bash 
   # Run project
   $ mvn spring-boot:run
 ````
-  The application will run at http://localhost:8080.
### Endpoints
#### GET
  - /users: find a users list
  - /orders: find a orders list
  - /products: find a products list
  - /categories: find a categories list
#### POST
  - /users: add a user
#### PUT
  - /users: update a user
#### DELETE
  - /user: delete a user

## Future implementations ⌨️
  - CRUD of other entities
  - Anothers endpoints to find with others atributes
  - A new project using hateos will be developed using this as a base
>>>>>>> 50240f3574ce1ef401a1153713c4bdb3293c83b5
