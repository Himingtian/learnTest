package com.chenpihui.controller;


import com.chenpihui.pojo.vo.UserVO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping("/test")
public class Test {


    @GetMapping("/getTest")
    public ResponseEntity<?> getTest(){

        UserVO userVO = new UserVO();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("admin");
        userVO.setToken("admin");
        userVO.setName("admin");
        userVO.setAccess(strings);
        userVO.setAcatar("https://avatars0.githubusercontent.com/u/20942571?s=460&v=4");
        return ResponseEntity.ok(userVO);
    }

    @GetMapping("/getInfo")
    public ResponseEntity<?> getInfo(){

        UserVO userVO = new UserVO();
        ArrayList<String> strings = new ArrayList<>();
        strings.add("admin");
        userVO.setToken("admin");
        userVO.setName("admin");
        userVO.setAccess(strings);
        userVO.setAcatar("https://file.iviewui.com/dist/a0e88e83800f138b94d2414621bd9704.png");
        return ResponseEntity.ok(userVO);
    }
}
