package com.org.Test;

import com.org.Service.Service;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author HP
 * @Date 2021/11/13 22:06
 * @Version 1.0
 * 其它事与我无关，多看一眼都是愚蠢的。
 * 享有特权而没有力量的人是废物，
 * 受过教育而无影响力的人是一堆一文不值的垃圾。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class AopTest {
    @Autowired
    private Service service;
    @Test
    public void Test(){
        service.SelectById();
    }
}
