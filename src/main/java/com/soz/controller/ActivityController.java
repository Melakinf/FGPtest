package com.soz.controller;

import com.soz.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @RequestMapping("/activity")
    public String show(Model model){
        List<String> title = activityService.showTitle();
        model.addAttribute("title",title);
        return "activity";
    }

    @RequestMapping("/xiangxi")
    public String xiangsi(){
        return "xiangxi";
    }

    @RequestMapping("/publish")
    public String publish(){
        return "publish";
    }

    @RequestMapping("/test")
    public String test(Model model){
        List<String > list = new ArrayList<>();
        list.add("hhh");
        list.add("sss");
        model.addAttribute("list",list);
        return "test";
    }

}
