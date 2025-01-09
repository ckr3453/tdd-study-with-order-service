package me.ckr.productorderservice.product;

/**
 * packageName : me.ckr.productorderservice.product
 * fileName    : ProductAdaptor
 * author      : ckr
 * date        : 25. 1. 9.
 * description :
 */
class ProductAdaptor implements ProductPort {
    private final ProductRepository productRepository;

    public ProductAdaptor(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void save(final Product product) {
        productRepository.save(product);
    }
}
