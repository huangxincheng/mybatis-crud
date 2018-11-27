package com.limaila;

import com.limaila.emp.entity.Emp;
import com.limaila.emp.mapper.EmpMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
}
