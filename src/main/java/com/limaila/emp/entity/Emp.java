package com.limaila.emp.entity;

import com.limaila.dept.entity.Dept;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@Data
@Accessors(chain = true)
public class Emp {

    private Integer empNo;

    private String empName;

    private Integer empAge;

    private Integer empSex;

    private Integer did;

    private Dept dept;
}
