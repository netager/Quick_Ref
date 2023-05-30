package kr.co.jbbank.hubproject.data.dto;

import kr.co.jbbank.hubproject.data.entity.ProductEntity;
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

    public ProductEntity toEntity() {
        return ProductEntity.builder()
            .productId(productId)
            .productName(productName)
            .productPrice(productPrice)
            .productStock(productStock)
            .build();
    }
}
