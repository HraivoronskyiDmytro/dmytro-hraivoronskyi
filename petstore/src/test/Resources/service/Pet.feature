Feature: Pet API

 Background:
   * def env = read('Environment.csv')
   * url karate.jsonPath(env,"$[?(@.Name=='baseUri')].Value")[0]
   * def pet = karate.jsonPath(env,"$[?(@.Name=='Pet')].Value")[0]

   * def petSchema =
   """
   {
  "id": 10,
  "name": "doggie",
  "category": {
    "id": 1,
    "name": "Dogs"
  },
  "photoUrls":#[],
  "tags": [
    '#object'
  ],
  "status": "available"
}
   """

   * def petSchemaUpdated =
   """
   {
  "id": 10,
  "name": "doggie",
  "category": {
    "id": 1,
    "name": "Dogs"
  },
  "photoUrls":#[],
  "tags": [
    '#object'
  ],
  "status": "sold"
}
   """

  Scenario: Add New Pet
    Given path pet
    And request {"id": 10,"name": "doggie","category": {"id": 1,"name": "Dogs"},"photoUrls": ["string"],"tags": [{"id": 0,"name": "string"}],"status": "available"}
    When method post
    Then status 200
    And match response == petSchema
    When path pet+"/10"
    And method get
    Then status 200
    And match response == petSchema

  Scenario: Update Pet
    Given path pet
    And request {"id": 10,"name": "doggie","category": {"id": 1,"name": "Dogs"},"photoUrls": ["string"],"tags": [{"id": 0,"name": "string"}],"status": "sold"}
    When method post
    Then status 200
    And match response == petSchemaUpdated
    When path pet+"/10"
    And method get
    Then status 200
    And match response == petSchemaUpdated

  Scenario: Delete Pet By ID
    Given path pet+"/10"
    When method delete
    Then status 200
    And match response == "Pet deleted"
    When path pet+"/10"
    And method get
    Then status 404
    And match response == "Pet not found"



