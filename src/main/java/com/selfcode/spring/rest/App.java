package com.selfcode.spring.rest;

import com.selfcode.spring.rest.configuration.Config;
import com.selfcode.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Communication communication = context.getBean("communication", Communication.class);
        //Examples
        List<Employee> allEmps = communication.getEmps();
        System.out.println(allEmps);
        Employee employee = communication.getEmp(1);
        System.out.println(employee);
//        Employee emp = new Employee("Some", "Employee", "Software", 1000);
//        communication.saveEmp(emp);
        communication.deleteEmp(7);
    }
}
