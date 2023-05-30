package kr.co.jbbank.testproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jbbank.testproject.data.dto.ProductDto;
import kr.co.jbbank.testproject.data.entity.Product;
import kr.co.jbbank.testproject.data.handler.ProductDataHandler;
import kr.co.jbbank.testproject.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    ProductDataHandler productDataHandler;

    @Autowired
    public ProductServiceImpl(ProductDataHandler productDataHandler) {
        this.productDataHandler = productDataHandler;
    }

    @Override
    public ProductDto saveProduct(String productId, String productName, int productPrice, int productStock) {
        Product product = productDataHandler.saveProduct(productId, productName, productPrice, productStock);

        ProductDto productDto = new ProductDto(product.getProductId(),
            product.getProductName(), product.getProductPrice(), product.getProductStock());
        
        return productDto;
    }

    @Override
    public ProductDto getProduct(String productId) {
        Product product = productDataHandler.getProduct(productId);

        ProductDto productDto = new ProductDto(product.getProductId(),
        product.getProductName(), product.getProductPrice(), product.getProductStock());

        return productDto;
    }
    
}
