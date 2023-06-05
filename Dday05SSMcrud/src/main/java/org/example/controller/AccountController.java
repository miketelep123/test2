package org.example.controller;


import org.example.pojo.Account;
import org.example.service.AccountService;
import org.example.service.Impl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
@RequestMapping("/account")
public class AccountController {

    @Autowired
    //private  AccountService accountService;
    AccountService accountService=new AccountService();


    @GetMapping("/findAll")
    public List<Account> findAll(){
        return accountService.findAll();
    }


}
