package com.meco.spinrgdemo.service.impl;

import com.meco.spinrgdemo.pojo.Product;
import com.meco.spinrgdemo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<String, Product>();
    static {
        Product computer = new Product();
        computer.setId("1");
        computer.setName("mac pro");
        productRepo.put(computer.getId(), computer);

        Product iphone = new Product();
        iphone.setId("2");
        iphone.setName("iphone 12");
        productRepo.put(iphone.getId(), iphone);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(), product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        productRepo.remove(product.getId());
        product.setId(id);
        productRepo.put(id, product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);
    }

    @Override
    public Collection<Product> getProducts() {
        System.out.println("get products");
        return productRepo.values();
    }
}
