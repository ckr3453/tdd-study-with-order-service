package me.ckr.productorderservice.product;

import org.springframework.util.Assert;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : Product
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
class Product {
    private final String name;
    private final int price;
    private final DiscountPolicy discountPolicy;
    private Long id;

    public Product(final AddProductRequest request) {
        Assert.hasText(request.name(), "상품명은 필수입니다.");
        Assert.isTrue(request.price() > 0, "상품 가격은 0보다 커야합니다.");
        Assert.notNull(request.discountPolicy(), "할인 정책은 필수입니다.");
        this.name = request.name();
        this.price = request.price();
        this.discountPolicy = request.discountPolicy();
    }

    public void assignId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public DiscountPolicy getDiscountPolicy() {
        return discountPolicy;
    }

    public Long getId() {
        return id;
    }
}
