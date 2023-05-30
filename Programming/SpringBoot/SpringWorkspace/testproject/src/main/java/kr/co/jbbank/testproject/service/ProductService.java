package kr.co.jbbank.testproject.service;

import kr.co.jbbank.testproject.data.dto.ProductDto;

public interface ProductService {

    ProductDto saveProduct(String productId, String productName, int productPrice, int productStock);

    ProductDto getProduct(String productId);
    
}
