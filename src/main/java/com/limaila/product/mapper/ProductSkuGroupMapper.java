package com.limaila.product.mapper;

import com.limaila.product.entity.ProductSkuGroup;
import org.apache.ibatis.annotations.Param;

/**
 * @author xulongchao
 * @cdate 2019/4/17
 * @email master@xlchao.com
 */
public interface ProductSkuGroupMapper {

    ProductSkuGroup getProductGroup(@Param("id") Integer id);

}
