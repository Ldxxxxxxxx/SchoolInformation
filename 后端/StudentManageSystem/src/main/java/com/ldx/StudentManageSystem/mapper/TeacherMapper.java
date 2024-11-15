package com.ldx.StudentManageSystem.mapper;

import com.ldx.StudentManageSystem.entity.Teacher;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface TeacherMapper {
    @Select("select * from t_teachers")
    List<Teacher> selectTeachers();
    @Select("select * from t_teachers where tid=#{tid}")
    Teacher selectTeacherById(int tid);
    @Insert("insert into t_teachers values(#{tid},#{tname},#{tage},#{tgender})")
    void insertTeacher(Teacher teacher);
    @Delete("delete from t_teachers where tid=#{tid}")
    int deleteTeacherById(int tid);
    @Update("update t_teachers set tname=#{tname}, tage=#{tage}, tgender=#{tgender} where tid=#{tid}")//where tid=#{tid}
    int updateTeacher(Teacher teacher);
}