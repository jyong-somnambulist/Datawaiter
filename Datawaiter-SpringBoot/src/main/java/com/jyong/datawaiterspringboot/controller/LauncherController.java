package com.jyong.datawaiterspringboot.controller;

import com.somnambulistspringboot.entity.StudentModel;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/somnambulist/launcher")
public class LauncherController {


    @GetMapping("/app/runing")
    public ResponseEntity app(){

        return ResponseEntity.ok("The SpringBoot application is runing......");
    }


    @PostMapping("/test/model")
    public ResponseEntity app(@RequestBody  StudentModel studentModel){

        System.out.println("---参数校验----");
        String s = studentModel.toString();
        System.out.println(s);

        return ResponseEntity.ok(s);

    }


}
