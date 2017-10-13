package com.cursospringavanzado.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospringavanzado.spring.factory.MailConfigBean;

import org.junit.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class MailConfigFactoryXmlTest {
    @Autowired
    private MailConfigBean mailDev;
 
    @Test
    public void testConstructMailConfigByXml() {
        Assert.assertEquals(mailDev.getUsername(), "test@gmail.com");
    }
}