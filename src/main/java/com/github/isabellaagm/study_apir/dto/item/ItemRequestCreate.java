package com.github.isabellaagm.study_apir.dto.item;

import java.math.BigDecimal;

public class ItemRequestCreate {
    private Long productId;
    private BigDecimal price;
    private BigDecimal quantity;
    
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getQuantity() {
        return quantity;
    }
    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    
}
