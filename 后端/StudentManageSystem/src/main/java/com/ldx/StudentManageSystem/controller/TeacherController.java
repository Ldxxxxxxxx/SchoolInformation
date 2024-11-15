package com.ldx.StudentManageSystem.controller;

import com.ldx.StudentManageSystem.biz.TeacherBiz;
import com.ldx.StudentManageSystem.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin(origins = "http://localhost:9000")
@RestController
public class TeacherController {
    @Autowired
    private TeacherBiz biz;

    @RequestMapping("/teacher/table")
    public Map findteachers(){
        List<Teacher> list = biz.findAll();

        Map result = new HashMap<>();
        result.put("isOk",true);
        result.put("msg","查询成功");
        result.put("teachers",list);
        return result;
    }
    @RequestMapping("/teacher/add")
    public Map add(Teacher teacher){
        this.biz.addTeacher(teacher);
        Map result = new HashMap<>();
        result.put("isOk",true);
        result.put("msg","添加成功");
        return result;
    }
    @RequestMapping("/teacher/del")
    public Map del(int tid){

        Map result = new HashMap<>();
        if(this.biz.delTeacher(tid)){
            result.put("isOk",true);
            result.put("msg","删除成功");
        }else{
            result.put("isOk",false);
            result.put("msg","删除失败");
        }

        return result;
    }
    @RequestMapping("/teacher/update")
    public Map updateTeacher(Teacher teacher) {
        Map result = new HashMap<>();
        if (this.biz.updateTeacher(teacher)) {
            result.put("isOk", true);
            result.put("msg", "更新成功");
        } else {
            result.put("isOk", false);
            result.put("msg", "更新失败");
        }
        return result;
    }
    public void setTeacherBiz(TeacherBiz biz) {
        this.biz = biz;
    }
}