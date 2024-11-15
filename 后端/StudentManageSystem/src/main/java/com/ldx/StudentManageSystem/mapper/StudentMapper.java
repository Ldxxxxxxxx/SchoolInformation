package com.ldx.StudentManageSystem.mapper;

import com.ldx.StudentManageSystem.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;
@Mapper
public interface StudentMapper {
    @Select("select * from t_students")
    List<Student> selectStudents();
    @Select("select * from t_students where id=#{id}")
    Student selectStudentById(int id);
    @Insert("insert into t_students values(#{id},#{name},#{age},#{gender})")
    void insertStudent(Student student);
    @Delete("delete from t_students where id=#{id}")
    int deleteStudentById(int id);
    @Update("update t_students set name=#{name}, age=#{age}, gender=#{gender} where id=#{id}")//where id=#{id}
    int updateStudent(Student student);
}