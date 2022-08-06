package com.example.stocklist.controller;

import com.example.stocklist.model.User;
import com.example.stocklist.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Date;

@RestController
@RequestMapping("/user")
public class UserController {
  @Autowired
  private UserRepository repository;

  @PostMapping // 新規作成 create
  public User createUser(@RequestBody User user) {
    return repository.save(user);
  }
  @PutMapping("{id}") // 更新 update
  public User updateUser(@PathVariable Integer id, @RequestBody User user){
    user.setId(id);
    return repository.save(user);
  }
  
  @GetMapping // 全件取得  index 
  public List<User> getAllUsers() {
    return repository.findAll();
  }

  @GetMapping("{id}") // 1件取得  show
  public User getUser(@PathVariable Integer id){
    return repository.findById(id).get();
  }

  @DeleteMapping("{id}")  // 1件削除 delete
  public User deleteUser(@PathVariable Integer id){
    User user = repository.findById(id).get();
    user.setDiscardedAt(new Date());
    repository.save(user);
    return user;
  }
}
