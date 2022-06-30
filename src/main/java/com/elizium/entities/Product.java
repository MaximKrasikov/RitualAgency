package com.elizium.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;

@Entity
@Table(name = "products")
@Data
public class Product {
    @Id
    @GeneratedValue( strategy = GenerationType.SEQUENCE, generator = "PRODUCT_SEQ_GENERATOR")
    @SequenceGenerator(name = "PRODUCT_SEQ_GENERATOR", sequenceName = "PRODUCT_SEQ", allocationSize = 10)
    private Integer id;

    @NotBlank
    @Column(name = "product_name")
    private String name;

    @NotBlank
    @Column(name = "pathPicture")
    private String pathToPic;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;

    private ProductCategory category;

}
