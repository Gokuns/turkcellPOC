package com.bilgeadam.gsmhandler.repository;

import com.bilgeadam.gsmhandler.entity.Menu;
import com.bilgeadam.gsmhandler.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.*;

public interface ProductRepository extends MongoRepository<Product, String> {
    public Optional<Product> findByNumber(String number);

}
