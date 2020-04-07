package com.chenpihui.controller;


import com.chenpihui.pojo.entity.Test;
import com.chenpihui.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author ZMT
 * @since 2020-04-07
 */
@Controller
@RequestMapping("/chenpihui/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test")
    public ResponseEntity<?> getlist(){
        List<Test> getlist = testService.getlist();
        return ResponseEntity.ok(getlist);
    }
}

