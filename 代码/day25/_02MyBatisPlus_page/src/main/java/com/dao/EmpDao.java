package com.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pojo.Emp;
import org.apache.ibatis.annotations.Mapper;


@Mapper  //等价于 @MapperScan
//@Repository  //把我们的Dao层加入到容器中?
 //报错的原因:  容器中--->实例化  接口是不能直接加入到容器中
 // bean加入容器---->Mybatis
public interface EmpDao extends BaseMapper<Emp> {
}
