package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.Menu;
import com.bilgeadam.gsmhandler.entity.Product;
import com.bilgeadam.gsmhandler.entity.ServiceRequest;
import com.bilgeadam.gsmhandler.repository.ProductRepository;
import com.bilgeadam.gsmhandler.repository.ServiceRequestRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;



import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Mock
    private ServiceRequestRepository serviceRequestRepository;

    @Mock
    private ServiceRequestService serviceRequestService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void shouldGetProductList(){
        List<Product> productList = productService.getProductList();
        assertNotNull(productList) ;
    }

    @Test
    public void shouldUpdateProducts(){
        List<Product> prodList = new ArrayList<Product>();
        Product p = new Product();
        p.setId("1");
        p.setNumber("05354440000");
        prodList.add(p);
        when(productRepository.findByNumber(any())).thenReturn(Optional.of(p));
        productService.updateProductInfo("05354440000",prodList);
        verify(productRepository,times(1)).save(any());
    }

    @Test
    public void shouldNotUpdateProducts(){
        List<Product> prodList = new ArrayList<Product>();
        Product p = new Product();
        p.setId("1");
        p.setNumber("05354440000");
        prodList.add(p);
        productService.updateProductInfo("05354440001",prodList);
        verify(productRepository,times(0)).save(any());
    }
}