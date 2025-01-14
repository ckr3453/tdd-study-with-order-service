package me.ckr.productorderservice.product;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductService
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
@Component
class ProductService {
    private final ProductPort productPort;

    ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    @Transactional
    public void addProduct(final AddProductRequest request) {
        Product product = new Product(request);
        productPort.save(product);
    }
}
