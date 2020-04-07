package com.chenpihui.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author ZMT
 * @since 2020-04-07
 */
public class Test extends Model<Test> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private String id;

    private String testOne;

    private String testTwo;

    private String test;


    public String getId() {
        return id;
    }

    public Test setId(String id) {
        this.id = id;
        return this;
    }

    public String getTestOne() {
        return testOne;
    }

    public Test setTestOne(String testOne) {
        this.testOne = testOne;
        return this;
    }

    public String getTestTwo() {
        return testTwo;
    }

    public Test setTestTwo(String testTwo) {
        this.testTwo = testTwo;
        return this;
    }

    public String getTest() {
        return test;
    }

    public Test setTest(String test) {
        this.test = test;
        return this;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Test{" +
        "id=" + id +
        ", testOne=" + testOne +
        ", testTwo=" + testTwo +
        ", test=" + test +
        "}";
    }
}
