package com.graphql.graphqlapp.Repository;

import com.graphql.graphqlapp.Entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

    List<Vehicle> getByBrandName(String brand);

}
