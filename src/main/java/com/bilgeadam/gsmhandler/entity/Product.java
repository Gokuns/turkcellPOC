package com.bilgeadam.gsmhandler.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Document(value = "Product")
public class Product {
    @Id
    private String id;
    @Indexed(unique=true)
    private String number;


}
