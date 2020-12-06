package com.alten.signalgenerator.client;

import com.alten.signalgenerator.client.response.Vehicle;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@FeignClient(name = "VehicleServiceClient", url = "${vehicle.service.url}")
public interface VehicleServiceClient {


    @GetMapping("/vehicles")
    List<Vehicle> getAllVehicles();


    @PutMapping("/vehicles/ping/{vehicle-id}")
    void ping(@PathVariable("vehicle-id") String vehicleId);
}
