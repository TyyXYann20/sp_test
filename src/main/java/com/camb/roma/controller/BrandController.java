package com.camb.roma.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.camb.roma.dto.BrandDTO;
import com.camb.roma.entity.Brand;
import com.camb.roma.services.BrandService;
import com.camb.roma.util.Mapper;

@RestController
@RequestMapping("brands")
public class BrandController {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody BrandDTO brandDTO) {
        Brand brand = Mapper.toEntity(brandDTO);
        brand = brandService.create(brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getOneBrand(@PathVariable("id") Integer brandId) {
        Brand brand = brandService.getById(brandId);
        return ResponseEntity.ok(Mapper.toBrandDTO(brand));
    }


    @PutMapping("{id}")
    public ResponseEntity<?> updateBrand(@PathVariable("id") Integer brandId, @RequestBody BrandDTO brandDTO) {
        Brand brand = Mapper.toEntity(brandDTO);
        Brand updatedBrand = brandService.update(brandId, brand);
        return ResponseEntity.ok(Mapper.toBrandDTO(updatedBrand));
    }
}

