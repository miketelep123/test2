package org.example.service.Impl;

import org.example.dao.AccountDao;
import org.example.pojo.Account;
import org.example.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {


   AccountDao accountDao= new AccountDao(){
       public List<Account> findAll() {
           return null;
       }
   };
       public List<Account> findAll() {
           return accountDao.findAll();
       }

    }

}
