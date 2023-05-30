package kr.co.jbbank.testproject.data.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.jbbank.testproject.data.dao.ProductDAO;
import kr.co.jbbank.testproject.data.entity.Product;
import kr.co.jbbank.testproject.data.repository.ProductRepository;

@Service
public class ProductDAOImpl implements ProductDAO {
    
    ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product saveProduct(Product product) {
        productRepository.save(product);
        return product;
    }
    
    @Override
    public Product getProduct(String productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.get();
    }
}
