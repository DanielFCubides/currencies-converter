# currencies-converter
This is a currency converter project oriented to demonstrate the TDD methodology to the MIYAGI TEAM

## config database
To run the project ensure you have a postgress database, to initialize one use:
```sh
docker run --name currency-postgres -p 5432:5432 -e POSTGRES_PASSWORD=root -e POSTGRES_USER=root -e POSTGRES_DB=currency -d postgres
```
Then you could run the project 
```sh
gradle bootRun
```

To check that everything is ok, go to the browser and navigate to: `http://localhost:8080/currency`


## Lets begin

Step 1 - Change the service response to:
```
[currency:currency-value]
```
example
```
["USD:1"]
```

Step 2 - Add the behavior to Add currencies
Create a POST service to add currencies to the database
all currencies should have a value


Step 3 - Add a criteria that you should not add duplicated currencies
Modify your POST service to validate that there is no duplicated currencies

Step 4 - Change the service response to use a json format
Example: 
```json
{
"currency_list": [
{
  "currency_name": "USD",
  "currency_value": "1"
},
{
  "currency_name": "COP",
  "currency_value": "3441.34"
},
{
    "currency_name": "EUR",
    "currency_value": "0.9100"
  }
]
}

```