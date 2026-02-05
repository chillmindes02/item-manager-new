# item-manager

1 add product api - post api
  https://item-manager-new-production.up.railway.app/api/items
  JSON
  {
     "id" : "5",
    "name" : "Parle-g",
    "description" : "description",
     "amt" : 1
 }
 Validation is applied on id and name using Jakarta annotations

 2 Get item by id - GET API
 https://item-manager-new-production.up.railway.app/api/items/5
 this api get item by id 

// Additional
 3. get all api - GET API
 https://item-manager-new-production.up.railway.app/api/items/get-all

 4. delete by id - DELETE API
  https://item-manager-new-production.up.railway.app/api/items/delete-by-id?id=1 
