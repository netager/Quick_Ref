package kr.co.jbbank.testproject.data.dto;

import kr.co.jbbank.testproject.data.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ProductDto {
    private String productId;
    private String productName;
    private int productPrice;
    private int productStock;

    public Product toEntity() {
        return Product.builder()
            .productId(productId)
            .productName(productName)
            .productPrice(productPrice)
            .productStock(productStock)
            .build();
    }
}
