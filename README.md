# Order-Service
Service to Serve Order Data

Data base: Spring H2

Connect to H2 console using: http://localhost:9001/h2-console

**APIs**
1. GET orders for a customer: http://localhost:9001/orders/get_customer_orders?customer_id=1
2. GET order details by order id: http://localhost:9001/orders/get_order?id=1
3. Save order: curl --request POST \
  --url http://localhost:9001/orders/save_order \
  --header 'Content-Type: application/json' \
  --data '{
    "customer_id": 1,
    "order_status": "AAA",
    "order_amount": 11243.11
}'

**DOCKER SETUP**
(Steps required to run the service in docker)
1. Use gradle -> build to build the jar file for the OrderService
2. Run "docker build --build-arg JAR_FILE=build/libs/Order-Service-0.0.1-SNAPSHOT.jar -t scalable-services/order-service-spring-boot-docker ." command in the terminal to create the docker image for order service
3. Run "docker run -p 9001:90001 -t scalable-services/order-service-spring-boot-docker" command to run the docker image which was created in previous step
