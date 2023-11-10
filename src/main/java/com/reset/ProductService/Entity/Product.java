package com.reset.ProductService.Entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "product_table")
public class Product {

    @Id
    private Long id;
    private String name;
    private double price;
}
