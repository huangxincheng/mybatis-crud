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

    Emp getEmpDept(Integer empNo);

    List<Emp> selectWhere(Emp emp);

    List<Emp> selectChoose(Emp emp);

    int updateSet(Emp emp);
}
