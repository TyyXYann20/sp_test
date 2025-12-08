package com.camb.roma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.camb.roma.dto.BrandDTO;
import com.camb.roma.entity.Brand;
import com.camb.roma.services.BrandService;
import com.camb.roma.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {
    private BrandService brandService;
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO){
        Brand brand = Mapper.toEntity(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(brand);
    }
    
}
