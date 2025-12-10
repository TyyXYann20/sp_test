package com.camb.roma.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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

    public Brand getById(Integer id){
        // Optional<Brand> brandOptional = brandRepository.findById(id);
        // if (brandOptional.isPresent()){
        //     return brandOptional.get();
        // }
        // else{
        //     throw new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("ID:%d not found in Brand", id));
        // }

        return brandRepository.findById(id).
        orElseThrow(()-> new HttpClientErrorException(HttpStatus.NOT_FOUND, String.format("ID:%d not found in Brand", id)));
    }
    
}
 