package com.limaila.dept.mapper;

import com.limaila.dept.entity.Dept;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
public interface DeptMapper {

    int addDept(Dept dept);

    int updateDept(Dept dept);

    int deleteDept(Integer deptNo);

    Dept getOneDept(Integer deptNo);

    List<Dept> getAllDept(String deptName);

    Map<String,Object> getAllObjectMap(String deptName);

    @MapKey("deptNo")
    Map<Integer,Dept> getAllDeptMap(String deptName);

    List<Dept> getDeptArray(@Param("deptNos") Integer [] deptNos);

    List<Dept> getDeptList(@Param("deptNos") List<Integer> deptNos);

    Dept getDeptParams(@Param("deptNo") Integer deptNo, @Param("deptName") String deptName);

    List<Dept> getDeptMap(Map<String,Object> map);

    Dept getDeptEmps(Integer deptNo);
}
