package com.ldx.StudentManageSystem.controller;

import com.ldx.StudentManageSystem.biz.StudentBiz;
import com.ldx.StudentManageSystem.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class StudentController {
    @Autowired
    private StudentBiz biz;

    @RequestMapping("/student/table")
    public Map findstudents(){
        List<Student> list = biz.findAll();

        Map result = new HashMap<>();
        result.put("isOk",true);
        result.put("msg","查询成功");
        result.put("students",list);
        return result;
    }
    @RequestMapping("/student/add")
    public Map add(Student student){
        this.biz.addStudent(student);
        Map result = new HashMap<>();
        result.put("isOk",true);
        result.put("msg","添加成功");
        return result;
    }
    @RequestMapping("/student/del")
    public Map del(int id){

        Map result = new HashMap<>();
        if(this.biz.delStudent(id)){
            result.put("isOk",true);
            result.put("msg","删除成功");
        }else{
            result.put("isOk",false);
            result.put("msg","删除失败");
        }

        return result;
    }
    @RequestMapping("/student/update")
    public Map updateStudent(Student student) {
        Map result = new HashMap<>();
        if (this.biz.updateStudent(student)) {
            result.put("isOk", true);
            result.put("msg", "更新成功");
        } else {
            result.put("isOk", false);
            result.put("msg", "更新失败");
        }
        return result;
    }
    public void setStudentBiz(StudentBiz biz) {
        this.biz = biz;
    }
}