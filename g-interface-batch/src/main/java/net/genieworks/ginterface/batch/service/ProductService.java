package net.genieworks.ginterface.batch.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.batch.model.domain.Product;
import net.genieworks.ginterface.batch.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 상품 처리 서비스 (공통)
 */
@Slf4j @Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    /**
     * 전체 상품 목록 조회.
     * @return 상품 전체 목록
     */
    public List<Product> getProductList() {
        return this.productRepository.findAll();
    }






}
