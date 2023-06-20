package com.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
//Mybatis   springDataJPA     ORM
@Data
//@TableName("")
public class Emp {
    private Integer id;
    @TableField(value = "type",select = false)
    private String typexxx;
    private String name;
    private String sex;
    @TableField(exist = false) //表示这个字段不参数curd
    private Date entrytime;
   private String description;
}
