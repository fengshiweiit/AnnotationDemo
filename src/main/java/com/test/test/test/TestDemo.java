package com.test.test.test;

import com.test.test.annotation.TestAnnotation;

/**
 * Created by fengshiwei on 2018/4/27.
 */
@TestAnnotation
public class TestDemo {

    @TestAnnotation(age = 12)
    private Integer id;

    @TestAnnotation(name = "lisi")
    private String name;

    @TestAnnotation
    public void method(Integer i, String s) {
        System.out.println(i + s);
    }

    public Integer method2() {
        System.out.println(id);
        return id;
    }

    @TestAnnotation
    public void method3() {
        System.out.println("形参为空的方法");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
