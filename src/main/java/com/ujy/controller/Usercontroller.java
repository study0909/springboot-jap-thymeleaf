package com.ujy.controller;

import com.ujy.bean.User;
import com.ujy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Usercontroller {
    @Autowired
    UserService us;

    @GetMapping("/")
    public String findAll(Model m){
        List<User> all = us.findAll();
        m.addAttribute("all", all);
        return "list";
    }

    /*添加页面*/
    @RequestMapping("/toAdd")
    public String toAdd(){
        return "add";
    }

    /*点击保存*/
    @PostMapping("/add")
    public String add(User user){
        us.add(user);
        return "redirect:/";
    }

    /*跳转到编辑页面*/
    @RequestMapping("/toEdit/{id}")
    public String toEdit(@PathVariable("id") Long id, Model m){
        User user = us.findOne(id);
        m.addAttribute("user", user);
        return "edit";
    }

    /*保存修改数据*/
    @PostMapping("/update")
    public String update(User user){
        us.update(user);
        return "redirect:/";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id){
        us.delete(id);
        return "redirect:/";
    }
}
