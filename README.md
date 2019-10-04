# currencies-converter
This is a currency converter project oriented to demostrate the TDD methodology to the MIYAGI TEAM

## config database
To run the project ensure you have a postgress database, to initialie one use:
```sh
docker run --name currency-postgres -p 5432:5432 -e POSTGRES_PASSWORD=root -e POSTGRES_USER=root -e POSTGRES_DB=currency -d postgres
```