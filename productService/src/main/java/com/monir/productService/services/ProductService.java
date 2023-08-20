package com.monir.productService.services;


import com.monir.productService.model.ProductRequest;
import com.monir.productService.model.ProductResponse;

public interface ProductService {
    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);
}
