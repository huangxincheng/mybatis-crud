package com.limaila.emp.mapper;

import com.limaila.emp.entity.Emp;

import java.util.List;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
public interface EmpMapper {

    List<Emp> seleltByDid(Integer did);
}
