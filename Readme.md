# GraphSpringApp

#### Create
mutation {
  createVehicle(type: "car", modelCode: "XYZ0192", brandName: "XYZ", launchDate: "2016-08-16") 
  {
    id
  }
}
--------------------------
#### update
mutation update($input: UpdateVehicleInput){
  updateVehicle(input:$input){
    id,
    type,
    modelCode
    brandName
  }
}

#### input update (query variable)
{
  "input": {
    "id": 2,
    "type": "hayder",
    "modelCode": "hayder",
    "brandName": "hayder"
  }
}

---------------------------
#### query getall()
query getall {
 getAllVehicles{
  id,
  type,
  brandName
}
}
--------------------------
#### get ById()
query getVehicleById{
  vehicle(id: 2) 
  {
    id, 
    type, 
    modelCode
	}
}
------------------
#### count
{
  vehicles(count: 5) {
    id
    type
    modelCode
  }
}
----------------------------
#### Delete
mutation {
  deleteVehicle(id:2)
}
--------------------
#### getByName
query getByName {
  getVehicleByBrand(brandName: "XYZ"){
    id,
    type
  }
}
-------------------------
#### Links

https://dimitr.im/graphql-mutations-spring

https://itnext.io/beginners-guide-to-graphql-with-spring-boot-69d229e87b19