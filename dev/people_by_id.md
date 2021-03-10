#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_people_by_id.png?raw=true)

#### Request
```
query people($id: Long) {
  people(id: $id) {
    name
    height
    mass
    hair_color
    skin_color
    eye_color
    birth_year
    gender
    homeworld
    films
    species
    vehicles
    starships
    created
    edited
    url
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
    "people": {
      "name": "R2-D2",
      "height": 96,
      "mass": 32,
      "hair_color": "n/a",
      "skin_color": "white, blue",
      "eye_color": "red",
      "birth_year": "33BBY",
      "gender": "n/a",
      "homeworld": "http://swapi.dev/api/planets/8/",
      "films": [
        "http://swapi.dev/api/films/1/",
        "http://swapi.dev/api/films/2/",
        "http://swapi.dev/api/films/3/",
        "http://swapi.dev/api/films/4/",
        "http://swapi.dev/api/films/5/",
        "http://swapi.dev/api/films/6/"
      ],
      "species": [
        "http://swapi.dev/api/species/2/"
      ],
      "vehicles": [],
      "starships": [],
      "created": "2014-12-10T15:11:50.376000Z",
      "edited": "2014-12-20T21:17:50.311000Z",
      "url": "http://swapi.dev/api/people/3/"
    }
  }
}
```