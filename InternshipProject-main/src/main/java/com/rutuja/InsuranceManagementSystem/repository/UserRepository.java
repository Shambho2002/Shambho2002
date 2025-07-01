package com.rutuja.InsuranceManagementSystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rutuja.InsuranceManagementSystem.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
