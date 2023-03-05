package com.product.service;

import com.product.dto.ProductRequest;
import com.product.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    public void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
