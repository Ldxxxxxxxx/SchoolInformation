package com.ldx.StudentManageSystem.biz;

import com.ldx.StudentManageSystem.entity.Student;
import com.ldx.StudentManageSystem.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentBiz {
    @Autowired//spring通过setter给这个属性注入一个对象，
    // 如果属性是接口或抽象类行的，spring会自己去匹配其实现类或子类
    private StudentMapper studentMapper;

    public List<Student> findAll(){
        return studentMapper.selectStudents();
    }

    public Student findStudentById(int id) {return studentMapper.selectStudentById(id);}
    public void addStudent(Student student){
        this.studentMapper.insertStudent(student);
    }

    public boolean delStudent(int id){
        return this.studentMapper.deleteStudentById(id)>0;
    }

    public boolean updateStudent(Student student) {
        // 这里需要实现具体的更新逻辑
        return this.studentMapper.updateStudent(student) > 0;}

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }
}