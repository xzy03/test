package net.zjut.test.controller;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import net.zjut.test.mapper.UserMapper;
import org.springframework.web.bind.annotation.*;
import net.zjut.test.entity.User;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@Tag(name = "用户管理", description = "用户相关的 API")
public class UserController {
    private final UserMapper userMapper;
    @GetMapping("/hello")
    @Operation(summary = "hello", description = "返回Hello World!")
    public String hello() {
        return "Hello World!";
    }
    @GetMapping("/findAll")
    @Operation(summary = "查询所有用户", description = "查询所有用户信息")
    public List<User> findAllUser() {
        return userMapper.queryAll();
    }
    @PostMapping("/insertRecord")
    @Operation(summary = "插入用户", description = "插入用户信息")
    public String insertUser(@RequestBody User user) {
        userMapper.insertRecord(user);
        return "插入数据成功！";
    }

    @PostMapping("/updateRecord")
    @Operation(summary = "更新用户", description = "更新用户信息")
    public String updateUser(@RequestBody User user) {
        userMapper.updateRecordById(user);
        return "更新数据成功！";
    }
}
