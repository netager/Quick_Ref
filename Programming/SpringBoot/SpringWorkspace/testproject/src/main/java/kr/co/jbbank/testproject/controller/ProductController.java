package kr.co.jbbank.testproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jbbank.testproject.data.dto.ProductDto;
import kr.co.jbbank.testproject.service.ProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/api/v1/product-api")
@RestController
public class ProductController {

    private final ProductService productService;

    // @Autowired
    // public ProductController(ProductService productService) {
    //     this.productService = productService;
    // }
    
    @GetMapping("/product/{productId}")
    public ProductDto getProduct(@PathVariable("productId") String productId) {

        ProductDto productDto = productService.getProduct(productId);

        return productDto;

    }

    @PostMapping("/product")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        String productId = productDto.getProductId();
        String productName = productDto.getProductName();
        Integer productPrice = productDto.getProductPrice();
        Integer productStock = productDto.getProductStock();

        return productService.saveProduct(productId, productName, productPrice, productStock);

    }

    @DeleteMapping("/product/{productId}")
    public ProductDto deleteProduct(@PathVariable String productId) {
        return null;
    }
}
