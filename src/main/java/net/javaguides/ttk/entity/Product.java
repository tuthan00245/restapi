package net.javaguides.ttk.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "productName")
    private String name;

//    @Column(name = "category")
    private String category;
    private String brand;
    private String price;

    @Column(columnDefinition = "TEXT")
//    @Column(name="description")
    private String description;
    private String imageFileName;
    private Date createdAt;

//    @Column(name="qty")
    private long qty;

//    @Column(name="amount")
    private long amount;

}
