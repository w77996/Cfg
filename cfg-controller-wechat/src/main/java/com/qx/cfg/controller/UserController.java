package com.qx.cfg.controller;

import java.util.List;




import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qx.cfg.bean.User;
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
        List<User> userList = userService.getAllUser();
        log.error(" "+userList.size());
        model.addAttribute("userList",userList);
        return "showUser";
    }
    
    @RequestMapping("/index")
    public String showIndex(Model model){
       
        return "index";
    }
}