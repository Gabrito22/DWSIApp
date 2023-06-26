package com.dwsiapp.service;

import com.dwsiapp.models.Product;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ProductService {
    public Product save(Product product);
    public Optional <Product> get(Integer id); //optional helps us to know if the products really exists in the DataBase
    public void update(Product product);
    public void delete(Integer id);
}
