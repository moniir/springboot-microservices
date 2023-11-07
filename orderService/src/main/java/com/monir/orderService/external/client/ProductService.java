package com.monir.orderService.external.client;

import com.monir.orderService.exception.CustomException;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE/product")
public interface ProductService {

    @PutMapping("/reduceQuantity/{id}")
    ResponseEntity<Void> reduceQuantity(
            @PathVariable("id") long productId,
            @RequestParam long quantity
    );
    //default method for product-service fallback.
    default ResponseEntity<Long> fallback(Exception e) {
        throw new CustomException("Product Service is not available",
                "UNAVAILABLE",
                500);
    }

}