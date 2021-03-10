#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_species_by_id.png?raw=true)

#### Request
```
query species($id: Long) {
  species(id: $id) {
    name
    classification
    designation
    average_height
    skin_colors
    hair_colors
    eye_colors
    average_lifespan
    homeworld
    language
    people
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
  "id": 2
}
```

#### Response
```
{
  "data": {
    "species": {
      "name": "Droid",
      "classification": "artificial",
      "designation": "sentient",
      "average_height": "n/a",
      "skin_colors": "n/a",
      "hair_colors": "n/a",
      "eye_colors": "n/a",
      "average_lifespan": "indefinite",
      "homeworld": null,
      "language": "n/a",
      "people": [
        "http://swapi.dev/api/people/2/",
        "http://swapi.dev/api/people/3/",
        "http://swapi.dev/api/people/8/",
        "http://swapi.dev/api/people/23/"
      ],
      "films": [
        "http://swapi.dev/api/films/1/",
        "http://swapi.dev/api/films/2/",
        "http://swapi.dev/api/films/3/",
        "http://swapi.dev/api/films/4/",
        "http://swapi.dev/api/films/5/",
        "http://swapi.dev/api/films/6/"
      ],
      "created": "2014-12-10T15:16:16.259000Z",
      "edited": "2014-12-20T21:36:42.139000Z",
      "url": "http://swapi.dev/api/species/2/"
    }
  }
}
```