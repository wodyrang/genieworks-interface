package net.genieworks.ginterface.batch.repository;

import net.genieworks.ginterface.batch.model.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
