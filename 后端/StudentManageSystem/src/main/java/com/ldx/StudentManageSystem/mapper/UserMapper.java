package com.ldx.StudentManageSystem.mapper;

import com.ldx.StudentManageSystem.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (id, name, pwd, type, birth) VALUES (#{id}, #{name},#{pwd}, #{type}, #{birth})")
    void insertUser(User user);

  @Select("SELECT * FROM user WHERE id=#{id}")
  User selectUserById(int id);

    @Update("update user set name=#{name}, pwd=#{pwd}, type=#{type}, birth=#{birth} where id=#{id}")//where id=#{id}
    int updateUser(User user);
}