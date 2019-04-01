package net.genieworks.ginterface.product.repository;

import net.genieworks.ginterface.product.model.domain.Product;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

import static net.genieworks.ginterface.product.model.domain.QProduct.product;

public class ProductRepositoryQuerydslImpl extends QuerydslRepositorySupport implements ProductRepositoryQuerydsl {

    public ProductRepositoryQuerydslImpl() {
        super(Product.class);
    }

    @Override
    public List<Product> findByName(String productName) {
        return super.from(product)
                .where(product.productName.eq(productName))
                .fetch();
    }
}
