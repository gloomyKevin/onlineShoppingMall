package com.example.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @RequestMapping("top")
    public String top(){
        return  "top";
    }

    @RequestMapping("left")
    public String left(){
        return "left";
    }

    @RequestMapping("index")
    public  String index(){
        return "index";
    }

    @RequestMapping("download")
    public String download(){
        return "Download";
    }



    @RequestMapping("Home")
    public String home(){
        return "Home";
    }

    @RequestMapping("download_bookadd")
    public String download_bookadd(){
        return "download_bookadd";
    }

    @RequestMapping("download_bookedit")
    public String download_bookedit(){
        return "download_bookedit";
    }

    @RequestMapping("home_add")
    public String home_add(){
        return "home_add";
    }

    @RequestMapping("home_edit")
    public String home_edit(){
        return "home_edit";
    }

    @RequestMapping("user_management_add")
    public String user_management_add(){
        return "user_management_add";
    }

}
