# Item Manager API
A Spring Boot REST API deployed on the Railway cloud platform to manage items in a list. This API supports CRUD operations with validation using Jakarta annotations and modern Java 8 features.

1. Add Item (POST)
  https://item-manager-new-production.up.railway.app/api/items
  JSON
  {
     "id" : "5",
    "name" : "Parle-g",
    "description" : "description",
     "amt" : 1
 }
 Description   
 Adds a new item to the list.
 Uses @RestController, @RequestMapping, and @RequestBody.
 Validation is applied on id and name using Jakarta annotations to ensure they are not empty.
-----------------------------------------------------------------------------------------------
 2 Get item by id - GET API
 https://item-manager-new-production.up.railway.app/api/items/5
 Description
 Fetches an item by its ID.
 Uses Java 8 features such as stream().filter() to find the item in the list.
-----------------------------------------------------------------------------------------------
 // Additional
 3. get all api - GET API
 https://item-manager-new-production.up.railway.app/api/items/get-all
 Description:
 Retrieves a list of all items in the system.
----------------------------------------------------------------------------------------------
 4. delete by id - DELETE API
 https://item-manager-new-production.up.railway.app/api/items/delete-by-id?id=1
 Description:
 Deletes an item from the list using its ID.
----------------------------------------------------------------------------------------------
