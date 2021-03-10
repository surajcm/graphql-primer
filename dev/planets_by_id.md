#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_planets_by_id.png?raw=true)

#### Request
```
query planets($id: Long) {
  planets(id: $id) {
    name
    rotation_period
    orbital_period
    diameter
    climate
    gravity
    terrain
    surface_water
    population
    residents
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
    "planets": {
      "name": "Dagobah",
      "rotation_period": 23,
      "orbital_period": 341,
      "diameter": 8900,
      "climate": "murky",
      "gravity": "N/A",
      "terrain": "swamp, jungles",
      "surface_water": 8,
      "population": "unknown",
      "residents": [],
      "films": [
        "http://swapi.dev/api/films/2/",
        "http://swapi.dev/api/films/3/",
        "http://swapi.dev/api/films/6/"
      ],
      "created": "2014-12-10T11:42:22.590000Z",
      "edited": "2014-12-20T20:58:18.425000Z",
      "url": "http://swapi.dev/api/planets/5/"
    }
  }
}
```