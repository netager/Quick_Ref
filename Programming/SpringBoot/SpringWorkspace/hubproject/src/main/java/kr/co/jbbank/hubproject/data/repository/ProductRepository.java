package kr.co.jbbank.hubproject.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.co.jbbank.hubproject.data.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {   //<사용할 Entity, Primary column의 type>
    
}
