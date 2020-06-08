package com.graphql.graphqlapp.Queries;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.graphqlapp.Entity.Vehicle;
import com.graphql.graphqlapp.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class VehicleQuery implements GraphQLQueryResolver {

    @Autowired
    private VehicleService vehicleService;

    public List<Vehicle> getVehicles(final int count) {
        return this.vehicleService.getAllVehicles(count);
    }

     public List<Vehicle> getVehicleByBrand(String brand) {
        return this.vehicleService.getVehicleByName(brand);
    }

    public Optional<Vehicle> getVehicle(final int id) {
        return this.vehicleService.getVehicle(id);
    }



}
