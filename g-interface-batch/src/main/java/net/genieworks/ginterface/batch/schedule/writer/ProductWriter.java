package net.genieworks.ginterface.batch.schedule.writer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.batch.model.domain.Product;
import net.genieworks.ginterface.batch.service.ProductService;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 인터페이스 전용 상품 등록 (Writer)
 */
@Slf4j @Component
@RequiredArgsConstructor
public class ProductWriter implements ItemWriter<List<Product>> {

    /** 상품 Service. */
    private final ProductService productService;

    /**
     * 인터페이스 전용 상품으로 변환된 정보를 등록함.
     * @param items 수집되어 저장할 상품 정보 목록.
     * @throws Exception
     */
    @Override
    public void write(final List<? extends List<Product>> items) throws Exception {

        // TODO : 상품 목록을 저장처리함.

    }
}
