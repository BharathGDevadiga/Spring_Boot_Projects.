package com.SpringBootIntro.Controller;

import com.SpringBootIntro.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController


public class StudentController {
    @GetMapping("/")
    public String Hello(){
        return "Violence,Violence,Violence, ... I avoided, but violence likes me";
    }
    @GetMapping("/Student")
    public StudentDto getStudent(){
        return new StudentDto(10,"bharath","devadigabharath8@gmail.com");
    }
}
