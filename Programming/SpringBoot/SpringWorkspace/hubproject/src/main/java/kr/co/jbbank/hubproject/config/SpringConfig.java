package kr.co.jbbank.hubproject.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.jbbank.hubproject.data.repository.ProductRepository;

@Configuration
public class SpringConfig {

    private final ProductRepository productRepository;

    @Autowired
    public SpringConfig(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    @Bean
    public 

    // @Bean
    // public MemberService memberService() {
    //     return new MemberService(memberRepository);
    // }

    /**
     * JPA를 이용한 DB 핸들링
     */
    @Bean
    public ProductRepository productRepository() {
        return new JpaProductRepository(em);
    }


}
