# E-Commerce-App-With-Microservices

Important url's 

Eureka-Server
http://localhost:8761

Config-Server
http://localhost:8888

Supplier-Service
http://localhost:8081/suppliers

Product-Service
http://localhost:8082/products

Customer-Service
http://localhost:8083/customers

Shipper Service
http://localhost:8084/shippers

Order-Service
http://localhost:8085/orders

Respective service url's with Api-Gateway
1. http://localhost:9090/supplier-service/suppliers
2. http://localhost:9090/product-service/products
3. http://localhost:9090/customer-service/customers
4. http://localhost:9090/shipper-service/shippers
5. http://localhost:9090/order-service/orders

Respective url's for config server to read properties defined in git repository
1. http://localhost:8888/supplier-service/default
2. http://localhost:8888/product-service/default
3. http://localhost:8888/customer-service/default
4. http://localhost:8888/shipper-service/default
5. http://localhost:8888/order-service/default

Spring actuator url to check health of the supplier service which is implemented inside the product service
http://localhost:8082/actuator/health
