<h1 align="center">
    graphql-primer
</h1>
<p align="center">
    <a href="https://github.com/surajcm/graphql-primer/commits/" title="Last Commit"><img src="https://img.shields.io/github/last-commit/surajcm/graphql-primer?style=flat"></a>
    <a href="https://github.com/surajcm/graphql-primer/actions/workflows/test.yml" title="Tests"><img src="https://github.com/surajcm/graphql-primer/actions/workflows/test.yml/badge.svg"></a>
    <a href="https://github.com/surajcm/graphql-primer/blob/master/LICENSE" title="License"><img src="https://img.shields.io/badge/License-MIT-green.svg?style=flat"></a>
</p>
A basic GraphQL API based on spring-boot.

##### Initial Setup
Set the environment variables: 
M2_HOME, JAVA_HOME etc

> Please note that this project uses java 15 by default. This may work with older java, use with your own risk.


##### Build command :
`./mvnw clean build`

##### To Run the application :
`./mvnw spring-boot:run`

##### If you have a ~/.m2/settings.xml that points to your organisations maven repo, and wants to use the public maven repo
`./mvnw -s settings.xml spring-boot:run`

### Swagger UI
Please find the REST endpoint at http://localhost:8090/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config

### GraphiQL UI
Please find the GraphiQL endpoint at http://localhost:8090/graphiql

<details>
  <summary>
    Sample Film Response
  </summary>
    <a href="https://github.com/surajcm/graphql-primer/blob/main/dev/film_response.json">film_response.json</a>
</details>

<details>
  <summary>
    Sample AllFilms Response
  </summary>
    <a href="https://github.com/surajcm/graphql-primer/blob/main/dev/allFilms_response.json">allFilms_response.json</a>
</details>

### Sample requests and responses on graphiql
Sample requests and responses can be found [here](https://github.com/surajcm/graphql-primer/blob/main/dev/)


