package com.limaila.product.mapper;

import com.limaila.product.entity.ProductSku;
import org.apache.ibatis.annotations.Param;

/**
 * @author xulongchao
 * @cdate 2019/4/17
 * @email master@xlchao.com
 */
public interface ProductSkuMapper {

    ProductSku getProductSkuJoinTable(@Param("id") Integer id);

    ProductSku getProductSkuLazySQL(@Param("id") Integer id);
}
