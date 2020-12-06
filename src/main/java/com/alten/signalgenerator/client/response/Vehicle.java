package com.alten.signalgenerator.client.response;

public class Vehicle {

    private String vehicleId;
    private String registrationNumber;
    private Long customerId;
    private Status status;

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId='" + vehicleId + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", customerId=" + customerId +
                ", status=" + status +
                '}';
    }
}
