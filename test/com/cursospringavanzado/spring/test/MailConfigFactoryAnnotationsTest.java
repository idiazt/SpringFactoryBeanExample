package com.cursospringavanzado.spring.test;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cursospringavanzado.spring.annotations.factory.MailConfigAnnotationsAppConfiguration;
import com.cursospringavanzado.spring.factory.MailConfigBean;
import com.cursospringavanzado.spring.factory.MailConfigFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MailConfigAnnotationsAppConfiguration.class)
public class MailConfigFactoryAnnotationsTest {
 
    @Autowired
    private MailConfigBean mailConfigBean;
  
    @Resource(name = "&mailConfigDevAnnotations")
    private MailConfigFactory mailConfigFactory;
 
    @Test
    public void testConstructMailConfigByJava() {
        Assert.assertEquals(mailConfigBean.getUsername(), "test@gmail.com");
        Assert.assertEquals(mailConfigFactory.getAccountName(), "dev");
    }
}