package com.example.vehicle_insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle_insurance.Bean.UserVehicleDetails;

public interface UserVehicleDetailsRepository extends JpaRepository<UserVehicleDetails, Long> {
}