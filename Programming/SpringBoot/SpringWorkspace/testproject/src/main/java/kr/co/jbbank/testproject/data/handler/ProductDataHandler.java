package kr.co.jbbank.testproject.data.handler;

import kr.co.jbbank.testproject.data.entity.Product;

public interface ProductDataHandler {
    
    Product saveProduct(String productId, String productName, int productPrice, int productStock);
    
    Product getProduct(String productId);
}
