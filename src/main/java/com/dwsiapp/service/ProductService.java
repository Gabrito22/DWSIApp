package com.dwsiapp.service;

import com.dwsiapp.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public Product save(Product product);
    public Optional<Product> get(Integer id); //optional nos permite ver si ese producto se encuentra en la BBDD
    public void update(Product product);
    public void delete(Integer id);

    public List<Product> findAll();
}
