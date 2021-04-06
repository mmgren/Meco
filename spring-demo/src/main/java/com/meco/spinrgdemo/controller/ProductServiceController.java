package com.meco.spinrgdemo.controller;

import com.meco.spinrgdemo.pojo.Product;
import com.meco.spinrgdemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/product")
public class ProductServiceController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getProduct")
    public ResponseEntity<Object> getProduct(){
        return new ResponseEntity<>(productService.getProducts(), HttpStatus.OK);
    }

    @RequestMapping(value="/updateProduct/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable("id") String id, @RequestBody Product product){
        productService.updateProduct(id, product);
        return new ResponseEntity<>("Product is update successfully", HttpStatus.OK);
    }

    @RequestMapping("/deleteProduct/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable("id") String id){
        productService.deleteProduct(id);
        return new ResponseEntity<>("Product is deleted successfully", HttpStatus.OK);
    }

    @RequestMapping(value="/addProduct", method = RequestMethod.POST)
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        productService.createProduct(product);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.OK);
    }
}
