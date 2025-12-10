package com.camb.roma.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.camb.roma.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository < Brand, Integer> {
}
