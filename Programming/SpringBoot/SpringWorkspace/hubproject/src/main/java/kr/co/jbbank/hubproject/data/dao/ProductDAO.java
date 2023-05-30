package kr.co.jbbank.hubproject.data.dao;

import kr.co.jbbank.hubproject.data.entity.ProductEntity;

public interface ProductDAO {
    
    ProductEntity saveProduct(ProductEntity productEntity);

    ProductEntity getProduct(String productId);
}
