<h1 align="center">
    graphql-primer
</h1>

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

<details>
  <summary>
    Sample Film Response
  </summary>
    <a href="https://github.com/surajcm/graphql-primer/blob/main/dev/film_response.json">request.json</a>
</details>

<details>
  <summary>
    Sample AllFilms Response
  </summary>
    <a href="https://github.com/surajcm/graphql-primer/blob/main/dev/allFilms_response.json">response.json</a>
</details>



