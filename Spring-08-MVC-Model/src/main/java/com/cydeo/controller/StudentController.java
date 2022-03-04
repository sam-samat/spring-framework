package com.cydeo.controller;

import com.cydeo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homePage(Model model){

        model.addAttribute("name", "Cydeo");
        model.addAttribute("course", "MVC");

        String subject = "Collection";
        model.addAttribute("subject",subject);

        int  studentID = new Random().nextInt();
        model.addAttribute("studentId",studentID);

        List<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        model.addAttribute("numbers",numbers);

        Student student = new Student("Mike", "Smith", 2);
        model.addAttribute("student",student);


        return "student/welcome";
    }
}
