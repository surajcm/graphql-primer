#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_starships_by_id.png?raw=true)

#### Request
```
query starShips($id: Long) {
  starShips(id: $id) {
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
    hyperdrive_rating
    MGLT
    starship_class
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
  "id": 5
}
```

#### Response
```
{
  "data": {
    "starShips": {
      "name": "Sentinel-class landing craft",
      "model": "Sentinel-class landing craft",
      "manufacturer": "Sienar Fleet Systems, Cyngus Spaceworks",
      "cost_in_credits": 240000,
      "length": "38",
      "max_atmosphering_speed": 1000,
      "crew": "5",
      "passengers": "75",
      "cargo_capacity": 180000,
      "consumables": "1 month",
      "hyperdrive_rating": "1.0",
      "MGLT": 0,
      "starship_class": "landing craft",
      "pilots": [],
      "films": [
        "http://swapi.dev/api/films/1/"
      ],
      "created": "2014-12-10T15:48:00.586000Z",
      "edited": "2014-12-20T21:23:49.873000Z",
      "url": "http://swapi.dev/api/starships/5/"
    }
  }
}
```