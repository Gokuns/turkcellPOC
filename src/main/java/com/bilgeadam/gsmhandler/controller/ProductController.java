package com.bilgeadam.gsmhandler.controller;

import com.bilgeadam.gsmhandler.entity.Product;
import com.bilgeadam.gsmhandler.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api
@RequestMapping("/product")
@CrossOrigin("*")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProductList(){
        return productService.getProductList();
    }

    @PostMapping("/update-product-info")
    public void updateProductInfo(@RequestBody List<String> numList){
        List<Product> products =    getProductList();
        for (String num : numList){
            productService.updateProductInfo(num, products);
        }
    }

}
