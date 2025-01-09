package me.ckr.productorderservice.product;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductService
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
class ProductService {
    private final ProductPort productPort;

    public ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public void addProduct(final AddProductRequest request) {
        Product product = new Product(request);
        productPort.save(product);
    }
}
