package com.qx.cfg.controller;






import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qx.cfg.pojo.User;
import com.qx.cfg.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(Model model){
        log.info("查询所有用户信息");
        User userList = userService.selectByPrimaryKey(1);
        log.error(" "+userList.getUserName());
       // model.addAttribute("userList",userList);
        return "showUser";
    }
    
    @RequestMapping("/index")
    public String showIndex(Model model){
       
        return "index";
    }
    
    @RequestMapping("/show")
    public void show(){
        log.info("查询所有用户信息");
        User userList = userService.selectByPrimaryKey(1);
        log.error(" "+userList.getUserName());
        System.out.println(userList.getUserName());
       // model.addAttribute("userList",userList);
      
    }
}