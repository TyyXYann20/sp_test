package com.camb.roma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.camb.roma.entity.Brand;
import com.camb.roma.repository.BrandRepository;
import com.camb.roma.services.BrandService;

@Service
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public Brand create(Brand brand){
        return brandRepository.save(brand);
    }
    
}
