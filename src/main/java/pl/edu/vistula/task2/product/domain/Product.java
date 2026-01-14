package pl.edu.vistula.task2.product.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;

import java.math.BigDecimal;


@Entity(name = "products")
public class Product {
    @Id
    @GeneratedValue

    private Long id;
    private String name;
    private BigDecimal price;
    public Product() {
        this.name = name;
        this.price = price;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public BigDecimal getPrice() {return price;}
    public void setPrice(BigDecimal price) {this.price = price;}
}
