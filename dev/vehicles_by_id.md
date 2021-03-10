#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_vehicles_by_id.png?raw=true)

#### Request
```
query vehicles($id: Long) {
  vehicles(id: $id) {
    name
    model
    manufacturer
    cost_in_credits
    length
    max_atmosphering_speed
    crew
    passengers
    cargo_capacity
    consumables
    vehicle_class
    pilots
    films
    created
    edited
    url
  }
}

```

#### Query variables
```
{
  "id": 8
}
```

#### Response
```
{
  "data": {
    "vehicles": {
      "name": "TIE/LN starfighter",
      "model": "Twin Ion Engine/Ln Starfighter",
      "manufacturer": "Sienar Fleet Systems",
      "cost_in_credits": "unknown",
      "length": "6.4",
      "max_atmosphering_speed": 1200,
      "crew": 1,
      "passengers": 0,
      "cargo_capacity": 65,
      "consumables": "2 days",
      "vehicle_class": "starfighter",
      "pilots": [],
      "films": [
        "http://swapi.dev/api/films/1/",
        "http://swapi.dev/api/films/2/",
        "http://swapi.dev/api/films/3/"
      ],
      "created": "2014-12-10T16:33:52.860000Z",
      "edited": "2014-12-20T21:30:21.670000Z",
      "url": "http://swapi.dev/api/vehicles/8/"
    }
  }
}
```