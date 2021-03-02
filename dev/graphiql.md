#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/graphiql_screen.png?raw=true)

#### Request
```
query film($id: Long) {
    film(id: $id) 
}
```

#### Query variables
```
{
  "id": 3
}
```

#### Response
```
{
  "data": {
    "film": "Return of the Jedi"
  }
}
```