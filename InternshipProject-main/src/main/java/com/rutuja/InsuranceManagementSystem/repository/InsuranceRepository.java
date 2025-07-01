package com.rutuja.InsuranceManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutuja.InsuranceManagementSystem.domain.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer> {
}
