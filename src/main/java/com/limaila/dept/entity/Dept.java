package com.limaila.dept.entity;

import com.limaila.emp.entity.Emp;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Integer deptNo;

    private String deptName;

    private Date deptCreateTime;

    /**
     * 级联查询懒加载
     */
    private List<Emp> emps;
}
