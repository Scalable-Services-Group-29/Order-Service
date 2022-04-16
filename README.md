# Order-Service
Service to Serve Order Data

Data base: Spring H2

Connect to H2 console using: http://localhost:8080/h2-console

**APIs**
1. GET orders for a customer: http://localhost:8080/orders/get_customer_orders?customer_id=1
2. GET order details by order id: http://localhost:8080/orders/get_order?id=1
3. Save order: curl --request POST \
  --url http://localhost:8080/orders/save_order \
  --header 'Content-Type: application/json' \
  --data '{
	"customer_id": 1,
	"order_status": "AAA",
	"order_amount": 11243.11
}'
