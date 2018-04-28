package com.test.test.annotation;

import java.lang.annotation.*;

/**
 * Created by fengshiwei on 2018/4/26.
 */
@Retention(RetentionPolicy.RUNTIME)//运行时才能加载的注解
@Inherited//表明被TestAnnotation修饰的类在这个类的子类中也起作用
@Documented
@Target(value = {ElementType.FIELD, ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER})//表明该注解可以申明的位置
public @interface TestAnnotation {

    public String name() default "zhangsan";

    public int age() default 123;
}
