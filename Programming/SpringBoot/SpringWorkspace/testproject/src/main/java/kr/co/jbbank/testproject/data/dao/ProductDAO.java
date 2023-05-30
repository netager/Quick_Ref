package kr.co.jbbank.testproject.data.dao;

import kr.co.jbbank.testproject.data.entity.Product;

public interface ProductDAO {

    Product saveProduct(Product product);

    Product getProduct(String productId);
    
}
