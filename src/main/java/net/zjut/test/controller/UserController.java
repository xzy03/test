package net.zjut.test.controller;
import lombok.RequiredArgsConstructor;
import net.zjut.test.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;
import net.zjut.test.entity.User;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserMapper userMapper;
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/findAll")
    public List<User> findAllUser() {
        return userMapper.queryAll();
    }
    @PostMapping("/insertRecord")
    public String insertUser(@RequestBody User user) {
        userMapper.insertRecord(user);
        return "插入数据成功！";
    }

    @PostMapping("/updateRecord")
    public String updateUser(@RequestBody User user) {
        userMapper.updateRecordById(user);
        return "更新数据成功！";
    }
}
