package com.bilgeadam.gsmhandler.controller;

import com.bilgeadam.gsmhandler.entity.Product;
import com.bilgeadam.gsmhandler.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class ProductControllerTest {

    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Test
    public void shouldGetProductList() {
        productController.getProductList();
        verify(productService,times(1)).getProductList();
    }

    @Test
    public void shouldUpdateProductInfo() {
        List<String> lst = new ArrayList();
        lst.add("");
        productController.updateProductInfo(lst);
        verify(productService,times(1)).getProductList();

    }
}