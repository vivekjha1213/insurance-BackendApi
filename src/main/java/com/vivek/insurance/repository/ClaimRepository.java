package com.vivek.insurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vivek.insurance.model.Claim;

@Repository
public interface ClaimRepository extends JpaRepository<Claim, String> {
}
