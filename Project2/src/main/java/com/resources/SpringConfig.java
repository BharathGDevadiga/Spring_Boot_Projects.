package com.resources;

import com.beans.Address;
import com.beans.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration


public class SpringConfig {
    @Bean
    public Address CreateAdObj(){
        Address ads=new Address();
        ads.setHouseno(5);
        ads.setCity("Udupi");
        ads.setPincode(576102);
        return ads;
    }
    @Bean
    public Student createStObj(){
        Student st=new Student();
        st.setRegno(2501);
        st.setName("Bharath");
        st.setAddress(CreateAdObj());
        return st;

    }
}
