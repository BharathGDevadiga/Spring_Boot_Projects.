package com.resources;

import com.beans.Address;
import com.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class SpringConfig {
    @Bean
    public Address CreateAdObj(){
        Address ads=new Address(5,"Udupi",576102);
//        ads.setHouseno(5);
//        ads.setCity("Udupi");
//        ads.setPincode(576102);
        return ads;
    }
    @Bean
    public Student createStObj(){
        Student st=new Student(2601,"ajay",CreateAdObj());
       // st.setRegno(2501);
       // st.setName("Bharath");
       // st.setAddress(CreateAdObj());
        return st;

    }
}
