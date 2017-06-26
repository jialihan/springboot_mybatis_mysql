package com.xiaojia.springboot.mapper;

import com.xiaojia.springboot.entity.Person;
import com.xiaojia.springboot.enums.SexEnum;
import com.xiaojia.springboot.mappers.PersonMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by jialihan on 17/6/23.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTest {


    @Autowired
    private PersonMapper personMapper;



    @Test
    public void testInsert() throws Exception {

        personMapper.insert(1,"jelly", "111111",SexEnum.FEMALE);
        personMapper.insert(2,"tracy", "222222", SexEnum.MALE);
        Assert.assertEquals(2, personMapper.getAll().size());
    }

    @Test
    public void testQuery() throws Exception {
        List<Person> users = personMapper.getAll();
        System.out.println(users.toString());
    }





}
