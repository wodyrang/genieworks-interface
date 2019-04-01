package net.genieworks.ginterface.product.service;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.product.repository.ProductRepository;
import org.springframework.stereotype.Service;

/**
 * 상품 관련 처리 Service.
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    @NonNull
    private final ProductRepository productRepository;









}
