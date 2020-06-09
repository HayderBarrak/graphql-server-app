package com.graphql.graphqlapp.Queries;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.graphqlapp.Entity.Vehicle;
import com.graphql.graphqlapp.Repository.VehicleRepository;
import com.graphql.graphqlapp.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class VehicleMutation implements GraphQLMutationResolver {

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private VehicleRepository vehicleRepository;

    public Vehicle createVehicle(final String type, final String modelCode, final String brandName, final String launchDate) {
        return this.vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

    @Transactional
    public Vehicle updateVehicle(Vehicle vehicle) {
        Vehicle vehicle1 = vehicleRepository.getOne(vehicle.getId());
        vehicle1.setType(vehicle.getType());
        vehicle1.setBrandName(vehicle.getBrandName());
        vehicle1.setModelCode(vehicle.getModelCode());
        return vehicle1;
    }

    public int deleteVehicle(int id) {
        return this.vehicleService.deleteVehicle(id);
    }


}
