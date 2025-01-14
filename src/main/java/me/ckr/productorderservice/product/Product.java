package me.ckr.productorderservice.product;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : Product
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
@Entity
@Table(name = "products")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private DiscountPolicy discountPolicy;

    public Product(final AddProductRequest request) {
        Assert.hasText(request.name(), "상품명은 필수입니다.");
        Assert.isTrue(request.price() > 0, "상품 가격은 0보다 커야합니다.");
        Assert.notNull(request.discountPolicy(), "할인 정책은 필수입니다.");
        this.name = request.name();
        this.price = request.price();
        this.discountPolicy = request.discountPolicy();
    }
}
