package kr.co.jbbank.testproject.data.handler.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.co.jbbank.testproject.data.dao.ProductDAO;
import kr.co.jbbank.testproject.data.entity.Product;
import kr.co.jbbank.testproject.data.handler.ProductDataHandler;

@Service
@Transactional
public class ProductDataHandlerImpl implements ProductDataHandler{
    
    ProductDAO productDAO;

    @Autowired
    public ProductDataHandlerImpl(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @Override
    public Product saveProduct(String productId, String productName, int productPrice, int productStock) {
        
        Product productEntity = new Product(productId, productName, productPrice, productStock);
        
        return productDAO.saveProduct(productEntity);
    }

    @Override
    public Product getProduct(String productId) {
        return productDAO.getProduct(productId);
    }
}
