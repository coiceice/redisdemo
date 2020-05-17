package com.coco.redisdemo.mapper;

import java.util.List;

import com.coco.redisdemo.model.Student;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.cache.annotation.CacheConfig;

@Mapper
//@CacheConfig(cacheNames = "student")
public interface StudentMapper {
    @Select("select * from student")
    @Results({
        @Result(property = "sno",column = "sno"),
        @Result(property = "sname",column = "sname"),
        @Result(property = "ssex",column = "ssex")
    })
    public List<Student> queryAll();

    @Select("select * from student where sno= #{sno}")
    @Results({
        @Result(property = "sno",column = "sno"),
        @Result(property = "sname",column = "sname"),
        @Result(property = "ssex",column = "ssex"),
        @Result(property = "idcard",column ="sno",one = @One(select="com.coco.redisdemo.mapper.IdcardMapper.queryBySno"))
    })
    public Student queryById(String sno);

    @Insert("insert into student values(#{sno},#{sname},#{ssex}) ")
    public void addStudent(Student student);

    @Delete("delete from student where sno=#{sno}")
    public void deleteStudent(String sno);


}