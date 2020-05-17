package com.coco.redisdemo.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Idcard {
    private String id;
    private String address;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date birthday;
}