package com.main;

import com.beans.Student;
import com.resources.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
 public static void main(String[] args){
    ApplicationContext ctx=new AnnotationConfigApplicationContext(SpringConfig.class);
        Student std=(Student) ctx.getBean(Student.class);
        std.display();
    }
}