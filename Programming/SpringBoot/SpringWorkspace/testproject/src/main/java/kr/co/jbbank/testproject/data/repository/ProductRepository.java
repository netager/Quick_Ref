package kr.co.jbbank.testproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.jbbank.testproject.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
    
}
