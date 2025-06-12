# microservices_example

This is a simple Java microservice built with Spring Boot. It demonstrates basic CRUD operations (GET, POST, PUT, DELETE) using RESTful endpoints.

## Features

- **GET**: Retrieve an item by its ID
- **POST**: Create a new item
- **PUT**: Update an existing item by its ID
- **DELETE**: Delete an item by its ID

## Running the Application

1. Make sure you have JDK 17+ and Maven installed.
2. Clone the repository:
   ```sh
   git clone https://github.com/raklane/microservices_example.git
   cd microservices_example
   ```
3. Build and run:
   ```sh
   mvn spring-boot:run
   ```

## API Endpoints

- `GET    /items/{id}` - Get item by ID
- `POST   /items`      - Create item (raw string in body)
- `PUT    /items/{id}` - Update item by ID (raw string in body)
- `DELETE /items/{id}` - Delete item by ID

## Example cURL Commands

**Create an item:**
```sh
curl -X POST http://localhost:8080/items -H "Content-Type: text/plain" -d "MyItem"
```

**Get an item:**
```sh
curl http://localhost:8080/items/1
```

**Update an item:**
```sh
curl -X PUT http://localhost:8080/items/1 -H "Content-Type: text/plain" -d "UpdatedItem"
```

**Delete an item:**
```sh
curl -X DELETE http://localhost:8080/items/1
```

## License

This project is open source and available under the [MIT License](LICENSE).