package com.ujy.service;

import com.ujy.bean.User;
import com.ujy.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao ud;

    @Override
    public void add(User user) {
        ud.save(user);
    }

    @Override
    public void update(User user) {
        ud.saveAndFlush(user);
    }

    @Override
    public void delete(Long id) {
        ud.deleteById(id);
    }

    @Override
    public User findOne(Long id) {
        Optional<User> optional = ud.findById(id);
        if (optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return ud.findAll();
    }
}
