#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/graphiql_screen.png?raw=true)

#### Request
```
query film($id: Long) {
	film(id: $id) {
	  title
	  episode_id
	}
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
    "film": {
      "title": "Return of the Jedi",
      "episode_id": 6
    }
  }
}
```