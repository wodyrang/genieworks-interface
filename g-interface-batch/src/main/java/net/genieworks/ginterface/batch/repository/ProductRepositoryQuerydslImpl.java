package net.genieworks.ginterface.batch.repository;

import net.genieworks.ginterface.batch.model.domain.Product;
import net.genieworks.ginterface.batch.model.domain.QProduct;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import java.util.List;

public class ProductRepositoryQuerydslImpl extends QuerydslRepositorySupport implements ProductRepositoryQuerydsl {

    public ProductRepositoryQuerydslImpl() {
        super(Product.class);
    }

    @Override
    public List<Product> findByName(String productName) {
        return super.from(QProduct.product)
                .where(QProduct.product.productName.eq(productName))
                .fetch();
    }
}







