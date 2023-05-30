package kr.co.jbbank.hubproject.data.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jbbank.hubproject.data.dao.ProductDAO;
import kr.co.jbbank.hubproject.data.entity.ProductEntity;
import kr.co.jbbank.hubproject.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {

    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductEntity getProduct(String productId) {

        Optional<ProductEntity> productEntity = productRepository.findById(productId);
        return productEntity.get();
    }

    @Override
    public ProductEntity saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
        return productEntity;
    }
    
}
