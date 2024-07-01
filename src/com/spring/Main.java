package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        final Employee employee = (Employee) ac.getBean("employee");
        employee.setId(1022);
        employee.setSalary(5000);
        employee.setName("John Doe");
        employee.info();
        ac.close();
    }
}
