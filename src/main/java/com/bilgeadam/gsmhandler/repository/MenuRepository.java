package com.bilgeadam.gsmhandler.repository;

import com.bilgeadam.gsmhandler.entity.Menu;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.*;

public interface MenuRepository extends MongoRepository<Menu,String> {
    public Optional<Menu> findByName(String name);
}
