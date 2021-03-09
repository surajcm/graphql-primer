#### GraphiQL sample request & response

![screenshot](https://github.com/surajcm/graphql-primer/blob/main/dev/img/graphiql_all_films.png?raw=true)

#### Request
```
query allFilms {
  allFilms {
    count
    results {
      title
      episode_id
      release_date
    }
  }
}
```

#### Query variables
```
```

#### Response
```
{
  "data": {
    "allFilms": {
      "count": 6,
      "results": [
        {
          "title": "A New Hope",
          "episode_id": 4,
          "release_date": "1977-05-25"
        },
        {
          "title": "The Empire Strikes Back",
          "episode_id": 5,
          "release_date": "1980-05-17"
        },
        {
          "title": "Return of the Jedi",
          "episode_id": 6,
          "release_date": "1983-05-25"
        },
        {
          "title": "The Phantom Menace",
          "episode_id": 1,
          "release_date": "1999-05-19"
        },
        {
          "title": "Attack of the Clones",
          "episode_id": 2,
          "release_date": "2002-05-16"
        },
        {
          "title": "Revenge of the Sith",
          "episode_id": 3,
          "release_date": "2005-05-19"
        }
      ]
    }
  }
}
```