package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.pojo.Account;

import java.util.List;

public interface AccountDao {


    @Select("select * from account")
    public List<Account> findAll();
}
