package com.coco.redisdemo.mapper;

import com.coco.redisdemo.model.Idcard;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IdcardMapper {
    @Select("select * from idcard where id=#{id}")
    public Idcard queryBySno(String id);

}