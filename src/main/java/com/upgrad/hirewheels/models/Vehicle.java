package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleId;

    @Column(nullable = false)
    private String vehicleModel;

    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private int vehicleNumber;

    @Column(nullable = false)
    private int vehicleSubcategoryId;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private int locationId;

    @Column(nullable = false)
    private int fuelTypeId;

    @Column(nullable = false)
    private String vehicleImageUrl;

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getFuelTypeId() {
        return fuelTypeId;
    }

    public void setFuelTypeId(int fuelTypeId) {
        this.fuelTypeId = fuelTypeId;
    }

    public String getVehicleImageUrl() {
        return vehicleImageUrl;
    }

    public void setVehicleImageUrl(String vehicleImageUrl) {
        this.vehicleImageUrl = vehicleImageUrl;
    }

    public Vehicle() {}

    public Vehicle(String vehicleModel, int userId, int vehicleNumber, int vehicleSubcategoryId, String color, int locationId, int fuelTypeId, String vehicleImageUrl) {
        this.vehicleModel = vehicleModel;
        this.userId = userId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSubcategoryId = vehicleSubcategoryId;
        this.color = color;
        this.locationId = locationId;
        this.fuelTypeId = fuelTypeId;
        this.vehicleImageUrl = vehicleImageUrl;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", vehicleModel='" + vehicleModel + '\'' +
                ", userId=" + userId +
                ", vehicleNumber=" + vehicleNumber +
                ", vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", color='" + color + '\'' +
                ", locationId=" + locationId +
                ", fuelTypeId=" + fuelTypeId +
                ", vehicleImageUrl='" + vehicleImageUrl + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return vehicleId == vehicle.vehicleId &&
                userId == vehicle.userId &&
                vehicleNumber == vehicle.vehicleNumber &&
                vehicleSubcategoryId == vehicle.vehicleSubcategoryId &&
                locationId == vehicle.locationId &&
                fuelTypeId == vehicle.fuelTypeId &&
                Objects.equals(vehicleModel, vehicle.vehicleModel) &&
                Objects.equals(color, vehicle.color) &&
                Objects.equals(vehicleImageUrl, vehicle.vehicleImageUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleId, vehicleModel, userId, vehicleNumber, vehicleSubcategoryId, color, locationId, fuelTypeId, vehicleImageUrl);
    }
}
