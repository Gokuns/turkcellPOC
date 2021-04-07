package com.bilgeadam.gsmhandler.service;

import com.bilgeadam.gsmhandler.entity.Product;
import com.bilgeadam.gsmhandler.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ServiceRequestService serviceRequestService;

    public List<Product> getProductList(){
        serviceRequestService.addServiceRequest(2, "getProductList", "ürünler listelendi");
        return productRepository.findAll();

    }

    @Async
    public void updateProductInfo(String num, List<Product> products ){

        Product p = productRepository.findByNumber(num).orElse(null);

        if(p != null) {
            String firstPart = num.substring(0, num.length() - 4);
            String newNum = "";
            while (true) {
                String randNum = getNewRandomNumber();
                newNum = firstPart + randNum;
                if (!checkIfContains(randNum, products)) {
                    break;
                }
            }
            productRepository.deleteById(p.getId());
            p.setNumber(newNum);
            productRepository.save(p);
            serviceRequestService.addServiceRequest(1, "updateProductInfo", num + " başarı ile güncellendi. - "  + Thread.currentThread().getName());
        }
        else{
            serviceRequestService.addServiceRequest(1, "updateProductInfo", num + " mevcut olmadığı için güncellenemedi - " + Thread.currentThread().getName());
        }
    }

    private boolean checkIfContains(String randNum, List<Product> products){

        List<String> numbers = products.stream().map(p -> p.getNumber().substring(0, p.getNumber().length() - 4)).collect(Collectors.toList());
        if(numbers.contains(randNum)) return true;
        else return false;
    }

    private String getNewRandomNumber(){
        String result = "";
        for (int i=0; i<4; i++){
            result += Integer.toString(new Random().nextInt(10));
        }
        return result;
    }
}
