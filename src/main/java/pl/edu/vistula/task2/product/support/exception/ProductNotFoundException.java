package pl.edu.vistula.task2.product.support.exception;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(Long id) {
        super(String.format("Product not found", id));
    }
}

