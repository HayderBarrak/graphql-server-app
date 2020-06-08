package com.graphql.graphqlapp.Queries;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.graphqlapp.Entity.Vehicle;
import com.graphql.graphqlapp.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

    public void deleteVehicle (int id){
        this.vehicleService.deleteVehicle(id);
    }



}
