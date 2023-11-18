package com.tharinduepaz.productservice.repository;

import com.tharinduepaz.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

//there are two generic arguments passed into this interface extension Product is the model and String is the data type of the primary key of that model
public interface ProductRepository extends MongoRepository<Product, String> {

}
