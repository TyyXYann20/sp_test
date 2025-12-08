package com.camb.roma.util;

import com.camb.roma.dto.BrandDTO;
import com.camb.roma.entity.Brand;

public class Mapper {

    public static Brand toEntity(BrandDTO dto){
        Brand brand = new Brand();
        brand.setId(dto.getId());
        brand.setName(dto.getName());

        return brand;
    }
    
}
