package com.ldx.StudentManageSystem.biz;

import com.ldx.StudentManageSystem.entity.User;
import com.ldx.StudentManageSystem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBiz {

    @Autowired
    private UserMapper userMapper;

    public void registerUser(User user) {
        this.userMapper.insertUser(user);
    }

   public User findUser(User user) {
       return userMapper.selectUserById(user.getId());
   }
    public boolean updateUser(User user) {
        // 这里需要实现具体的更新逻辑
        return this.userMapper.updateUser(user) > 0;}

}