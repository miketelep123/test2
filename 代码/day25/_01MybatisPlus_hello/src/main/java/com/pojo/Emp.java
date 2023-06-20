package com.pojo;

import lombok.Data;
import net.sf.jsqlparser.expression.DateTimeLiteralExpression;

import java.sql.Date;
//Mybatis   springDataJPA     ORM
@Data
public class Emp {
    private Integer id;
    private String type;
    private String name;
    private String sex;
    private DateTimeLiteralExpression.DateTime entry_time;
   private String description;
}
