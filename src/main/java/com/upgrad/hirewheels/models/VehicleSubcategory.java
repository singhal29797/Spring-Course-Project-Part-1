package com.upgrad.hirewheels.models;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class VehicleSubcategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vehicleSubcategoryId;

    @Column(nullable = false, unique = true)
    private String vehicleSubcategoryName;

    @Column(nullable = false)
    private int pricePerHour;

    @ManyToOne
    private VehicleCategory vehicleCategory;

    public int getVehicleSubcategoryId() {
        return vehicleSubcategoryId;
    }

    public void setVehicleSubcategoryId(int vehicleSubcategoryId) {
        this.vehicleSubcategoryId = vehicleSubcategoryId;
    }

    public String getVehicleSubcategoryName() {
        return vehicleSubcategoryName;
    }

    public void setVehicleSubcategoryName(String vehicleSubcategoryName) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }


    public VehicleSubcategory() {}

    public VehicleSubcategory(String vehicleSubcategoryName, int pricePerHour) {
        this.vehicleSubcategoryName = vehicleSubcategoryName;
        this.pricePerHour = pricePerHour;
    }

    @Override
    public String toString() {
        return "VehicleSubcategory{" +
                "vehicleSubcategoryId=" + vehicleSubcategoryId +
                ", vehicleSubcategoryName='" + vehicleSubcategoryName + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VehicleSubcategory that = (VehicleSubcategory) o;
        return vehicleSubcategoryId == that.vehicleSubcategoryId &&
                pricePerHour == that.pricePerHour &&
                Objects.equals(vehicleSubcategoryName, that.vehicleSubcategoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vehicleSubcategoryId, vehicleSubcategoryName, pricePerHour);
    }
}
