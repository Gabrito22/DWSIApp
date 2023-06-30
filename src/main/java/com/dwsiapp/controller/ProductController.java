package com.dwsiapp.controller;


import com.dwsiapp.models.Product;
import com.dwsiapp.models.User;
import com.dwsiapp.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {

    private final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService; //
    @GetMapping("")
    public String show(){
        return "products/show";
    }

    @GetMapping("/create")
    public String create(){
        return "products/create";
    }
    @PostMapping("/save")
    public String save(Product product){
        LOGGER.info("Este es el producto de la vista {}",product);
        User u = new User(1,"","","","","","","");
        product.setUser(u);
        productService.save(product);
        return "redirect:/products";
    }

}
