package net.zjut.test.mapper;

import net.zjut.test.entity.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserMapper {
    @Select("select * from user")
    List<User> queryAll();
    @Update("insert into user(name, age,grade) values(#{name}, #{age}, #{grade})")
    @Transactional
    void insertRecord(User user);

    @Update("update user set name=#{name}, age=#{age}, grade=#{grade} where id=#{id}")
    @Transactional
    void updateRecordById(User user);
}
