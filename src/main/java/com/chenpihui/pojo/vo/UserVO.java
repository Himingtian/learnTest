package com.chenpihui.pojo.vo;

import lombok.Data;

import java.util.List;

@Data
public class UserVO {

    private String token;

    private String name;

    private String userId;

    private List<String> access;

    private String acatar;


    /**name: 'admin',
     user_id: '2',
     access: ['admin'],
     token: 'admin',
     avatar: 'https://avatars0.githubusercontent.com/u/20942571?s=460&v=4'**/
}
