package net.genieworks.ginterface.batch.repository;

import net.genieworks.ginterface.batch.model.domain.Product;

import java.util.List;

public interface ProductRepositoryQuerydsl {
    List<Product> findByName(final String productName);
}
