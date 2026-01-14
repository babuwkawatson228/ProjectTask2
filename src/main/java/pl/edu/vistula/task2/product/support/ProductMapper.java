package pl.edu.vistula.task2.product.support;

import org.springframework.stereotype.Component;
import pl.edu.vistula.task2.product.api.request.ProductRequest;
import pl.edu.vistula.task2.product.api.request.UpdateProductRequest;
import pl.edu.vistula.task2.product.api.response.ProductResponse;
import pl.edu.vistula.task2.product.domain.Product;


@Component
public class ProductMapper {
    public Product toProduct(ProductRequest productRequest){
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        return product;
    }

    public Product toProduct(Product product, UpdateProductRequest updateProductRequest){
        product.setName(updateProductRequest.getName());
        product.setId(updateProductRequest.getId());
        product.setPrice(updateProductRequest.getPrice());
        return product;
    }

    public ProductResponse toProductResponse(Product product){
        return new ProductResponse(product.getId(), product.getName(), product.getPrice());
    }

}

