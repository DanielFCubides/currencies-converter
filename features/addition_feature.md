# user history 
As I User, I want to be able to sum different currencies, and get the result value result in a specific currency, so I could calculate my expenses in another country

## Conversation
What question should be ask?


examples of the expected output
input:
```json
{
  "operation": "addition",
  "input": ["3:USD","2000:COP","50:EUR","115:USD"],
  "output": "USD"
}
```
output:
```json
{
  "result": "XXX:USD"
}
```

## Acceptance criteria
* [ ] The output have to be return in the currency specified.
* [ ] The input have to be strings with the value and the currency.
* [ ] The output have to be the a the addition of all the input values in the currency specified
* [ ] The max number of values in the input array must be 10
* [ ] The input have to be in positive values


