package com.geekster.UserManagementSystem_II.Service;

import com.geekster.UserManagementSystem_II.Model.User;
import com.geekster.UserManagementSystem_II.Repositary.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;


    public List<User> getAllUser() {
        return userDao.fetchAll();
    }

    public User getUserById(String id) {
        return userDao.getById(id);
    }

    public String addUser(User user) {
        if (userDao.save(user)){
            return "user with "+user.getUserId()+" added successfully ...!!!";
        }
        return user.getUserId() + " is already present in the system. Try using another ID";
    }

    public String removeById(String id) {
        if (userDao.remove(id)){
            return "User with " + id + " deleted successfully..!!";
        }
        return "Cannot find user with userId : " + id;
    }

    public String updateUser(String id, User user) {
        if (userDao.update(id,user)){
            return "User with " + id + "  updated !!!";
        }
        return "Cannot find user with userId : " + id;
    }
}
