package com.limaila;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.limaila.dept.entity.Dept;
import com.limaila.dept.mapper.DeptMapper;
import com.limaila.emp.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class DeptTest {

    @Autowired
    private DeptMapper deptMapper;

    @Test
    public void testAddDept() {
        Dept dept = new Dept().setDeptName("111").setDeptCreateTime(new Date());
        deptMapper.addDept(dept);
        log.info("====================================================== dept = " + dept.toString());
    }

    @Test
    public void testUpdateDept() {
        Dept dept = new Dept().setDeptNo(2).setDeptName("xxx" + new Random(10).nextInt()).setDeptCreateTime(new Date());
        int row = deptMapper.updateDept(dept);
        log.info("====================================================== row = " + row);
    }

    @Test
    public void testDeleteDept() {
        int row = deptMapper.deleteDept(3);
        log.info("====================================================== row = " + row);
    }

    @Test
    public void testGetOneDept() {
        Dept dept = deptMapper.getOneDept(2);
        log.info("====================================================== dept = " + dept.toString());
    }

    @Test
    public void testGetAllDept() {
        List<Dept> depts = deptMapper.getAllDept("xxx");
        log.info("====================================================== dept = " + depts.toString());
    }

    @Test
    public void testGetAllObjectMap() throws JsonProcessingException {
        Map<String, Object> allObjectMap = deptMapper.getAllObjectMap("xxx");
        allObjectMap.forEach((i, o) -> {
            log.info("======================================================i = " + i + " o = " + o);
        });
    }

    @Test
    public void testGetAllDeptMap() throws JsonProcessingException {
        Map<Integer, Dept> allObjectMap = deptMapper.getAllDeptMap("%x%");
        allObjectMap.forEach((i, dept) -> {
            log.info("====================================================== i = " + i + " dept = " + dept);
        });
    }


    @Test
    public void testGetDeptArray() {
        Integer[] deptNos = new Integer[]{2,4};
        List<Dept> deptArray = deptMapper.getDeptArray(deptNos);
        log.info("====================================================== deptArray = " + deptArray.toString());
    }

    @Test
    public void testGetDeptList() {
        List<Integer> deptNos = new ArrayList<>();
        deptNos.add(2);
        deptNos.add(4);
        List<Dept> deptArray = deptMapper.getDeptList(deptNos);
        log.info("====================================================== deptArray = " + deptArray.toString());
    }

    @Test
    public void testGetDeptParams() {
        Dept dept = deptMapper.getDeptParams(2, "xxx");
        log.info("====================================================== dept = " + dept);
    }

    @Test
    public void testGetDeptMap() {
        Map<String,Object> map = new HashMap();
        map.put("deptNo",2);
        map.put("deptName", "xxx");
        List<Dept> deptMap = deptMapper.getDeptMap(map);
        log.info("====================================================== deptMap = " + deptMap);
    }


    @Test
    public void testGetDeptEmps() {
        Dept deptEmps = deptMapper.getDeptEmps(2);
//        log.info("====================================================== deptEmps = " + deptEmps);
        log.info(deptEmps.getDeptName());
        log.info(deptEmps.getEmps() + "");
    }




}
