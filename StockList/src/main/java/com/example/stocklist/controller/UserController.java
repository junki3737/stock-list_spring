package com.example.stocklist.controller;

import com.example.stocklist.model.User;
import com.example.stocklist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserService service;

  @PostMapping // 新規作成 create
  public User createUser(@RequestBody User user) {
    user = service.create(user);
    return user;
  }

  @PutMapping("{id}") // 更新 update
  public User updateUser(@PathVariable Integer id, @RequestBody User user){
    user = service.update(id,user);
    return user;
  }
  
  @GetMapping // 全件取得  index 
  public List<User> getAllUsers() {
    return service.index();
  }

  @GetMapping("{id}") // 1件取得  show
  public User getUser(@PathVariable Integer id){
    return service.show(id);
  }

  @DeleteMapping("{id}")  // 1件削除 delete
  public User deleteUser(@PathVariable Integer id){
    return service.delete(id);
  }
}
