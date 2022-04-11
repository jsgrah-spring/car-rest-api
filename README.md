## car-rest-API

The Structure of the car-rest-API is as follows.

### Get all cars
````javascript
curl --location --request GET 'http://localhost:8080/api/cars'
````
HTTP_VERB: GET

URL: http://localhost:8080/api/cars

RESPONSE: status_code: 200
````json
[
    {
        "id": 6,
        "brand": "Mazda",
        "model": "3",
        "color": "blue",
        "power": 105,
        "yearOfManufacture": 2005,
        "vinNumber": "JMZCU08B21KM39032"
    },
    {
        "id": 7,
        "brand": "Volvo",
        "model": "S60",
        "color": "green",
        "power": 250,
        "yearOfManufacture": 2001,
        "vinNumber": "YV4492DZ4A1029421"
    },
    {
        "id": 8,
        "brand": "Ford",
        "model": "Mondeo",
        "color": "silver",
        "power": 130,
        "yearOfManufacture": 2009,
        "vinNumber": "WF05ZXGCD17E75243"
    },
    {
        "id": 9,
        "brand": "Alfa Romeo",
        "model": "Brera",
        "color": "red",
        "power": 150,
        "yearOfManufacture": 2006,
        "vinNumber": "ZAR83202001173832"
    },
    {
        "id": 10,
        "brand": "BMW",
        "model": "E46",
        "color": "blue",
        "power": 231,
        "yearOfManufacture": 2003,
        "vinNumber": "WBAPX81020CU59571"
    },
    {
        "id": 11,
        "brand": "Nissan",
        "model": "Almera",
        "color": "green",
        "power": 90,
        "yearOfManufacture": 2004,
        "vinNumber": "SJNFFAJ12U2631414"
    },
    {
        "id": 12,
        "brand": "Opel",
        "model": "Astra",
        "color": "silver",
        "power": 100,
        "yearOfManufacture": 2002,
        "vinNumber": "W0LGD5EY5B1014357"
    },
    {
        "id": 13,
        "brand": "Audi",
        "model": "A4",
        "color": "black",
        "power": 140,
        "yearOfManufacture": 2004,
        "vinNumber": "WAUZZZ8K09B089377"
    },
    {
        "id": 14,
        "brand": "Subaru",
        "model": "Impreza",
        "color": "blue",
        "power": 290,
        "yearOfManufacture": 2003,
        "vinNumber": "JF1GP3LC1DG052738"
    },
    {
        "id": 15,
        "brand": "Kia",
        "model": "Picanto",
        "color": "white",
        "power": 82,
        "yearOfManufacture": 2009,
        "vinNumber": "KNAHU815AE7049218"
    },
    {
        "id": 16,
        "brand": "Seat",
        "model": "Ibiza",
        "color": "yellow",
        "power": 104,
        "yearOfManufacture": 1999,
        "vinNumber": "VSSZXZ5FZJR117828"
    }
]
````
### Get a car by id
````javascript
curl --location --request GET 'http://localhost:8080/api/cars/6'
````
HTTP_VERB: GET

URL: http://localhost:8080/api/cars/{id}

Example: GET - http://localhost:8080/api/cars/6

RESPONSE:  status_code: 200
````json
{
    "id": 6,
    "brand": "Mazda",
    "model": "3",
    "color": "blue",
    "power": 105,
    "yearOfManufacture": 2005,
    "vinNumber": "JMZCU08B21KM39032"
}
````
Returns status_code HTTP_NOT_FOUND (404) if no car with given id exists

### Create a new car
````javascript
curl --location --request POST 'http://localhost:8080/api/cars' \
--header 'Content-Type: application/json' \
--data-raw '{
    "brand": "Acura",
    "model" : "NSX",
    "color" : "Berlina Black",
    "power" : "573",
    "yearOfManufacture": "2020",
    "vinNumber": "19UNC1B06JY000055"
}'
````
HTTP_VERB: POST

URL: http://localhost:8080/api/cars

Request Body:
````json
{
    "brand": "Acura",
    "model" : "NSX",
    "color" : "Berlina Black",
    "power" : "573",
    "yearOfManufacture": "2020",
    "vinNumber": "19UNC1B06JY000055"
}
````

### Delete existing car by id
````javascript
curl --location --request DELETE 'http://localhost:8080/api/cars/6'
````
HTTP_VERB: DELETE

URL: http://localhost:8080/api/cars/{id}

Example: DELETE: http://localhost:8080/api/cars/6

RESPONSE:  Status_Code: 200
````text
Deleted car id - 6
````
Returns status_code HTTP_NOT_FOUND (404) if no car with given id exists