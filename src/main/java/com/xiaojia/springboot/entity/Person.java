package com.xiaojia.springboot.entity;

import com.xiaojia.springboot.enums.SexEnum;

import java.io.Serializable;

/**
 * Created by jialihan on 17/6/23.
 */

public class Person implements Serializable{


    private static final long serialVersionUID = -8910833314644315931L;
    private int id;
    private String name;
    private String password;
    private SexEnum sex;

    // constructor
    public Person(int id)
    {
        this.id = id;
    }

    public Person(int id, String name, String password)
    {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Person(String name, String password, SexEnum sex)
    {

        this.name = name;
        this.password = password;
        this.sex = sex;
    }

    // getter & setter

    public int getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }
    public SexEnum getSex()
    {
        return sex;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public void setSex(SexEnum sex)
    {
        this.sex = sex;
    }

    @Override
    public String toString()
    {
        return "name:"+ this.name+", password:"+this.password+", sex:"+this.sex.name();
    }


}
