package com.example.market.controller;

import com.example.market.model.User;
import com.example.market.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("main")
    public String main(){
        return "main";
    }

    @RequestMapping("user_management")
    public String user_management(Model model){
        List<Map<String,Object>> userList=userService.findAll();
        model.addAttribute("userList",userList);
        return "User_management";
    }

    @RequestMapping("deluser")
    public String deluser(String id,Model model){
        userService.deluser(id);
       return "redirect:/user/user_management";
    }

    @RequestMapping("user_edit")
    public String findUser(String id,Model model){
        model.addAttribute("user",userService.findUser(id));
        return "user_management_edit";
    }
}
