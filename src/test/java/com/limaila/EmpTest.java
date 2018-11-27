package com.limaila;

import com.limaila.emp.entity.Emp;
import com.limaila.emp.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Author: huangxincheng
 * <p>
 * <p>
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class EmpTest {

    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testGetEmpDept() {
        Emp empDept = empMapper.getEmpDept(1);
        log.info("========================" + empDept.getEmpName());
        log.info("=======================" + empDept.getDept());
    }

    @Test
    public void testSelectWhere() {
        Emp emp = new Emp();
        emp.setEmpNo(2);
        emp.setEmpName("emp1");
        List<Emp> emps = empMapper.selectWhere(emp);
        log.info("============================= emps " + emps);
    }

    @Test
    public void testSelectChoose() {
        Emp emp = new Emp();
        emp.setEmpNo(2);
        emp.setEmpName("xx");
        List<Emp> emps = empMapper.selectChoose(emp);
        log.info("============================= emps " + emps);
    }
}
