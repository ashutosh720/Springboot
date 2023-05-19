# Stock Management API

# Tech Stack
## Spring Boot
## Spring MVC
## H2 database

# Requirements
## IntelliJIDEA
  Serverport: 8080 (use: localhost:8080)
  Database name: 
  Java version: 17
  Springboot 
  
# Controllers
StockController
Endpoint: /stock

Description: REST controller for managing stocks.

Methods:

GET /type/{stockType}

Description: Retrieves stocks based on the specified stock type.
Parameters:
stockType - Path parameter specifying the stock type.
Returns: List of stocks matching the specified type.
GET /abovePrice/price/{price}/lowerData/date/{date}

Description: Retrieves stocks with a price above the specified price and a birth date lower than the specified date.
Parameters:
price - Path parameter specifying the price threshold.
date - Path parameter specifying the date threshold.
Returns: List of stocks meeting the criteria.
GET /cap/{capPercentage}

Description: Retrieves all stocks with a market capitalization above the specified percentage.
Parameters:
capPercentage - Path parameter specifying the market capitalization percentage threshold.
Returns: List of stocks with a market capitalization above the threshold.
POST /

Description: Inserts a list of stocks.
Request Body: List of stocks to be inserted.
Returns: A message indicating the success of the operation.
PUT /marketCap/{marketCap}/id/{id}

Description: Updates the market capitalization of a stock with the specified ID.
Parameters:
marketCap - Path parameter specifying the new market capitalization.
id - Path parameter specifying the ID of the stock to be updated.
PUT /stock/type/id

Description: Updates the type of a stock with the specified ID.
Parameters:
stockType - Query parameter specifying the new stock type.
id - Query parameter specifying the ID of the stock to be updated.
PUT /stock/{id}

Description: Updates the details of a stock with the specified ID.
Parameters:
id - Path parameter specifying the ID of the stock to be updated.
myStock - Request body containing the updated stock details.
DELETE /ownerCount/{count}

Description: Deletes stocks based on the specified owner count.
Parameters:
count - Path parameter specifying the owner count threshold.
