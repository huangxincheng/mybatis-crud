package com.limaila;

import com.limaila.product.entity.ProductSku;
import com.limaila.product.mapper.ProductSkuMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xulongchao
 * @cdate 2019/4/17
 * @email master@xlchao.com
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductTest {

    @Autowired
    private ProductSkuMapper skuMapper;

    @Test
    public void test() {
        ProductSku productSku = skuMapper.getProductSkuJoinTable(4);
        System.out.println(productSku);
    }

    @Test
    public void test2() {
        ProductSku productSku = skuMapper.getProductSkuLazySQL(4);
        System.out.println(productSku);
    }
}
