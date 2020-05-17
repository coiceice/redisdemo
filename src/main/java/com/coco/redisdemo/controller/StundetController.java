package com.coco.redisdemo.controller;

import java.util.List;

import com.coco.redisdemo.model.Student;
import com.coco.redisdemo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StundetController {

   // @Autowired
   // private CacheManager cacheManager;
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> query(){
        return studentService.queryAll();
    }
    @GetMapping("/{sno}")
    public Student queryBySno(@PathVariable String sno){
        return studentService.queryBySno(sno);
    }
    @PostMapping
    public void addStudent(Student student){
        studentService.addStudent(student);
    }
    @RequestMapping("/clearCahce")
    public void clearCache(){
     //   for(String name : cacheManager.getCacheNames() )
     //   {
    //        cacheManager.getCache(name).clear();
     //   }
    }
}