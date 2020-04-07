package com.chenpihui.service;

import com.chenpihui.pojo.entity.Test;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ZMT
 * @since 2020-04-07
 */
public interface TestService extends IService<Test> {

    List<Test> getlist();
}
