package me.ckr.productorderservice.product;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductRepository
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
@Repository
class ProductRepository {
    private Long sequence = 0L;
    private final Map<Long, Product> persistenceMap = new HashMap<>();

    public void save(final Product product) {
        product.assignId(++sequence);
        persistenceMap.put(product.getId(), product);
    }
}
