package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpDao extends BaseMapper<Emp>{

}
