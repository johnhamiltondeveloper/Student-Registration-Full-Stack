# Student Registration Full Stack - Project

This is a full stack web application using Spring



## Setup

1. Install mysql (https://www.mysql.com/)

2. create a schema in mysql as `studentdb`

3. Updating the mysql password and username
   
   1. Go into the folder `src\main\resources` you will find a file named application.properties
   
   2.  update the line `spring.datasource.username=root` change root to the username you have for you mysql
   
   3.  update the line `spring.datasource.password=root` change root to the password you have for you mtsql

4. Updating mysql port
   
   1. Go into the folder `src\main\resources` you will find a file named application.properties
   
   2. The default port used is `3306` to update it find the line `spring.datasource.url= jdbc:mysql://localhost:3306/studentdb` and replace `3306` with the port that your mysql is using



## Usage

1. You need to run as a Spring application

2. Now in a browser go to http://localhost:8080/



## HTML Endpoints

```http
GET http://localhost:8080/api/v1/students
```

## API Endpoints

### Get a list of students

```json
GET http://localhost:8080/api/v1/students
```

### Post New Student

```json
POST http://localhost:8080/api/v1/students
{
        "name": "bob",
        "age": 29,
        "address": "Sydney",
        "mobile": 2343423
}
```


