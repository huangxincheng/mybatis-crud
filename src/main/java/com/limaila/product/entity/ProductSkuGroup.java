package com.limaila.product.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author xulongchao
 * @cdate 2019/4/17
 * @email master@xlchao.com
 */
@Data
public class ProductSkuGroup {

    private Integer id;

    private String title;

    private String desc;

    private String thumbnail;

    private String thumbnails;

    private String images;

    private Date ctime;

    private Date utime;

    private String spec_info;

    private String extra_param;
}
