package com.chl.mall.mallproduct;

import com.chl.mall.mallproduct.product.entity.BrandEntity;
import com.chl.mall.mallproduct.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("apple");
        boolean save = brandService.save(brandEntity);
        System.out.println(save);
    }

}
