package com.ldx.StudentManageSystem.biz;

import com.ldx.StudentManageSystem.entity.Teacher;
import com.ldx.StudentManageSystem.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherBiz {
    @Autowired//spring通过setter给这个属性注入一个对象，
    // 如果属性是接口或抽象类行的，spring会自己去匹配其实现类或子类
    private TeacherMapper teacherMapper;

    public List<Teacher> findAll(){
        return teacherMapper.selectTeachers();
    }

    public Teacher findTeacherById(int tid) {return teacherMapper.selectTeacherById(tid);}
    public void addTeacher(Teacher teacher){
        this.teacherMapper.insertTeacher(teacher);
    }

    public boolean delTeacher(int tid){
        return this.teacherMapper.deleteTeacherById(tid)>0;
    }

    public boolean updateTeacher(Teacher teacher) {
        // 这里需要实现具体的更新逻辑
        return this.teacherMapper.updateTeacher(teacher) > 0;}

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }
}