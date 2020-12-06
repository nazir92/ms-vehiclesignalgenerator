package com.alten.signalgenerator.job;


import com.alten.signalgenerator.client.VehicleServiceClient;
import com.alten.signalgenerator.client.response.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class VehicleSignalGeneratorJob {


    private VehicleServiceClient vehicleServiceClient;
    private static final Logger LOGGER = LoggerFactory.getLogger(VehicleSignalGeneratorJob.class);

    @Autowired
    public VehicleSignalGeneratorJob(VehicleServiceClient vehicleServiceClient) {
        this.vehicleServiceClient = vehicleServiceClient;
    }

    @Scheduled(fixedDelay = 60000)
    public void startSignalGeneratorJob() {
        LOGGER.info("Signal Generator job started!");

        List<Vehicle> vehicles = vehicleServiceClient.getAllVehicles();

        Random random = new Random();

        int index = random.nextInt(vehicles.size());

        String vehicleId = vehicles.get(index).getVehicleId();
        LOGGER.info("Ping request is sending to from vehicle: {}", vehicleId);


        vehicleServiceClient.ping(vehicleId);


    }
}
