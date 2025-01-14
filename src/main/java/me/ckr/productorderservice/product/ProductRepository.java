package me.ckr.productorderservice.product;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductRepository
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */

interface ProductRepository extends JpaRepository<Product, Long> {
}
