package net.genieworks.ginterface.product.repository;

import net.genieworks.ginterface.product.model.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Product repository interface.
 */
public interface ProductRepository extends JpaRepository<Product, Long>, ProductRepositoryQuerydsl {

}
