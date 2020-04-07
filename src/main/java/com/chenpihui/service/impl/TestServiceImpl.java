package com.chenpihui.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chenpihui.pojo.entity.Test;
import com.chenpihui.dao.TestDao;
import com.chenpihui.service.TestService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ZMT
 * @since 2020-04-07
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestDao, Test> implements TestService {

    @Override
    public List<Test> getlist() {
        QueryWrapper<Test> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(Test::getTest, "1");
        List<Test> list = this.list(wrapper);
        return list;
    }
}
