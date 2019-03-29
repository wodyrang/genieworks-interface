package net.genieworks.ginterface.product.component;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.product.collector.ProductCollector;
import net.genieworks.ginterface.product.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 상품 정보 수집 Class.
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class ExternalProductCollector {

    @NonNull
    private final ProductService productService;

    @Setter
    private List<ProductCollector> productCollector;






}
