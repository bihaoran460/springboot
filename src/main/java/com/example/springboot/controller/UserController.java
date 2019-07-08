package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/getOne")
    public Optional<User> getOneUserById(@RequestParam long id) {
        return userRepository.findById(id);
    }
    @GetMapping("/all")
    public Iterable<User> getAllUsers(@RequestParam(value = "page", defaultValue = "0") int page,
                                      @RequestParam(value = "size", defaultValue = "5") int size) {
        page = page < 0 ? 0 : page;// 如果page为负数则修改为0，防止在首页点击上一页发生错误
        Sort sort = new Sort(Sort.Direction.DESC, "id");// 按id倒叙排列
        return userRepository.findAll(new PageRequest(page, size, sort));
    }

    @PostMapping("/add")
    public String addUser(@RequestParam String username,
                          @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        userRepository.save(user);// 注意这里是save
        return "Saved";
    }

    @DeleteMapping("/delete")
    public String deleteUserById(@RequestParam long id) {
        userRepository.deleteById(id);
        return "Deleted";
    }

    @PutMapping("/update")
    public String updateUser(User user) {
//        User user = new User();
//        user.setId(id);
//        user.setUsername(username);
//        user.setPassword(password);
        userRepository.save(user);
        return "Updated";
    }
}

