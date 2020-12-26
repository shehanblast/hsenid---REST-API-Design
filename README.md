# Daddy’s Coffee

Daddy’s Coffee is a mobile application to allow its
customers to order coffee online.

## Run the application

Download the zip folder/clone import to your IDE and run the spring boot application. 

```bash
File -> Import -> Existing Maven Projects -> Next -> Browse -> Select the folder spring- spring-boot-application-run -> Select Folder -> Finish
```

## DB initialization scripts

Initialize a Database Using JPA

```bash
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/test_user_dev?useSSL=false&createDatabaseIfNotExist=true&useFastDateParsing=false

#database usename,password and server port
spring.datasource.username=root
spring.datasource.password=Binuka123#
server.port=8080

spring.jpa.show-sql=false
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL57Dialect

spring.jpa.properties.hibernate.format_sql=true
spring.datasource.initialization-mode=never

spring.datasource.tomcat.connection-properties=useUnicode=true;characterEncoding=utf-8;
```

## Get coffee details

Request 

```bash
curl -i -X GET \
   -H "Origin:*" \
 'http://localhost:8080/jpa/coffee/viewall'
 ```
 
 Response
 
 ```bash
Vary:	Origin
Vary:	Access-Control-Request-Method
Vary:	Access-Control-Request-Headers
Access-Control-Allow-Origin:	*
Content-Type:	application/json
Transfer-Encoding:	chunked
Date:	
Sat, 26 Dec 2020 07:33:47 GMT
Keep-Alive:	timeout=60
Connection:	keep-alive

[
{
"id": 1,
"username": "best",
"name": "Black",
"type": "Brewed",
"price": 200.0
},
{
"id": 2,
"username": "best",
"name": "Red Eye",
"type": "Spices",
"price": 500.0
},
{
"id": 36,
"username": "best",
"name": "Ristretto",
"type": "Espresso",
"price": 150.0
},
{
"id": 37,
"username": "lol",
"name": "Stradj",
"type": "black",
"price": 1500.0
},
{
"id": 38,
"username": "lol",
"name": "Strad",
"type": "black",
"price": 1500.0
},
{
"id": 39,
"username": "lol",
"name": "Strad",
"type": "black",
"price": 1500.0
},
{
"id": 40,
"username": "best",
"name": "Affogato",
"type": "Espresso",
"price": 250.0
},
{
"id": 41,
"username": "best",
"name": "Affogato",
"type": "Espresso",
"price": 250.0
}
]
 ```
 
 ## Place a new order
 
 Request 
 
 ```bash
 curl -i -X POST \
   -H "Origin:*" \
   -H "Content-Type:application/json" \
   -d \
 'http://localhost:8080/jpa/best/coffee'
'
 ```
 
Response

 ```bash
access-control-allow-origin:	*
connection:	keep-alive
content-length:	0 byte
date:	
Sat, 26 Dec 2020 07:42:15 GMT
keep-alive:	timeout=60
location:	http://localhost:8080/jpa/best/coffee/42
vary:	Origin, Access-Control-Request-Method, Access-Control-Request-Headers
 
{
"id": 7,
"username": "best",
"name": "Affogato",
"type": "Espresso",
"price": 250.0
}
```
