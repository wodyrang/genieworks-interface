package net.genieworks.ginterface.product.repository;

import net.genieworks.ginterface.product.model.domain.Product;

import java.util.List;

public interface ProductRepositoryQuerydsl {
    List<Product> findByName(final String productName);
}
