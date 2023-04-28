package com.geekster.UserManagementSystem_II.Repositary;

import com.geekster.UserManagementSystem_II.Model.User;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static com.fasterxml.jackson.databind.deser.std.DateDeserializers.find;

@Repository
public class UserDao {
    private List<User> userList;

    public UserDao() {
        userList = new ArrayList<>();
        userList.add(new User("1", "1st_User", "01-01-2023", "!st.@mail.com", "1122334455", LocalDate.now(), LocalTime.now()));

    }


    public List<User> fetchAll() {

        return userList;
    }

    public User getById(String id) {
        for (User user : userList) {
            if (user.getUserId().equals(id)) return user;
        }
        return null;
    }

    public boolean save(User user) {
        if (find(user.getUserId())) return false;
        else {
            userList.add(user);
            return true;
        }
    }

    private boolean find(String id) {
        for (User user : userList){
            if(user.getUserId().equals(id)) return true;
        }
        return false;
    }

    public boolean remove(String id) {
        if (find(id)){
            User temp=getById(id);
            userList.remove(temp);
            return true;
        }
        return false;
    }

    public boolean update(String id, User user) {
        if (find(id)){
            User temp=getById(id);
            temp.setUserId(user.getUserId());
            temp.setDate(user.getDate());
            temp.setTime(user.getTime());
            temp.setEmail(user.getEmail());
            temp.setDateOfBirth(user.getDateOfBirth());
            temp.setPhoneNumber(user.getPhoneNumber());

            return true;
        }
        return false;
    }
}