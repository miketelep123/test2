package com.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.apache.ibatis.type.JdbcType;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.text.Format;

@Data
public class Emp {
    @TableId(type = IdType.AUTO)
    private Integer id;//员工的ID
    private String type; //员工的类型
    private String name; //员工的姓名
    private String sex; //员工的性别

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "entry_time",jdbcType = JdbcType.TIMESTAMP)
    private Date entrytime; //入职之时间
    private String description;//描述

}
