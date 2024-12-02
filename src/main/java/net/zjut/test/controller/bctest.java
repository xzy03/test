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

    public String updateUser() {
        return "fuck";
    }
}
