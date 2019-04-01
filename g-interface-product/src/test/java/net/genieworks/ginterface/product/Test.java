package net.genieworks.ginterface.product;

import lombok.extern.slf4j.Slf4j;
import net.genieworks.ginterface.product.model.domain.Product;
import net.genieworks.ginterface.product.repository.ProductRepository;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Test {

    @Autowired
    private ProductRepository productRepository;


    @org.junit.Test
    public void test() {

        List<Product> list = this.productRepository.findByName("ddd");

        if (CollectionUtils.isEmpty(list)) {
            log.debug("조회 결과가 없습니다.");
        } else {
            log.debug("조회 결과 : {}", list.size());
        }


        long count = this.productRepository.count();
        log.debug("count is {}", count);

    }

}
