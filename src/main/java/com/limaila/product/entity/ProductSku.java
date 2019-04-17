package com.limaila.product.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author xulongchao
 * @cdate 2019/4/17
 * @email master@xlchao.com
 */
@Data
public class ProductSku implements Serializable {

    private Integer id;

    private String thumbnail;

    private BigDecimal money;

    private Integer num;

    private Date ctime;

    private Date utime;

    private String extra_info;

    private Integer sku_group_id;

    private ProductSkuGroup productSkuGroup;
}
