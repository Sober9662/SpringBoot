package com.springboot.chapter211;

import com.springboot.chapter211.domain.General;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Chapter211ApplicationTests {
    private static final Log log = LogFactory.getLog(Chapter211ApplicationTests.class);

    @Autowired
    private General general;

    @Test
    public void contextLoads() {
        Assert.assertEquals(general.getName(), "test1");
        Assert.assertEquals(general.getTitle(), "SpringBoot");

        log.info("随机数：--->>>");
        log.info("string：--->>> "+general.getString1());
        log.info("int：--->>> "+general.getInt1());
        log.info("long：--->>>"+general.getLong1());
        log.info("<10：--->>>"+general.getInt10());
        log.info("10-20int：--->>>"+general.getInt10_20());
    }

}
