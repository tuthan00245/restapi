package net.javaguides.ttk.repository;

import net.javaguides.ttk.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
