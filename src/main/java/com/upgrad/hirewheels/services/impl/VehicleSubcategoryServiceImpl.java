package com.upgrad.hirewheels.services.impl;

import com.upgrad.hirewheels.daos.VehicleSubcategoryDAO;
import com.upgrad.hirewheels.services.VehicleSubcategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleSubcategoryServiceImpl implements VehicleSubcategoryService {

    @Autowired
    private VehicleSubcategoryDAO vehicleSubcategoryDAO;
}
