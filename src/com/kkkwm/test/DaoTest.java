package com.kkkwm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kkkwm.dao.AdminDao;



public class DaoTest {
    ApplicationContext context = null;
     
    @Before
    public void init(){
        context = new ClassPathXmlApplicationContext("classpath:spring/application-dao.xml");
    }
     
    @Test
    public void testSelectByPrimaryKey(){
        AdminDao adminDao = (AdminDao) context.getBean("adminMapper");
//        Admin admin = adminDao.selectByPrimaryKey(1);
        System.out.println(adminDao);
    }
     
}