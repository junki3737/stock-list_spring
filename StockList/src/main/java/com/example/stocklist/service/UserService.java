package com.example.stocklist.service;

import com.example.stocklist.model.User;
import com.example.stocklist.repository.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
  @Autowired
  private UserRepository repository;

  public User create(User user){
    return repository.save(user);
  }

  public User update(Integer id, User user){
    user.setId(id);
    return repository.save(user);
  }
  
  public List<User> index(){
    return repository.findAll();
  }

  public User show(Integer id){
    return repository.findById(id).get();
  }

  public User delete(Integer id){
    User user = repository.findById(id).get();
    user.setDiscardedAt(new Date());
    repository.save(user);
    return user;
  }
}
