package com.coco.redisdemo.service;

import java.util.List;

import com.coco.redisdemo.model.Student;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

//@CacheConfig(cacheNames = "student")
public interface StudentService {
    //@Cacheable
    List<Student> queryAll();
  //  @Cacheable(key = "#p0")
    Student queryBySno(String sno);
  //  @CachePut(key ="#p0.sno" )
    void addStudent(Student student);
}