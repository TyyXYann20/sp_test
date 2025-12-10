package com.camb.roma.services;
import com.camb.roma.entity.Brand;

public interface BrandService {
    Brand create(Brand brand);
    Brand getById(Integer id);
}
