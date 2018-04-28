package com.test.test;

import com.test.test.annotation.TestAnnotation;
import com.test.test.test.TestDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
//		Class<TestDemo> testDemoClass = TestDemo.class;
//		try {
//			TestDemo testDemo = testDemoClass.newInstance();
//			//判断类上有没有这个注解
//			boolean annotationPresent = testDemoClass.isAnnotationPresent(TestAnnotation.class);
//			if (annotationPresent){
//				Method[] declaredMethods = testDemoClass.getDeclaredMethods();
//				for (Method declaredMethod : declaredMethods) {
//					if (declaredMethod.isAnnotationPresent(TestAnnotation.class)){
//						TestAnnotation annotation = declaredMethod.getAnnotation(TestAnnotation.class);
//						int age = annotation.age();
//						String name = annotation.name();
//						System.out.println(age +"========================"+ name);
//					}
//				}
//			}
//			//获得这个类的所有属性
//			Field[] declaredFields = testDemoClass.getDeclaredFields();
//			for (Field declaredField : declaredFields) {
//                TestAnnotation annotation = declaredField.getAnnotation(TestAnnotation.class);
//                String name = annotation.name();
//                int age = annotation.age();
//                declaredField.setAccessible(true);
//                Type genericType = declaredField.getGenericType();
//				String type = genericType.toString();
//				if (type.equals("class java.lang.Integer")){
//                    declaredField.set(testDemo, age);
//                }else if (type.equals("class java.lang.String")){
//                    declaredField.set(testDemo, name);
//                }else {
//                	return;
//				}
//            }
//			Integer integer = testDemo.method2();
//			System.out.println(integer);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		//执行带有TestAnnotation的方法
		try {
			Class<TestDemo> testDemoClass = TestDemo.class;
			Method[] declaredMethods = testDemoClass.getDeclaredMethods();
			for (Method declaredMethod : declaredMethods) {
                TestAnnotation annotation = declaredMethod.getAnnotation(TestAnnotation.class);
                if (annotation != null){
					int parameterCount = declaredMethod.getParameterCount();
					if (parameterCount == 2){
						declaredMethod.invoke(testDemoClass.newInstance(),1, "2");
					}else {
						declaredMethod.invoke(testDemoClass.newInstance(), null);
					}
                }
            }
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
