package com.xiaojia.springboot.mappers;

import com.xiaojia.springboot.entity.Person;
import com.xiaojia.springboot.enums.SexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by jialihan on 17/6/23.
 */

@Mapper
public interface PersonMapper {


    @Select("SELECT * FROM persons")
    @Results({
            @Result(property = "person_sex",  column = "person_sex", javaType = SexEnum.class),
            @Result(property = "name", column = "name")
    })
    List<Person> getAll();

    @Select("SELECT * FROM persons WHERE id = #{id}")
    @Results({
            @Result(property = "person_sex",  column = "person_sex", javaType = SexEnum.class),
            @Result(property = "name", column = "name")
    })
    Person getOne(int id);

    @Insert("INSERT INTO persons(id,name,password,person_sex) VALUES(#{id}, #{name}, #{password}, #{person_sex})")
    void insert(@Param("id") int id, @Param("name") String name, @Param("password") String password, @Param("person_sex") Enum sex);

//    @Update("UPDATE persons SET name=#{name},password=#{password}} WHERE id =#{id}")
//    void update(Person user);

    @Delete("DELETE FROM persons WHERE id =#{id}")
    void delete(@Param("id") int id);



}
