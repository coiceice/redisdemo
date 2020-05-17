package com.coco.redisdemo.service.impl;

import java.util.List;

import com.coco.redisdemo.mapper.StudentMapper;
import com.coco.redisdemo.model.Student;
import com.coco.redisdemo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("studentService")
public class StudentServiceImpl implements StudentService {
    @Autowired
	private StudentMapper studentMapper;
    @Override
    public List<Student> queryAll() {
        return studentMapper.queryAll();
    }

    @Override
    public Student queryBySno(String sno) {
        // TODO Auto-generated method stub
        return studentMapper.queryById(sno);
    }

    @Override
    public void addStudent(Student student) {
        // TODO Auto-generated method stub
        studentMapper.addStudent(student);
    }
    
}